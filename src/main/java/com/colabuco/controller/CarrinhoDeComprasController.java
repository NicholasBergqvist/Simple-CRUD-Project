package com.colabuco.controller;

import com.colabuco.model.CarrinhoDeComprasModel;
import com.colabuco.service.CarrinhoDeComprasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/carrinho")
public class CarrinhoDeComprasController {
    private final CarrinhoDeComprasService carrinhoDeComprasService;

    @Autowired
    public CarrinhoDeComprasController(CarrinhoDeComprasService carrinhoDeComprasService) {
        this.carrinhoDeComprasService = carrinhoDeComprasService;
    }
    @GetMapping("/allCarrinhos")
    public List<CarrinhoDeComprasModel> getCarrinhos(){
        return this.carrinhoDeComprasService.getCarrinhos();
    }
    @GetMapping("/carrinho/{id}")
    public Optional<CarrinhoDeComprasModel> getCarrinhoById(@PathVariable Long id){
        return this.carrinhoDeComprasService.getCarrinhoById(id);
    }
    @PostMapping("/addCarrinho")
    public void adicionarCarrinho(@RequestBody CarrinhoDeComprasModel carrinho){
        this.carrinhoDeComprasService.salvarCarrinho(carrinho);
    }

    @DeleteMapping("/deletar/{id}")
    public void deleterCarrinho(@PathVariable Long id){
        this.carrinhoDeComprasService.deleterCarrinhoById(id);
    }
}
