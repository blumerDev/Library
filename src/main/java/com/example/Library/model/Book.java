package com.example.Library.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int available;

    @Temporal(TemporalType.DATE)
    private Date isRegister;

    @ManyToOne(cascade = CascadeType.DETACH)
    private Author author;

    @ManyToOne(cascade = CascadeType.DETACH)
    private Editorial editorial;

    @OneToOne(mappedBy = "book", cascade = CascadeType.REMOVE)
    private Load load;
}
