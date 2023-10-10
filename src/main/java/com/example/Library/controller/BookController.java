package com.example.Library.controller;

import com.example.Library.dto.request.BookDto;
import com.example.Library.dto.response.BookApiResponse;
import com.example.Library.service.BookService;
import jakarta.validation.Valid;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/newAuthor")
    public HttpStatus newAuthor(@RequestBody @Valid BookDto bookDto) {
        if (bookService.saveBook(bookDto)) {
            return HttpStatus.OK;
        }
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }

    @GetMapping("/list")
    public ResponseEntity<List<?>> list() {
        return new ResponseEntity<>(bookService.getAllEntities(), HttpStatus.OK);
    }

    @GetMapping("/bookClient")
    public BookApiResponse bookClient() throws IOException, InterruptedException {
        return bookService.getBookList();
    }
}
