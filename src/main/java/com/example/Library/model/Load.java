package com.example.Library.model;

import jakarta.persistence.*;
import lombok.*;


import java.util.Date;
@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor @Builder
@Entity
public class Load {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    private Date devolucion;
    private Boolean alta;

    @OneToOne
    private Client client;
    @OneToOne
    private Book book;

}
