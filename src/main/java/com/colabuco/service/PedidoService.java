package com.colabuco.service;

import com.colabuco.model.PedidoModel;
import com.colabuco.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    private final PedidoRepository pedidoRepository;

    @Autowired
    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }
    public List<PedidoModel> getPedidos(){
        return this.pedidoRepository.findAll();
    }

    public Optional<PedidoModel> getPedidoById(Long id){
        return this.pedidoRepository.findById(id);
    }

    public void salvarPedido(PedidoModel pedido){
        this.pedidoRepository.save(pedido);

    }

    public void deleterPedidoById(Long id){
        this.pedidoRepository.deleteById(id);
    }
}
