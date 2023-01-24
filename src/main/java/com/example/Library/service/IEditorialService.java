package com.example.Library.service;

import com.example.Library.dto.request.EditorialRequestDto;
import com.example.Library.dto.request.MensajeDto;
import org.springframework.stereotype.Service;

@Service
public interface IEditorialService {
    public MensajeDto addNewEditorial(EditorialRequestDto editorialRequestDto);
}
