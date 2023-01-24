package com.example.Library.service;

import com.example.Library.dto.request.EditorialRequestDto;
import com.example.Library.dto.request.MensajeDto;
import com.example.Library.exeptions.MyExeptions;
import com.example.Library.model.Editorial;
import com.example.Library.repository.EditorialRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class EditorialServiceImp implements IEditorialService{

    @Autowired
    private EditorialRepo editorialRepo;
    private ModelMapper modelMapper = new ModelMapper();
    @Autowired
    private EditorialRepository editorialRepository;

    @Transactional
    @Override
    public MensajeDto addNewEditorial(EditorialRequestDto editorialRequestDto)throws MyExeptions {
        Editorial editorial = modelMapper.map(editorialRequestDto, Editorial.class);
        editorialRepository.save(editorial);
        return new MensajeDto("The editorial was created successfully");
    }
}
