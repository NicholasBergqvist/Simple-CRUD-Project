package com.colabuco.controller;

import com.colabuco.model.PedidoModel;
import com.colabuco.model.ProdutoModel;
import com.colabuco.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {
    private final ProdutoService produtoService;

    @Autowired
    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping("/todosProdutos")
    public List<ProdutoModel> getProdutos(){
        return this.produtoService.getProdutos();
    }

    @GetMapping("/{id}")
    public Optional<ProdutoModel> getProdutoById(@PathVariable Long id){
        return this.produtoService.getProdutoById(id);
    }

    @PostMapping("/addProduto")
    public void adicionarProduto(@RequestBody ProdutoModel produto){
        this.produtoService.salvarProduto(produto);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarProdutoById(@PathVariable Long id){
        this.produtoService.deleterProdutoById(id);
    }
}
