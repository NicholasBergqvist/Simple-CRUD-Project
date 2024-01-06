package com.colabuco.controller;

import com.colabuco.model.PagamentoModel;
import com.colabuco.model.PedidoModel;
import com.colabuco.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pagamento")
public class PagamentoController {
    private final PagamentoService pagamentoService;

    @Autowired
    public PagamentoController(PagamentoService pagamentoService) {
        this.pagamentoService = pagamentoService;
    }
    @GetMapping("/todosPagamentos")
    public List<PagamentoModel> getPagamentos(){
        return this.pagamentoService.getPagamentos();
    }

    @GetMapping("/{id}")
    public Optional<PagamentoModel> getPagamentoById(@PathVariable Long id){
        return this.pagamentoService.getPagamentoById(id);
    }
    @PostMapping("/addPagamento")
    public void adicionarPagamento(@RequestBody PagamentoModel pagamento){
        this.pagamentoService.salvarPagamento(pagamento);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarPagamento(@PathVariable Long id){
        this.pagamentoService.deleterPagamentoById(id);
    }
}
