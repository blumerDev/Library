package com.example.Library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Setter @Getter
@Entity
public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String nombre;
}
