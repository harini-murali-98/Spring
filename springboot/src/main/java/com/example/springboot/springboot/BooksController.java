package com.example.springboot.springboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
	
	@GetMapping("/books")
	public List<Books> getBooks()
	{
		return Arrays.asList(new Books(1,"book573489"),new Books(2,"book2"));
		
	}

}
