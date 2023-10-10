package com.example.Library.service;

import com.example.Library.dto.request.ClientRequestDto;
import com.example.Library.model.Client;
import com.example.Library.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final ClientRepository clientRepository;
    private final AbstractServices abstractServices;

    @Autowired
    public ClientService(ClientRepository clientRepository, AbstractServices abstractServices) {
        this.clientRepository = clientRepository;
        this.abstractServices = abstractServices;
    }

    public boolean saveNewClient(ClientRequestDto clientRequestDto) {
        return abstractServices.addNewEntity(clientRequestDto, Client.class, clientRepository);
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
