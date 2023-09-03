package com.example.Library.exeptions;

import com.example.Library.dto.MessageDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor @AllArgsConstructor
public class MyExeptions extends RuntimeException{

    private MessageDto mensajeDto;

}
