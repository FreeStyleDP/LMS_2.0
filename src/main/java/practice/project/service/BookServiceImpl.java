package practice.project.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import practice.project.dao.BookMapper;
import practice.project.entity.Book;

@Service("bookService")
public class BookServiceImpl implements BookService {
	
	@Resource
	private BookMapper bookMapper;
	public List<Book> findRecommendBook() {
		Book book = new Book();
		book.setBookRem("Y");
		List<Book> list = bookMapper.selectByCondition(book);
		return list;
	}

}
