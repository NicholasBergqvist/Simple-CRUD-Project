package com.colabuco.controller;

import com.colabuco.model.PedidoModel;
import com.colabuco.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {
    private final PedidoService pedidoService;

    @Autowired
    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping("/todosPedidos")
    public List<PedidoModel> getPedidos(){
        return this.pedidoService.getPedidos();
    }

    @GetMapping("/{id}")
    public Optional<PedidoModel> getPedidoById(@PathVariable Long id){
        return this.pedidoService.getPedidoById(id);
    }
    @PostMapping("/addPedido")
    public void adicionarPedido(@RequestBody PedidoModel pedido){
        this.pedidoService.salvarPedido(pedido);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarPedido(@PathVariable Long id){
        this.pedidoService.deleterPedidoById(id);
    }
}
