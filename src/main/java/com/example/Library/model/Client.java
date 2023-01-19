package com.example.Library.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client extends ClassBase{
    private Long documento;
    private String nombre;
    private String apellido;
    private String telefono;
    private boolean alta;

}
