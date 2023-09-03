package com.example.Library.service.interfaces;


import com.example.Library.dto.request.ClientRequestDto;
import com.example.Library.dto.response.ClientResponseDto;
import com.example.Library.service.interfaces.generic.ICrudService;

public interface IClientService extends ICrudService<ClientRequestDto,Integer> {
    ClientResponseDto update(Integer id, ClientRequestDto dto);
}
