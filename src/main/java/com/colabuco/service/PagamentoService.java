package com.colabuco.service;

import com.colabuco.model.PagamentoModel;
import com.colabuco.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagamentoService {
    private final PagamentoRepository pagamentoRepository;
    @Autowired
    public PagamentoService(PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }

    public List<PagamentoModel> getPagamentos(){
        return this.pagamentoRepository.findAll();
    }

    public Optional<PagamentoModel> getPagamentoById(Long id){
        return this.pagamentoRepository.findById(id);
    }

    public void salvarPagamento(PagamentoModel pagamento){
        this.pagamentoRepository.save(pagamento);

    }

    public void deleterPagamentoById(Long id){
        this.pagamentoRepository.deleteById(id);
    }
}
