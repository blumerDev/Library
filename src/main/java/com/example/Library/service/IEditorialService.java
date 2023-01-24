package com.example.Library.service;

import com.example.Library.dto.request.EditorialRequestDto;
import com.example.Library.dto.request.MessageDto;
import org.springframework.stereotype.Service;

@Service
public interface IEditorialService {
    public MessageDto addNewEditorial(EditorialRequestDto editorialRequestDto);
}
