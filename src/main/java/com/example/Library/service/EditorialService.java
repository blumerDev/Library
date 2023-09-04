package com.example.Library.service;

import com.example.Library.dto.request.EditorialDto;
import com.example.Library.model.Editorial;
import com.example.Library.repository.EditorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialService {

    private final GenericServices genericServices;
    private final EditorialRepository editorialRepository;

    @Autowired
    public EditorialService(EditorialRepository EditorialRepository, GenericServices genericServices) {
        this.editorialRepository = EditorialRepository;
        this.genericServices = genericServices;
    }

    public boolean saveNewEditorial(EditorialDto editorialDto) {
        return genericServices.addNewEntity(editorialDto, Editorial.class, editorialRepository);
    }


}
