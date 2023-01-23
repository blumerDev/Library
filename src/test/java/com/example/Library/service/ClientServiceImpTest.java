package com.example.Library.service;

import com.example.Library.dto.request.ClientRequestDto;
import com.example.Library.repository.LibraryRepository;
import com.example.Library.util.ClientServiceUtil;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class ClientServiceImpTest {
    @Mock
    private LibraryRepository libraryRepository;

    @InjectMocks
    private ClientServiceImp clientService;

    @Test
    void listClient() {

    }

    @Test
    void editCliente() {
    }

    @Test
    void create() {
       //arrange

        //act
        // assert

    }

    @Test
    void delete() {
    }
}