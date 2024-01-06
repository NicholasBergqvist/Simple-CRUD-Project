package com.colabuco.repository;

import com.colabuco.model.PagamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<PagamentoModel,Long> {
}
