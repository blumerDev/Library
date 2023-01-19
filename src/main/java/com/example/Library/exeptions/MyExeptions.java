package com.example.Library.exeptions;

import com.example.Library.dto.response.MessageDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor @AllArgsConstructor
public class MyExeptions extends RuntimeException{

    private MessageDto mensajeDto;

}
