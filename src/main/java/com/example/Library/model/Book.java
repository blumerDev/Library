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
    private String titulo;
    private Integer ejemplares;

    @Temporal(TemporalType.DATE)
    private Date alta;

    @ManyToOne
    private Author author;

    @ManyToOne
    private Editorial editorial;

    @OneToOne(mappedBy = "load")
    private Load load;
}
