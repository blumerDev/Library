package com.example.Library.service;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class ClientServiceTest {

    @Mock
    private LibraryRepository libraryRepository;

    @InjectMocks
    private ClientService clientService;

    @Test
    void listClient() {

    }

    @Test
    void editCliente() {
    }

    @Test
    void addNewClient() {
       //arrange
      /*  ClientRequestDto clientRequestDto = new ClientRequestDto();
        when(libraryRepository.save(clientRequestDto)).thenThrow(MyExeptions.class);
        //act
        MensajeDto = clientService.addNewClient(clientRequestDto);
        // assert
       //assertEquals("Has been a problem",message);
*/
    }

    @Test
    void delete() {
    }
}