package com.example.Library.dto.request;

import com.example.Library.model.Author;
import com.example.Library.model.Editorial;
import com.example.Library.model.Load;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Setter @Getter
public class BookDto {

    private String titulo;
    private int ejemplares;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date alta;

    private Author author;

    private Editorial editorial;

}
