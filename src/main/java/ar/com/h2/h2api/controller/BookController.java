package ar.com.h2.h2api.controller;


import ar.com.h2.h2api.DTO.BookDTO;
import ar.com.h2.h2api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;



@RestController
@RequestMapping("books")
public class BookController {

    @Autowired
    private BookService bookService;



    @PostMapping
    public ResponseEntity<BookDTO> postNewGenre(@Valid @RequestBody BookDTO newBook){
        BookDTO savedBook = bookService.saveNewBook(newBook);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(savedBook);
    }

}








