package com.example.Library.service;

import com.example.Library.dto.MessageDto;
import com.example.Library.dto.request.EditorialDto;
import com.example.Library.dto.request.LoadDto;
import com.example.Library.model.Editorial;
import com.example.Library.model.Load;
import com.example.Library.repository.LoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoadService {

    private final GenericServices genericServices;
    private final LoadRepository loadRepository;

    @Autowired
    public LoadService(LoadRepository loadRepository, GenericServices genericServices) {
        this.loadRepository = loadRepository;
        this.genericServices = genericServices;
    }

    public boolean saveNewLoad(LoadDto loadDto) {
        return genericServices.addNewEntity(loadDto, Load.class, loadRepository);
    }
}
