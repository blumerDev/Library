package com.example.Library.service;

import com.example.Library.dto.response.MessageDto;
import com.example.Library.model.Editorial;
import com.example.Library.model.Load;
import com.example.Library.repository.IEditorialRepository;
import com.example.Library.repository.ILoadRepository;
import com.example.Library.service.interfaces.ILoadService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class LoadService implements ILoadService {
    private ModelMapper modelMapper = new ModelMapper();
    @Autowired
    private ILoadRepository loadRepository;
    @Override
    public MessageDto saveEntity(Load objectDto) {
        Load load = modelMapper.map(objectDto, Load.class);
        loadRepository.save(load);
        return MessageDto.builder()
                .message("El prestamo fue creado correctamente")
                .action("CREATE")
                .build();
    }

    @Override
    public Load getEntityById(Integer integer) {
        return null;
    }

    @Override
    public List<Load> getAllEntities() {
        return null;
    }

    @Override
    public MessageDto deleteEntity(Integer integer) {
        return null;
    }
}
