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

	//娉ㄥ叆service渚濊禆
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

//	@Transactional
	/**
     * 浣跨敤娉ㄨВ鎺у埗浜嬪姟鏂规硶鐨勪紭鐐癸細 1.寮�彂鍥㈤槦杈炬垚涓�嚧绾﹀畾锛屾槑纭爣娉ㄤ簨鍔℃柟娉曠殑缂栫▼椋庢牸
     * 2.淇濊瘉浜嬪姟鏂规硶鐨勬墽琛屾椂闂村敖鍙兘鐭紝涓嶈绌挎彃鍏朵粬缃戠粶鎿嶄綔锛孯PC/HTTP璇锋眰鎴栬�鍓ョ鍒颁簨鍔℃柟娉曞閮�
     * 3.涓嶆槸鎵�湁鐨勬柟娉曢兘闇�浜嬪姟锛屽鍙湁涓�潯淇敼鎿嶄綔锛屽彧璇绘搷浣滀笉闇�浜嬪姟鎺у埗
     */
	public AppointExecution appointBook(Long bookId, Long studentId) {
		try {
			//鍑忓簱瀛�
			int update = bookDao.reduceNumber(bookId);
			if (update <= 0) {
				//搴撳瓨涓嶈冻
				return new AppointExecution(bookId, AppointStateEnum.NO_NUMBER);
			} else {
				//鎵ц棰勭害鎿嶄綔
				int insert = appointmentDao.insertAppointment(bookId, studentId);
				if (insert <= 0) {
					//閲嶅棰勭害
					return new AppointExecution(bookId, AppointStateEnum.REPEAT_APPOINT);
				} else {
					//棰勭害鎴愬姛
					Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
					return new AppointExecution(bookId, AppointStateEnum.SUCCESS, appointment); 
				}
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			// 鎵�湁缂栬瘧鏈熷紓甯歌浆鎹负杩愯鏈熷紓甯�
			return new AppointExecution(bookId, AppointStateEnum.INNER_ERROR);
		}
	}

	
}
