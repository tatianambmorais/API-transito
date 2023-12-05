package com.algaoworks.algatransito.algatransitoapi.api.controller;

import com.algaoworks.algatransito.algatransitoapi.domain.model.Proprietario;
import com.algaoworks.algatransito.algatransitoapi.domain.repository.ProprietarioRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@RestController
public class ProprietarioController {
    private final ProprietarioRepository proprietarioRepository;


    @GetMapping("/proprietarios")
    public List<Proprietario> listar(){
     return proprietarioRepository.findAll();
    }
}
