package com.example.Library.service;


import com.example.Library.dto.request.ClientRequestDto;
import com.example.Library.dto.request.MessageDto;
import com.example.Library.dto.response.ClientResponseDto;
import com.example.Library.exeptions.MyExeptions;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public interface IClientService {
    public List<ClientResponseDto> listClient();
    public MessageDto addNewClient(ClientRequestDto clientRequestDto) throws MyExeptions;

    MessageDto updateById(Long id, ClientRequestDto clientRequestDto);

    public void delete(Long id) throws MyExeptions;
}
