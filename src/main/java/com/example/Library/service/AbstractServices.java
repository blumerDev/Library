package com.example.Library.service;

import com.example.Library.dto.MessageDto;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class AbstractServices {

    private final ModelMapper modelMapper = new ModelMapper();

    public <T> boolean addNewEntity(Object dto, Class<T> entityClass, JpaRepository<T, Long> repository) {
        try {
            T entity = modelMapper.map(dto, entityClass);
            repository.save(entity);
            System.out.println(MessageDto.builder().message("The " + entityClass + "was created successfully").action("CREATED").build());
            return true;
        } catch (Exception e) {
            System.out.println(MessageDto.builder().message("Error: fail in save entity. " + e).action("FAILED").build());
            return false;
        }
    }

    public <T> boolean updateEntity(Object dto, Class<T> entityClass, JpaRepository<T, Long> repository) {
        try {
            T entity = modelMapper.map(dto, entityClass);
            repository.save(entity);
            System.out.println(MessageDto.builder().message("The " + entityClass + "was created successfully").action("CREATED").build());
            return true;
        } catch (Exception e) {
            System.out.println(MessageDto.builder().message("Error: fail in save entity. " + e).action("FAILED").build());
            return false;
        }
    }

    public <T> List<?> getAllEntities(Class<T> entityClass, JpaRepository<T, Long> repository) {
        return repository.findAll().stream().map(element -> modelMapper.map(element, entityClass)).toList();
    }

}
