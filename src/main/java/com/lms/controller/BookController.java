package com.lms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lms.bean.Book;
import com.lms.service.BookService;

@RestController
@CrossOrigin("http://localhost:4200/")
public class BookController {
	@Autowired
	BookService service;

	// Insert in SB with Angular Integration
	@PostMapping("/performinsert")
	public void performInsertBook(@RequestBody Book book) {
		service.insertBook(book);
	}
	@PutMapping("/performBookUpdate")
	public void performUpdateBook(@RequestBody Book book) {
		service.insertBook(book);
	}
	@DeleteMapping("/performBookDelete/{id}")
	public void performDeleteBook(@PathVariable("id") long id) {
		service.deleteBook(id);
	}
	
	@GetMapping("/ViewAllBooks")
	public List<Book> getAll() {
		Iterator<Book> it =  service.getAll().iterator();
		List<Book> list = new ArrayList<>();
		while(it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}



}
