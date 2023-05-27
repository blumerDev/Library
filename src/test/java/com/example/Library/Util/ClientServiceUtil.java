package com.example.Library.Util;

import com.example.Library.dto.request.ClientRequestDto;

public class ClientServiceUtil {

    public ClientRequestDto createClientDto(){
        return ClientRequestDto.builder()
                .documento(22222L)
                .nombre ("Juan")
                .apellido("prueba")
                .telefono("0000")
                .alta(true)
                .build();

    }
}

