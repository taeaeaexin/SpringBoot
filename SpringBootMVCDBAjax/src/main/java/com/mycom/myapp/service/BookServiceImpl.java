package com.mycom.myapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mycom.myapp.dao.BookDao;
import com.mycom.myapp.dto.BookDto;

@Service
public class BookServiceImpl implements BookService {

//	@Autowired
//	BookDao bookDao;
	
	private final BookDao bookDao;
	public BookServiceImpl(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	
	@Override
	public List<BookDto> listBook() {
		// TODO Auto-generated method stub
		return bookDao.listBook();
	}

	@Override
	public BookDto detailBook(int bookId) {
		// TODO Auto-generated method stub
		return bookDao.detailBook(bookId);
	}

	@Override
	public int insertBook(BookDto book) {
		// TODO Auto-generated method stub
		return bookDao.insertBook(book);
	}

	@Override
	public int updateBook(BookDto book) {
		// TODO Auto-generated method stub
		return bookDao.updateBook(book);
	}

	@Override
	public int deleteBook(int bookId) {
		// TODO Auto-generated method stub
		return bookDao.deleteBook(bookId);
	}
	

}
