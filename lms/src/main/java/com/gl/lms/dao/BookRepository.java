package com.gl.lms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.lms.model.Book;

/*
 * JDBC
 * ORM					DB
 *  Hibernate semi automated
 *  SpringJDBC = bolierplatecode
 *  SpringDataJPA
 */

public interface BookRepository  extends JpaRepository<Book, Integer>{

}


