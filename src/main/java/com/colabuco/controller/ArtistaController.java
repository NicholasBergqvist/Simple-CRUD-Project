package com.colabuco.controller;


import com.colabuco.model.ArtistaModel;
import com.colabuco.service.ArtistaService;
import com.colabuco.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/artista")
public class ArtistaController {
    private final ArtistaService artistaService;

    @Autowired
    public ArtistaController(ArtistaService artistaService) {
        this.artistaService = artistaService;
    }

    @GetMapping("/todosArtistas")
    public List<ArtistaModel> getArtistas(){
        return this.artistaService.getArtistas();
    }

    @GetMapping("/{id}")
    public Optional<ArtistaModel> getArtistaById(@PathVariable Long id){
        return this.artistaService.getArtistaById(id);
    }

    @PostMapping("/addArtista")
    public void adicionarArtista(@RequestBody ArtistaModel artista){
        this.artistaService.salvarArtista(artista);
    }
    @DeleteMapping("{id}")
    public void removerArtista(@PathVariable Long id){
        this.artistaService.deleterArtistaById(id);
    }
}
