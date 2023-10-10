package com.example.Library.service;

import com.example.Library.Client.BookClient;
import com.example.Library.dto.request.BookDto;
import com.example.Library.dto.response.BookApiResponse;
import com.example.Library.model.Book;
import com.example.Library.repository.BookRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final AbstractServices abstractServices;
    private final BookRepository bookRepository;
    private final BookClient bookClient;

    private final ObjectMapper mapper = new ObjectMapper();

    @Autowired
    public BookService(BookRepository bookRepository, AbstractServices abstractServices, BookClient bookClient) {
        this.bookRepository = bookRepository;
        this.abstractServices = abstractServices;
        this.bookClient = bookClient;
    }

    public boolean saveBook(BookDto bookDto) {
        return abstractServices.addNewEntity(bookDto, Book.class, bookRepository);
    }

    public List<?> getAllEntities() {
        return abstractServices.getAllEntities(Book.class, bookRepository);
    }

    public BookApiResponse getBookList() throws IOException, InterruptedException {
        return mapper.reader().forType(BookApiResponse.class).readValue(bookClient.getBooks());
    }
}
