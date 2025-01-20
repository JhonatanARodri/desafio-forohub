package com.aluracursos.forohub.domain.tema;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosGeneralesTema (
    @NotBlank
    String titulo,
    @NotBlank
    String mensaje,
    @NotNull
    LocalDateTime fechaCreacion,
    @NotBlank
    Estado estado,
    @NotBlank
    String autor,
    @NotBlank
    String curso)
{
}
