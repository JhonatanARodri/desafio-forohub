package com.aluracursos.forohub.domain.tema;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "tema")
@Entity
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion;
    private Estado estado;
    private String autor;
    private String curso;

    public Tema(@Valid DatosGeneralesTema datosGeneralesTema) {
        this.titulo = datosGeneralesTema.titulo();
        this.mensaje = datosGeneralesTema.mensaje();
        this.fechaCreacion = datosGeneralesTema.fechaCreacion();
        this.estado = datosGeneralesTema.estado();
        this.autor = datosGeneralesTema.autor();
        this.curso = datosGeneralesTema.curso();
    }

    public void informacionActualizada(@Valid DatosActualizacionTema datos){
        if (datos.titulo() != null) this.titulo = datos.titulo();
        if (datos.mensaje() != null) this.mensaje = datos.mensaje();
        if (datos.autor() != null) this.autor = datos.autor();
        if (datos.actualizacionEstado() != null) this.estado = datos.actualizacionEstado();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getAutor() {
        return autor;
    }

    public String getCurso() {
        return curso;
    }
}
