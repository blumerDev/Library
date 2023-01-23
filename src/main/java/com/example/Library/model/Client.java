package com.example.Library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@Setter @Getter

@Entity
public class Client implements Serializable, ClassBase<Client>{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long documento;
    private String nombre;
    private String apellido;
    private String telefono;
    private boolean alta;

}
