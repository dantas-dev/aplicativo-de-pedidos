package com.dantas.aplicativodepedidos.controller;

import com.dantas.aplicativodepedidos.model.Categoria;
import com.dantas.aplicativodepedidos.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findCategoria(@PathVariable Integer id) {
        Categoria categoria = categoriaService.findCategoria(id);
        return ResponseEntity.ok().body(categoria);
    }
}
