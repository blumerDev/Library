package com.example.Library.service;
import com.example.Library.dto.request.ClientRequestDto;
import com.example.Library.dto.request.MessageDto;
import com.example.Library.dto.response.ClientResponseDto;
import com.example.Library.exeptions.MyExeptions;
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


   /* @Override
    public void editCliente(String id, Long document, String nombre, String apellido, String telefono) throws MyExeptions {
        validateId(id);
        validate(document,nombre,apellido,telefono);
        Optional<Cliente> rs = clienteRepository.findById(id);
        if (rs.isPresent()){
            Cliente cliente = rs.get();
            cliente.setDocumento(document);
            cliente.setApellido(apellido);
            cliente.setNombre(nombre);
            cliente.setTelefono(telefono);
            clienteRepository.save(cliente);
        }
    }
    /*@Override
    public Cliente getOne(String id) {
        return clienteRepository.getReferenceById(id);
    }*/

    @Override
    public List<ClientResponseDto> listClient() {
         return  clientRepository.findAll()
                .stream()
                .map(element -> modelMapper.map(element,ClientResponseDto.class))
                .toList();
    }

    @Override
    public void editCliente(String id, Long document, String nombre, String apellido, String telefono) throws MyExeptions {
        /*if(id == null){
            throw new MyExeptions("Not")
        }*/
    }
    @Transactional
    @Override
    public MessageDto addNewClient(ClientRequestDto clientRequestDto){
        Client client = modelMapper.map(clientRequestDto, Client.class);
        clientRepository.save(client);
        return new MessageDto("El cliente fue creado correctamente");

    }

    @Override
    public void delete(String id) throws MyExeptions {

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
