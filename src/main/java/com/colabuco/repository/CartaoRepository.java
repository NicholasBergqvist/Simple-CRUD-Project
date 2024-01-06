package com.colabuco.repository;


import com.colabuco.model.CartaoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaoRepository extends JpaRepository<CartaoModel,Long> {
}
