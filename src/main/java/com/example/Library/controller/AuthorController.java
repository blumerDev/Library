package com.example.Library.controller;

import com.example.Library.dto.request.AuthorDto;
import com.example.Library.dto.request.EditorialDto;
import com.example.Library.service.interfaces.IAuthorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private IAuthorService authorService;

    @PostMapping("/addNewAuthor")
    public ResponseEntity<?> newAuthor(@RequestBody @Valid AuthorDto authorDto) {
        return new ResponseEntity<>(authorService.saveEntity(authorDto), HttpStatus.OK);
    }

    @PutMapping("/updateAuthor/{id}")
    public ResponseEntity<?> upDateAuthor(@RequestBody AuthorDto authorDto, @PathVariable Integer id){
        return new ResponseEntity<>(authorService.updateEntityById(authorDto, id), HttpStatus.OK);
    }
}
