package com.example.Library.controller;

import com.example.Library.dto.request.AuthorDto;
import com.example.Library.service.AuthorService;
import jakarta.validation.Valid;
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
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/addNewAuthor")
    public HttpStatus newAuthor(@RequestBody @Valid AuthorDto authorDto) {
        if (authorService.addNewAuthor(authorDto)) {
            return HttpStatus.OK;
        }
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }

    @GetMapping("/list")
    public ResponseEntity<List<?>> list() {

        return new ResponseEntity<>(authorService.getAllEntities(), HttpStatus.OK);
    }

    /*@PutMapping("/updateAuthor/{id}")
    public ResponseEntity<?> upDateAuthor(@RequestBody AuthorDto authorDto, @PathVariable Integer id){
        return new ResponseEntity<>(authorService.updateEntityById(authorDto, id), HttpStatus.OK);
    }*/
}
