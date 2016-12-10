package com.dk.dxx.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dk.dxx.dao.AppointmentDao;
import com.dk.dxx.dao.BookDao;
import com.dk.dxx.dto.AppointExecution;
import com.dk.dxx.entity.Appointment;
import com.dk.dxx.entity.Book;
import com.dk.dxx.enums.AppointStateEnum;
import com.dk.dxx.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	private Logger logger = Logger.getLogger(this.getClass());

	//注入service依赖
	@Autowired
	private BookDao bookDao;
	
	@Autowired
	private AppointmentDao appointmentDao;
	
	
	public Book getById(Long bookId) {
		return bookDao.queryById(bookId);
	}

	public List<Book> queryBookList() {
		return bookDao.queryAll(0, 100);
	}

	@Transactional
	/**
     * 使用注解控制事务方法的优点： 1.开发团队达成一致约定，明确标注事务方法的编程风格
     * 2.保证事务方法的执行时间尽可能短，不要穿插其他网络操作，RPC/HTTP请求或者剥离到事务方法外部
     * 3.不是所有的方法都需要事务，如只有一条修改操作，只读操作不需要事务控制
     */
	public AppointExecution appointBook(Long bookId, Long studentId) {
		try {
			//减库存
			int update = bookDao.reduceNumber(bookId);
			if (update <= 0) {
				//库存不足
				return new AppointExecution(bookId, AppointStateEnum.NO_NUMBER);
			} else {
				//执行预约操作
				int insert = appointmentDao.insertAppointment(bookId, studentId);
				if (insert <= 0) {
					//重复预约
					return new AppointExecution(bookId, AppointStateEnum.REPEAT_APPOINT);
				} else {
					//预约成功
					Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
					return new AppointExecution(bookId, AppointStateEnum.SUCCESS, appointment); 
				}
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			// 所有编译期异常转换为运行期异常
			return new AppointExecution(bookId, AppointStateEnum.INNER_ERROR);
		}
	}

}
