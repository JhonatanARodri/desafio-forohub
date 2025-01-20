package com.aluracursos.forohub.domain.tema;

public record DatosActualizacionTema(
        Long id,
        String titulo,
        String mensaje,
        String autor,
        Estado actualizacionEstado
) {
}
