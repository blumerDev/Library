package com.example.Library.service;

import com.example.Library.dto.request.AuthorDto;
import com.example.Library.dto.MessageDto;
import com.example.Library.model.Author;
import com.example.Library.repository.AuthorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    private final AbstractServices abstractServices;
    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AbstractServices abstractServices, AuthorRepository authorRepository) {
        this.abstractServices = abstractServices;
        this.authorRepository = authorRepository;
    }

    public boolean addAuthor(AuthorDto authorDto) {
        return abstractServices.addNewEntity(authorDto, Author.class, authorRepository);
    }

    public List<?> getAllEntities() {
        return abstractServices.getAllEntities(Author.class, authorRepository);
    }

    public AuthorDto getEntityById(Integer integer) {
        return null;
    }



    public MessageDto deleteEntity(Integer integer) {
        return null;
    }


  /*  public AuthorDto updateEntityById(AuthorDto authorDto, Integer id) {
        Optional<Author> author = authorRepository.findById(id);
        if (!author.isPresent()) {
            throw new NotFoundException("No existe el autor");
        }
        author.get().setName(authorDto.getName());
        Author author1 = authorRepository.save(author.get());
        return modelMapper.map(author1, AuthorDto.class);
    }*/


}
