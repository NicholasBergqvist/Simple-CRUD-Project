package com.colabuco.controller;

import com.colabuco.model.ClienteModel;
import com.colabuco.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    private ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/clientes")
    public List<ClienteModel> getClientes(){
        return this.clienteService.getClientes();
    }

    @GetMapping("/cliente/{id}")
    public Optional<ClienteModel> getClienteById(@PathVariable Long id){
        return this.clienteService.getClienteById(id);
    }
    @PostMapping("/addCliente")
    public void adicionarCliente(@RequestBody ClienteModel cliente){
        this.clienteService.salvarCliente(cliente);
    }
    @DeleteMapping("/deletar/{id}")
    public void removerCliente(@PathVariable Long id){
        this.clienteService.deleterClienteById(id);
    }
}


