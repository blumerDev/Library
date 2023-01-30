package com.example.Library.service;
import com.example.Library.dto.request.ClientRequestDto;
import com.example.Library.dto.request.ErrorDto;

import com.example.Library.dto.response.ClientResponseDto;
import com.example.Library.dto.response.MessageDto;
import com.example.Library.exeptions.UserNotFoundExeption;
import com.example.Library.model.Client;
import com.example.Library.repository.IClientRepository;

import com.example.Library.service.interfaces.IClientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements IClientService {

    @Autowired
    private IClientRepository IClientRepository;

   private ModelMapper modelMapper = new ModelMapper();


    @Override
    public MessageDto saveEntity(ClientRequestDto objectDto) {
        Client client = modelMapper.map(objectDto, Client.class);
        IClientRepository.save(client);
        return MessageDto.builder()
                .message("El cliente fue creado correctamente")
                .action("CREATE")
                .build();
    }
    @Override
    public ClientRequestDto getEntityById(Integer integer) {
        return null;
    }

    @Override
    public List<ClientRequestDto> getAllEntities() {
        return  IClientRepository.findAll()
                .stream()
                .map(element -> modelMapper.map(element, ClientRequestDto.class))
                .toList();
    }

    @Override
    public ClientResponseDto update(Integer id, ClientRequestDto clientRequestDto) {
        if(!IClientRepository.existsById(id)){
            throw new UserNotFoundExeption(new ErrorDto("La entidad no se encontro"));
        }
        var entity = modelMapper.map(clientRequestDto,Client.class);
        entity.setId(id);
        return modelMapper.map(entity, ClientResponseDto.class);
    }

    @Override
    public MessageDto deleteEntity(Integer id) {
        return null;
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
