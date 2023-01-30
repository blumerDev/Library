package com.example.Library.model;

import jakarta.persistence.*;
import lombok.*;

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
