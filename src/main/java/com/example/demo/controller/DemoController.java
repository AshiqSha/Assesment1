package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DemoModel;
import com.example.demo.service.DemoService;

@RestController
public class DemoController {

@Autowired
DemoService demoService;

@GetMapping("/book/{bookid}")
private ResponseEntity<DemoModel> getBooks(@PathVariable("bookid") int bookid) 
{
//return demoService.getBooksById(bookid);

try {
	DemoModel demoModel = demoService.getBooksById(bookid);
    return new ResponseEntity<DemoModel>(demoModel, HttpStatus.OK);
} catch (NoSuchElementException e) {
    return new ResponseEntity<DemoModel>(HttpStatus.NOT_FOUND);
} 
}


@PostMapping("/book")
private int saveBook(@RequestBody DemoModel books) 
{
	demoService.saveOrUpdate(books);
	return books.getBookid();
}



@DeleteMapping("/book/{bookid}")
private void deleteBook(@PathVariable("bookid") int bookid) 
{
	demoService.delete(bookid);
}


@PutMapping("/book/{id}")
private ResponseEntity<?> update(@RequestBody DemoModel books , @PathVariable Integer id) 
{
	//demoService.saveOrUpdate(books);
//return books;


try {
	//DemoModel demoModel = demoService.getBooksById(id);
	demoService.saveOrUpdate(books);
    return new ResponseEntity<>(HttpStatus.OK);
} catch (NoSuchElementException e) {
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
} 
}


@GetMapping("/book")
private List<DemoModel> getAllBooks() 
{
	return demoService.fetchBookList();
}

	
}