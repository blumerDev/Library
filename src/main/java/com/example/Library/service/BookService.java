package com.example.Library.service;

import com.example.Library.dto.response.MessageDto;
import com.example.Library.model.Book;
import com.example.Library.service.interfaces.IBookService;

import java.util.List;

public class BookService implements IBookService {
    @Override
    public MessageDto saveEntity(Book objectDto) {
        return null;
    }

    @Override
    public Book getEntityById(Integer integer) {
        return null;
    }

    @Override
    public List<Book> getAllEntities() {
        return null;
    }

    @Override
    public MessageDto deleteEntity(Integer integer) {
        return null;
    }
}
