package com.example.Library.service;

import com.example.Library.dto.request.AuthorDto;
import com.example.Library.dto.response.MessageDto;
import com.example.Library.model.Author;
import com.example.Library.model.Client;
import com.example.Library.repository.IAuthorRepository;
import com.example.Library.service.interfaces.IAuthorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService implements IAuthorService {
    @Autowired
    private IAuthorRepository authorRepository;
    private ModelMapper modelMapper = new ModelMapper();
    @Override
    public MessageDto saveEntity(AuthorDto objectDto) {
        Author author = modelMapper.map(objectDto, Author.class);
        authorRepository.save(author);
        return MessageDto.builder()
                .message("El autor fue creado correctamente")
                .action("CREATE")
                .build();
    }

    @Override
    public AuthorDto getEntityById(Integer integer) {
        return null;
    }

    @Override
    public List<AuthorDto> getAllEntities() {
        return null;
    }

    @Override
    public MessageDto deleteEntity(Integer integer) {
        return null;
    }

    @Override
    public AuthorDto updateEntityById(AuthorDto authorDto, Integer id) {
        Optional<Author> author = authorRepository.findById(id);
        if(!author.isPresent()){
            throw new NotFoundException("No existe el autor");
        }
        author.get().setName(authorDto.getName());
        Author author1 = authorRepository.save(author.get());
        return modelMapper.map(author1, AuthorDto.class);}


}
