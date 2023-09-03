package com.example.Library.service;

import com.example.Library.dto.MessageDto;
import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class GenericServices {

    private final ModelMapper modelMapper = new ModelMapper();

    public <T> MessageDto addNewEntity(Object dto, Class<T> entityClass, JpaRepository<T, Long> repository) {
        try {
            T entity = modelMapper.map(dto, entityClass);
            repository.save(entity);
            return MessageDto.builder().message("The " + entityClass + "was created successfully").action("CREATED").build();
        }catch (Exception e){
            System.out.println(MessageDto.builder().message("Error: fail in save entity. " + e).action("FAILED").build());
            return null;
        }
    }
}
