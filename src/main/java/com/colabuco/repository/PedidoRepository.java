package com.colabuco.repository;

import com.colabuco.model.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoModel,Long> {
}
