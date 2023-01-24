package com.example.Library.service;

import com.example.Library.dto.request.EditorialRequestDto;
import com.example.Library.dto.request.MessageDto;
import com.example.Library.exeptions.MyExeptions;
import com.example.Library.model.Editorial;
import com.example.Library.repository.EditorialRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class EditorialServiceImp implements IEditorialService{

    private ModelMapper modelMapper = new ModelMapper();
    @Autowired
    private EditorialRepository editorialRepository;

    @Transactional
    @Override
    public MessageDto addNewEditorial(EditorialRequestDto editorialRequestDto)throws MyExeptions {
        Editorial editorial = modelMapper.map(editorialRequestDto, Editorial.class);
        editorialRepository.save(editorial);
        return new MessageDto("La editoria fue creada correctamente","CREATE");
    }
}
