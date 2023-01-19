package com.example.Library.config;

import com.example.Library.exeptions.MyExeptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExeptionHandler {
    @ExceptionHandler(MyExeptions.class)
    ResponseEntity<?> myExeption(MyExeptions e){
        return new ResponseEntity<>(e.getMensajeDto(), HttpStatus.BAD_REQUEST);
    }
}
