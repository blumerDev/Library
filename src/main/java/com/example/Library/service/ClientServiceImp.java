package com.example.Library.service;
import com.example.Library.dto.request.ClientRequestDto;
import com.example.Library.dto.request.ErrorDto;
import com.example.Library.dto.request.MessageDto;
import com.example.Library.dto.response.ClientResponseDto;
import com.example.Library.exeptions.MyExeptions;
import com.example.Library.exeptions.UserNotFoundExeption;
import com.example.Library.model.Client;
import com.example.Library.repository.ClientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientServiceImp implements IClientService{

    @Autowired
    private ClientRepository clientRepository;

   private ModelMapper modelMapper = new ModelMapper();


    @Transactional
    @Override
    public MessageDto addNewClient(ClientRequestDto clientRequestDto){
        Client client = modelMapper.map(clientRequestDto, Client.class);
        clientRepository.save(client);
        return new MessageDto("El cliente fue creado correctamente","CREATE");
    }
    @Override
    public List<ClientResponseDto> listClient() {
         return  clientRepository.findAll()
                .stream()
                .map(element -> modelMapper.map(element,ClientResponseDto.class))
                .toList();
    }

    @Override
    @Mapper(componentModel = "spring")
    public MessageDto updateById(Long id, ClientRequestDto clientRequestDto){
        if(!clientRepository.existsById(id)){
            throw new UserNotFoundExeption(new ErrorDto("El usuario no fue encontrado"));
        }
        clientRepository.update
        save(clientRequestDto);
        return new MessageDto("El cliente fue actualizado correctamente ", "UPDATE");
    }

    @Override
    public void delete(Long id) throws MyExeptions {

    }

    private void save(ClientRequestDto clientRequestDto){
        Client client = modelMapper.map(clientRequestDto, Client.class);
        clientRepository.save(client);
    }


   /* @Override
    public void delete(String id) throws MyExeptions {
        validateId(id);
        Optional<Cliente> rst = clienteRepository.findById(id);
        if(rst.isPresent()){
            Cliente cliente = rst.get();
            clienteRepository.delete(cliente);
        }
    }*/
  /*  public Cliente searchByName(String nombre){
        return clienteRepository.findBynombreAllIgnoreCase(nombre);
    }


    }*/

}
