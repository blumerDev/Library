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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int ejemplares;

    @Temporal(TemporalType.DATE)
    private Date alta;

    @ManyToOne(cascade = CascadeType.DETACH)
    private Author author;

    @ManyToOne(cascade = CascadeType.DETACH)
    private Editorial editorial;

    @OneToOne(mappedBy = "book", cascade = CascadeType.REMOVE)
    private Load load;
}
