package com.example.Library.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class AuthorDto {
    @NotBlank(message = "The name can not be empty")
    private String name;
}
