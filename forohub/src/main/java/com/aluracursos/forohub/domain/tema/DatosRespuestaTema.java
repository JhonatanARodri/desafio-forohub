package com.aluracursos.forohub.domain.tema;

public record DatosRespuestaTema(
        Long id,
        String titulo,
        String mensaje,
        String autor,
        String curso
) {

    public DatosRespuestaTema(Tema tema){
        this(   tema.getId(),
                tema.getTitulo(),
                tema.getMensaje(),
                tema.getAutor(),
                tema.getCurso());
    }

}

