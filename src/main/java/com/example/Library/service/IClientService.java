package com.example.Library.service;

import ch.qos.logback.core.net.server.Client;
import com.example.Library.dto.request.ClientRequestDto;
import com.example.Library.dto.response.ClientResponseDto;
import com.example.Library.exeptions.MyExeptions;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IClientService {
    public List<ClientResponseDto> listClient();
    public void editCliente(String id,Long document, String nombre,String apellido,String telefono) throws MyExeptions;
    public String create(ClientRequestDto clientRequestDto) throws MyExeptions;
    public void delete(String id) throws MyExeptions;
}
