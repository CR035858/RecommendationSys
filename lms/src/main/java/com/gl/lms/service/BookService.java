package com.gl.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.lms.dao.BookRepository;
import com.gl.lms.model.Book;

@Service
public class BookService {
	
	@Autowired
	BookRepository bkRepo;
	
	
	
	public List <Book> getAllBooks()
	{
		return bkRepo.findAll();
	}

}
