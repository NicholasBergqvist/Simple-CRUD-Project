package com.colabuco.service;

import com.colabuco.model.CartaoModel;
import com.colabuco.repository.CartaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartaoService {
    private final CartaoRepository cartaoRepository;

    public CartaoService(CartaoRepository cartaoRepository) {
        this.cartaoRepository = cartaoRepository;
    }

    public List<CartaoModel> getCartoes(){
        return this.cartaoRepository.findAll();
    }

    public Optional<CartaoModel> getCartaoById(Long id){
        return this.cartaoRepository.findById(id);
    }

    public void salvarCartao(CartaoModel cartao){
        this.cartaoRepository.save(cartao);

    }
    public void deleterCartaoById(Long id){
        this.cartaoRepository.deleteById(id);
    }
}
