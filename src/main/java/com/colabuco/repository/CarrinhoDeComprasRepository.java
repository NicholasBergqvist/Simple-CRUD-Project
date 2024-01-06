package com.colabuco.repository;

import com.colabuco.model.CarrinhoDeComprasModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarrinhoDeComprasRepository extends JpaRepository<CarrinhoDeComprasModel,Long> {
}
