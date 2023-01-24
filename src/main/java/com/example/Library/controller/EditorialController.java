package com.example.Library.controller;

import com.example.Library.dto.request.EditorialRequestDto;
import com.example.Library.dto.request.MensajeDto;
import com.example.Library.service.EditorialServiceImp;
import com.example.Library.service.IEditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("editorial")
public class EditorialController {

    @Autowired
    private IEditorialService editorialService;

    @PostMapping("/addNewEditorial")
    public ResponseEntity<?> newEditorial(@RequestBody EditorialRequestDto editorialRequestDto) {
        return new ResponseEntity<>(editorialService.addNewEditorial(editorialRequestDto), HttpStatus.OK);
    }
   /* @GetMapping("/list")
    public String list(ModelMap model){
        List<Editorial> editoriales = editorialServiceImp.fetchListEditoriales();
        model.put("lista",editoriales);
        return "EditorialList.html";
    }
    @GetMapping("/update/{id}")
    public String update(@PathVariable String id, ModelMap model){
        model.put("editorial",editorialServiceImp.getOne(id));
        return "editorialUpdate.html";
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable String id, String nombre, ModelMap model){
        try {
            editorialServiceImp.editEditorial(id,nombre);
            return "redirect:../list";
        } catch (MyExeptions e) {
            model.put("fail",e.getMessage());
            return "EditorialUpdate.html";
        }

    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id, ModelMap model){
        model.put("editorial",editorialServiceImp.getOne(id));
        return "EditorialDelete.html";
    }
    @PostMapping("delete/{id}")
    public String EditorialDelete(@PathVariable String id, ModelMap model){
        try {
            editorialServiceImp.delete(id);
            return "redirect:../list";
        } catch (MyExeptions e) {
            model.put("fail",e.getMessage());
            return "EditorialDelete.html";
        }
    }*/
}
