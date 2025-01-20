package com.aluracursos.forohub.domain.curso;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of ="id")
@Getter
@Table(name = "curso")
@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreCurso;
    private String categoria;
}
