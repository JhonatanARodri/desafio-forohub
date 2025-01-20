package com.aluracursos.forohub.repository;

import com.aluracursos.forohub.domain.tema.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TemaRepository extends JpaRepository<Tema, Long> {
    Optional<Tema> findByTitulo(String titulo);

}
