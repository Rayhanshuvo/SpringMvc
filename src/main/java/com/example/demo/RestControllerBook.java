package com.example.demo;
//https://github.com/in28minutes/SpringBootForBeginners/tree/master/01.Spring-Boot-Introduction-In-10-Steps
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerBook {
	
	@GetMapping("/allbooks")
	private List<BookEntity> getAllBooks() {
		
		return  (List<BookEntity>) Arrays.asList(new BookEntity(1,"HarryPotter","Rayhan"),new BookEntity(2, "Selina", "Gomez"));
		
	}

}
