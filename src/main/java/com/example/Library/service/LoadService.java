package com.example.Library.service;

import com.example.Library.dto.request.LoadDto;
import com.example.Library.model.Load;
import com.example.Library.repository.LoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoadService {

    private final AbstractServices abstractServices;
    private final LoadRepository loadRepository;

    @Autowired
    public LoadService(LoadRepository loadRepository, AbstractServices abstractServices) {
        this.loadRepository = loadRepository;
        this.abstractServices = abstractServices;
    }

    public boolean saveNewLoad(LoadDto loadDto) {
        return abstractServices.addNewEntity(loadDto, Load.class, loadRepository);
    }
}
