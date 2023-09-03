package com.example.Library.service;

import com.example.Library.dto.MessageDto;
import com.example.Library.dto.request.ClientRequestDto;
import com.example.Library.model.Client;
import com.example.Library.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private ClientRepository clientRepository;
    private final GenericServices genericServices;

    @Autowired
    public ClientService(ClientRepository clientRepository, GenericServices genericServices) {
        this.clientRepository = clientRepository;
        this.genericServices = genericServices;
    }

    public MessageDto saveNewClient(ClientRequestDto clientRequestDto) {
        return genericServices.addNewEntity(clientRequestDto, Client.class, clientRepository);
    }

    /*public ClientRequestDto getEntityById(Integer integer) {
        return null;
    }


    public List<ClientRequestDto> getAllEntities() {
        return  ClientRepository.findAll()
                .stream()
                .map(element -> modelMapper.map(element, ClientRequestDto.class))
                .toList();
    }*/


    /*public ClientResponseDto update(Integer id, ClientRequestDto clientRequestDto) {
        if(!ClientRepository.existsById(id)){
            throw new UserNotFoundExeption(new ErrorDto("La entidad no se encontro"));
        }
        var entity = modelMapper.map(clientRequestDto,Client.class);
        entity.setId(id);
        return modelMapper.map(entity, ClientResponseDto.class);
    }


    public MessageDto deleteEntity(Integer id) {
        return null;
    }


    public ClientRequestDto updateEntityById(ClientRequestDto entity, Integer integer) {
        return null;
    }
*/

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
