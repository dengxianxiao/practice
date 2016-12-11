//package com.dk.dxx.controller;
//
//import java.util.List;
//
//import org.apache.ibatis.annotations.Param;
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.dk.dxx.dto.AppointExecution;
//import com.dk.dxx.dto.Result;
//import com.dk.dxx.entity.Book;
//import com.dk.dxx.service.BookService;
//
//
//@Controller
//@RequestMapping("/book") // url:/妯�?�?璧勬�?{id}/缁嗗�?/seckill/list
//public class BookController {
//	
//	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = {
//	"application/json;charset=utf-8" })
//	public String printHello(Model model) {
//		model.addAttribute("message", "浣犲�?");
//		return "hello";
//	}
//	
//	
//	@Autowired
//	private BookService bookService;
//	
//	
//	/**
//	 * 鏌ヨ鍥句功鍒楄�?
//	 * 
//	 * @param model
//	 * @return
//	 */
//	@RequestMapping(value = "/list", method = RequestMethod.GET)
//	private String list(Model model) {
//		List<Book> list = bookService.queryBookList();
//		model.addAttribute("list", list);
//		// list.jsp + model = ModelAndView
//		return "list";// WEB-INF/jsp/"list".jsp
//	}
//	
//	
//	/**
//	 * 鏌ヨ涓�湰鍥句�?
//	 * 
//	 * @param bookId
//	 * @param model
//	 * @return
//	 */
//	@RequestMapping(value = "/{bookId}/detail", method = RequestMethod.GET)
//	@ResponseBody
//	private String detail(@PathVariable("bookId") Long bookId, Model model) {
//		if (null == bookId) {
//			return "redirect:/book/list";
//		}
//		
//		Book book = bookService.getById(bookId);
//		if (null == book) {
//			return "forward:/book/list";
//		}
//		
//		model.addAttribute("detail", book);
//		return "detail";
//	}
//	
//	
//	/**
//	 * 鍥句功鍊熼槄
//	 * 
//	 * @param bookId
//	 * @param studentId
//	 * @return
//	 */
//	@RequestMapping(value = "/{bookId}/appoint", method = RequestMethod.POST, produces = {
//    	"application/json;charset=utf-8" })
//	private Result<AppointExecution> appoint(@PathVariable("bookId") Long bookId, @Param("studentId") Long studentId) {
//		if (null == studentId || studentId.equals("")) {
//			return new Result<AppointExecution>(false, "瀛﹀彿涓嶈兘涓虹┖锛�?");
//		}
//		AppointExecution execution = bookService.appointBook(bookId, studentId);
//		return new Result<AppointExecution>(true, execution);
//	}
//	
//	
//	
//	
//}
