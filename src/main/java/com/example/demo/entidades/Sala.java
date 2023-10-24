package com.example.demo.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sala implements Serializable {
    @Id
    private Long id;
    private String codigo;
    private String nombre;
    private int capacidad;

    @ManyToOne
    @JoinColumn(name = "teatro_id")
    private Teatro teatro;
}
