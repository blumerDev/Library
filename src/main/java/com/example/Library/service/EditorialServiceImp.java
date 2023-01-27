package com.example.Library.service;

import com.example.Library.dto.request.EditorialDto;
import com.example.Library.dto.response.MessageDto;
import com.example.Library.exeptions.MyExeptions;
import com.example.Library.model.Editorial;
import com.example.Library.repository.IEditorialRepository;
import com.example.Library.service.interfaces.IEditorialService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EditorialServiceImp implements IEditorialService {

    private ModelMapper modelMapper = new ModelMapper();
    @Autowired
    private IEditorialRepository IEditorialRepository;

    @Transactional

    public MessageDto addNewEditorial(EditorialDto editorialDto)throws MyExeptions {
        Editorial editorial = modelMapper.map(editorialDto, Editorial.class);
        IEditorialRepository.save(editorial);
        return new MessageDto("La editoria fue creada correctamente","CREATE");
    }

    @Override
    public MessageDto saveEntity(EditorialDto objectDto) {
        return null;
    }

    @Override
    public EditorialDto getEntityById(Long aLong) {
        return null;
    }

    @Override
    public List<EditorialDto> getAllEntities() {
        return null;
    }


    @Override
    public MessageDto deleteEntity(Long aLong) {
        return null;
    }
}
