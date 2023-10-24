package com.example.demo.entidades;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Teatro implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private String codigo;
    private String nombre;
    private String direccion;

    @OneToMany(mappedBy = "teatro")
    private List<Sala> salas;

    @ManyToOne
    @JoinColumn(name = "ciudad_codigo")
    private Ciudad ciudad;
}
