package com.example.ProjectoRepaso.estudiantes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "estudiante")
public class Estudiante {

    @Id
    @SequenceGenerator(
            name = "estudiante_seq",
            sequenceName = "estudiante_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "estudiante_seq"
    )
    private Integer id;

    private String nombre;
    private String carrera;
}
