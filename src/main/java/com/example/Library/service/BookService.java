package com.example.Library.service;

import com.example.Library.dto.response.MessageDto;
import com.example.Library.model.Author;
import com.example.Library.model.Book;
import com.example.Library.repository.IBookRepository;
import com.example.Library.service.interfaces.IBookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository bookRepository;
    private ModelMapper modelMapper = new ModelMapper();
    @Override
    public MessageDto saveEntity(Book objectDto) {
        Book book = modelMapper.map(objectDto, Book.class);
        bookRepository.save(book);
        return MessageDto.builder()
                .message("El libro fue creado correctamente")
                .action("CREATE")
                .build();
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
