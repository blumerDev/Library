package com.example.Library.dto.request;

import com.example.Library.model.Book;
import com.example.Library.model.Client;
import jakarta.validation.constraints.NotBlank;
import java.util.Date;

public class LoadDto {
    Long id;
    Date date;
    Date giveBack;
    Boolean isRegister;
    @NotBlank(message = "The client name can not be empty")
    private Client client;
    @NotBlank(message = "The book name can not be empty")
    private Book book;
}
