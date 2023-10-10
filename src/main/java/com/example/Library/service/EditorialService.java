package com.example.Library.service;

import com.example.Library.dto.request.EditorialDto;
import com.example.Library.model.Editorial;
import com.example.Library.repository.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialService {

    private final AbstractServices abstractServices;
    private final EditorialRepository editorialRepository;

    @Autowired
    public EditorialService(EditorialRepository EditorialRepository, AbstractServices abstractServices) {
        this.editorialRepository = EditorialRepository;
        this.abstractServices = abstractServices;
    }

    public boolean saveNewEditorial(EditorialDto editorialDto) {
        return abstractServices.addNewEntity(editorialDto, Editorial.class, editorialRepository);
    }


}
