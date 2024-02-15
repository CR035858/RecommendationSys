package com.gl.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gl.lms.model.Book;
import com.gl.lms.service.BookService;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	
	@Autowired
	BookService bkService;
	
	@RequestMapping("/sayHello")
	public String sayHello()
	{
		return "Welcome to Restful Service";
	}
	
	@GetMapping("/books")
	public List <Book> getAllBooks()
	{
		return bkService.getAllBooks();
	}

}
