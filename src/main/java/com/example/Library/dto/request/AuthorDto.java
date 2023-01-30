package com.example.Library.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class AuthorDto {
    @NotBlank(message = "El nombre del autor no puede estar en blanco")
    @Size(max = 25, message = "El nombre no puede ser mayor a 25")
    private String name;
}
