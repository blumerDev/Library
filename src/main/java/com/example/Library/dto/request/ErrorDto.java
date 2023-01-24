package com.example.Library.dto.request;

import lombok.*;

@Setter @Getter
@Builder
@AllArgsConstructor @NoArgsConstructor
public class ErrorDto {
    String message;
}
