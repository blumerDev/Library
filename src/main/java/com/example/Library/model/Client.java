package com.example.Library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Setter @Getter
@Entity
public class Client{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Long documento;
    private String nombre;
    private String apellido;
    private String telefono;
    private boolean alta;

}
