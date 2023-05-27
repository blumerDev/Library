package com.example.Library.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter @Getter
@AllArgsConstructor @NoArgsConstructor
public class ClientResponseDto {
    private Long documento;
    private String nombre;
    private String apellido;
    private String telefono;
    private boolean alta;
}
