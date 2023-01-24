package com.example.Library.controller;

import com.example.Library.dto.request.ClientRequestDto;
import com.example.Library.dto.response.ClientResponseDto;
import com.example.Library.service.IClientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private IClientService clientService;
    @PostMapping("/newClient")
    public ResponseEntity<?> cliente(@RequestBody @Valid ClientRequestDto clientRequestDto){
        return new ResponseEntity<>(clientService.addNewClient(clientRequestDto), HttpStatus.OK);
    }
    @GetMapping("/list")
    public ResponseEntity<List<ClientResponseDto>> list(){
        return new ResponseEntity<>(clientService.listClient(),HttpStatus.OK);
    }
    /*
    @GetMapping("/update/{id}")
    public String update(@PathVariable String id, ModelMap model){
        model.put("cliente",clienteImp.getOne(id));
        return "clienteUpdate.html";
    }
    @PostMapping("/update/{id}")
    public String update(@PathVariable String id, Long documento,String nombre, String apellido, String telefono, ModelMap model){
        try {
            clienteImp.editCliente(id,documento,nombre,apellido,telefono);
            return "redirect:../list";
        } catch (MyExeptions e) {
           model.put("fail",e.getMessage());
           return "clienteUpdate.html";
        }
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id, ModelMap model){
        model.put("cliente", clienteImp.getOne(id));
        return "clienteDelete.html";
    }

    @PostMapping("/delete/{id}")
    public String deleteC(@PathVariable String id, ModelMap model){
        try {
            clienteImp.delete(id);
            return "redirect:../list";
        } catch (MyExeptions e) {
            model.put("fail",e.getMessage());
            return "clienteDelete.html";
        }
    }
*/
}
