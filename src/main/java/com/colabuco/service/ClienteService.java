package com.colabuco.service;

import com.colabuco.model.ClienteModel;
import com.colabuco.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }


    public List<ClienteModel> getClientes(){
        return this.clienteRepository.findAll();
    }

    public Optional<ClienteModel> getClienteById(Long id){
        return this.clienteRepository.findById(id);
    }

    public void salvarCliente(ClienteModel cliente){
        this.clienteRepository.save(cliente);

    }

    public void deleterClienteById(Long id){
        this.clienteRepository.deleteById(id);
    }
}
