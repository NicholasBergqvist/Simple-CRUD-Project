package com.colabuco.service;

import com.colabuco.model.ArtistaModel;
import com.colabuco.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistaService {
    private final ArtistaRepository artistaRepository;

    @Autowired
    public ArtistaService(ArtistaRepository artistaRepository) {
        this.artistaRepository = artistaRepository;
    }
    public List<ArtistaModel> getArtistas(){
        return this.artistaRepository.findAll();
    }

    public Optional<ArtistaModel> getArtistaById(Long id){
        return this.artistaRepository.findById(id);
    }

    public void salvarArtista(ArtistaModel artista){
        this.artistaRepository.save(artista);

    }

    public void deleterArtistaById(Long id){
        this.artistaRepository.deleteById(id);
    }
}
