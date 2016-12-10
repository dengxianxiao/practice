package com.dk.dxx.web;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dk.dxx.dto.AppointExecution;
import com.dk.dxx.dto.Result;
import com.dk.dxx.entity.Book;
import com.dk.dxx.service.BookService;


@Controller
@RequestMapping("/book") // url:/模块/资源/{id}/细分 /seckill/list
public class BookController {
	
//	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private BookService bookService;
	
	
	/**
	 * 查询图书列表
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	private String list(Model model) {
		List<Book> list = bookService.queryBookList();
		model.addAttribute("list", list);
		// list.jsp + model = ModelAndView
		return "list";// WEB-INF/jsp/"list".jsp
	}
	
	
	/**
	 * 查询一本图书
	 * 
	 * @param bookId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/{bookId}/detail", method = RequestMethod.GET)
	@ResponseBody
	private String detail(@PathVariable("bookId") Long bookId, Model model) {
		if (null == bookId) {
			return "redirect:/book/list";
		}
		
		Book book = bookService.getById(bookId);
		if (null == book) {
			return "forward:/book/list";
		}
		
		model.addAttribute("book", book);
		return "detail";
	}
	
	
	/**
	 * 图书借阅
	 * 
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	@RequestMapping(value = "/{bookId}/appoint", method = RequestMethod.POST, 
			produces = {"application/json, charset = utf8"})
	private Result<AppointExecution> appoint(@PathVariable("bookId") Long bookId, @Param("studentId") Long studentId) {
		if (null == studentId || studentId.equals("")) {
			return new Result<AppointExecution>(false, "学号不能为空！");
		}
		AppointExecution execution = bookService.appointBook(bookId, studentId);
		return new Result<AppointExecution>(true, execution);
	}
}
