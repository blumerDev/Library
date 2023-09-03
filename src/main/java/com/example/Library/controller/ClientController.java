package com.example.Library.controller;

import com.example.Library.dto.request.ClientRequestDto;
import com.example.Library.service.ClientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping("/newClient")
    public ResponseEntity<?> addNewClient(@RequestBody @Valid ClientRequestDto clientRequestDto) {
        return new ResponseEntity<>(clientService.saveNewClient(clientRequestDto), HttpStatus.OK);
    }

  /*  @GetMapping("/list")
    public ResponseEntity<List<?>> list() {
        return new ResponseEntity<>(clientService.getAllEntities(), HttpStatus.OK);
    }*/

   /* @PostMapping("/update/{id}")
    public ResponseEntity<ClientResponseDto> update(@PathVariable Integer id, @RequestBody ClientRequestDto clientRequestDto) {
        return new ResponseEntity<>(clientService.update(id, clientRequestDto), HttpStatus.OK);
    }*/
     /*
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
