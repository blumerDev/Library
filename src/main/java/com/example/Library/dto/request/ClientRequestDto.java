package com.example.Library.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
public class ClientRequestDto {
    @JsonIgnore
    private Long id;
    @NotNull(message = "El documento no puede ser nulo")
    private Long documento;
    @NotBlank(message = "El nombre no puede estar en blanco")
    //@Max(value = 25, message = "El nombre no puede poseer mas de 25 caracteres")
    private String nombre;
    private String apellido;
    private String telefono;
    @NotNull(message = "Es necesario dar alta")
    private boolean alta;
}
