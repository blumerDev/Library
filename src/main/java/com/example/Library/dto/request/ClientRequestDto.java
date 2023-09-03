package com.example.Library.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientRequestDto {
    @JsonIgnore
    private Long id;
    @NotNull(message = "The register number can not be empty")
    private Long registerNumber;
    @NotBlank(message = "The name can not be empty")
    private String name;
    private String surname;
    private String telephone;
    @NotNull(message = "Es necesario dar alta")
    private boolean isRegister;

}
