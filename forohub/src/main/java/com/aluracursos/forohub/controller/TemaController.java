package com.aluracursos.forohub.controller;


import com.aluracursos.forohub.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tema")
public class TemaController {

    @Autowired
    TemaRepository temaRepository;

}
