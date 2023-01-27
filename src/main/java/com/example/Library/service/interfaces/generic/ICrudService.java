package com.example.Library.service.interfaces.generic;

import com.example.Library.dto.response.MessageDto;

import java.util.List;

public interface ICrudService<T,ID> {
    MessageDto saveEntity(T objectDto);
    T getEntityById(ID id);
    List<T> getAllEntities();
    MessageDto deleteEntity(ID id);
}
