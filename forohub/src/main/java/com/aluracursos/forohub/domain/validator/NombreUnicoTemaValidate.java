package com.aluracursos.forohub.domain.validator;

import com.aluracursos.forohub.domain.tema.DatosGeneralesTema;
import com.aluracursos.forohub.infra.exception.ValidacionException;
import com.aluracursos.forohub.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NombreUnicoTemaValidate implements NombreValidator {

    @Autowired
    TemaRepository temaRepository;


    @Override
    public void Validate(DatosGeneralesTema datosGeneralesTema) {
        if (temaRepository.findByTitulo(datosGeneralesTema.titulo()).isPresent()) {
            throw new ValidacionException("Se encontro un tema con el nombre ingresado");
        }


    }
}
