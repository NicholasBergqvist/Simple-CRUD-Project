package com.colabuco.controller;

import com.colabuco.model.CartaoModel;
import com.colabuco.service.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cartao")
public class CartaoController {
    private final CartaoService cartaoService;

    @Autowired
    public CartaoController(CartaoService cartaoService) {
        this.cartaoService = cartaoService;
    }
    @GetMapping("/todosCartoes")
    public List<CartaoModel> getCartoes(){
        return this.cartaoService.getCartoes();
    }

    @GetMapping("/{id}")
    public Optional<CartaoModel> getCartaoById(@PathVariable Long id){
        return this.cartaoService.getCartaoById(id);
    }
    @PostMapping("/addCartao")
    public void adicionarPedido(@RequestBody CartaoModel cartao){
        this.cartaoService.salvarCartao(cartao);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarPedido(@PathVariable Long id){
        this.cartaoService.deleterCartaoById(id);
    }
}
