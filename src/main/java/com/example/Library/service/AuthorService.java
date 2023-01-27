package com.example.Library.service;

import com.example.Library.dto.response.MessageDto;
import com.example.Library.model.Author;
import com.example.Library.service.interfaces.IAuthorService;

import java.util.List;

public class AuthorService implements IAuthorService {
    @Override
    public MessageDto saveEntity(Author objectDto) {
        return null;
    }

    @Override
    public Author getEntityById(Integer integer) {
        return null;
    }

    @Override
    public List<Author> getAllEntities() {
        return null;
    }

    @Override
    public MessageDto deleteEntity(Integer integer) {
        return null;
    }
}
