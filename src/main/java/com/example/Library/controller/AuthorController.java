package com.example.Library.controller;

import com.example.Library.dto.request.AuthorDto;
import com.example.Library.service.AuthorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/addNewAuthor")
    public ResponseEntity<?> newAuthor(@RequestBody @Valid AuthorDto authorDto) throws Exception {
        return new ResponseEntity<>(authorService.addNewAuthor(authorDto), HttpStatus.OK);
    }

    /*@PutMapping("/updateAuthor/{id}")
    public ResponseEntity<?> upDateAuthor(@RequestBody AuthorDto authorDto, @PathVariable Integer id){
        return new ResponseEntity<>(authorService.updateEntityById(authorDto, id), HttpStatus.OK);
    }*/
}
