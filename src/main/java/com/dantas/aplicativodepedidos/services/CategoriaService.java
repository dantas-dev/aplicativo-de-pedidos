package com.dantas.aplicativodepedidos.services;

import com.dantas.aplicativodepedidos.model.Categoria;
import com.dantas.aplicativodepedidos.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;


    public Categoria findCategoria(Integer id) {
        Optional<Categoria> categoria = categoriaRepository.findById(id);
        return categoria.get();
    }
}
