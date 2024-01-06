package com.colabuco.repository;

import com.colabuco.model.ArtistaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<ArtistaModel,Long> {
}
