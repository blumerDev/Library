package com.example.Library.exeptions;

import com.example.Library.dto.request.ErrorDto;
import lombok.*;

@Getter @Setter
@Builder
@AllArgsConstructor @NoArgsConstructor
public class UserNotFoundExeption extends RuntimeException {
     ErrorDto errorDto;
}
