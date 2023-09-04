package com.example.Library.service;

import com.example.Library.dto.request.BookDto;
import com.example.Library.model.Book;
import com.example.Library.repository.BookRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final GenericServices genericServices;
    @Autowired
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository, GenericServices genericServices) {
        this.bookRepository = bookRepository;
        this.genericServices = genericServices;
    }

    public boolean saveBook(BookDto bookDto) {
        return genericServices.addNewEntity(bookDto, Book.class, bookRepository);
    }

    public List<?> getAllEntities() {
        return genericServices.getAllEntities(Book.class, bookRepository);
    }
}
