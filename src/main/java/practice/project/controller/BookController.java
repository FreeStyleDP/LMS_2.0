package practice.project.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import practice.project.entity.Book;
import practice.project.entity.Inform;
import practice.project.service.BookService;
import practice.project.util.JsonResult;

@RequestMapping("/book")
@Controller
public class BookController extends ExceptionController {
	
	@Resource
	private BookService bookService;
	
	@RequestMapping("/findRecommendBook.do")
	@ResponseBody
	public JsonResult findRecommendBook(){
		List<Book> list = bookService.findRecommendBook();
		return new JsonResult(list);
	}
	
}
