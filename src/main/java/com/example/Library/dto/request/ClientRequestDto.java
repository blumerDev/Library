package com.example.Library.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class ClientRequestDto {
    private Long documento;
    private String nombre;
    private String apellido;
    private String telefono;
    private boolean alta;
}
