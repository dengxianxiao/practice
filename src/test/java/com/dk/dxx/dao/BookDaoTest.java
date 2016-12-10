package com.dk.dxx.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dk.dxx.BaseTest;
import com.dk.dxx.entity.Book;

/**
 * BookDao测试用例
 * @author dxx
 *
 */
public class BookDaoTest extends BaseTest {
	
	@Autowired
	private BookDao bookDao;
	
	/**
	 * 测试queryById方法
	 */
	@Test
	public void testQueryById() {
		Long bookId = 1000L;
		Book book = bookDao.queryById(bookId);
		System.out.println(book);
	}
	
	/**
	 * 测试queryAll方法
	 */
	@Test
	public void testQueryAll() {
		List<Book> books = bookDao.queryAll(0, 4);
		for (Book book : books) {
			System.out.println(book);
		}
	}
	
	/**
	 * 测试reduceNumber方法
	 */
	@Test
	public void testReduceNumber() {
		Long bookId = 1000L;
		int update = bookDao.reduceNumber(bookId);
		System.out.println(update);
	}
	
	public static void main(String[] args) {
        // TODO 自动生成的方法存根
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice?useUnicode=true&characterEncoding=utf8","root","123456");
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select * from book");
            while(rs.next()){
                System.out.println(new String(rs.getString(1)) + "::" + new String(rs.getString(2)) + "::" + new String(rs.getString(3)));
            }
        }catch(Exception e){}

    }
}
