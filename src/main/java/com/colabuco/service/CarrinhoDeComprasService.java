package com.colabuco.service;

import com.colabuco.model.CarrinhoDeComprasModel;
import com.colabuco.repository.CarrinhoDeComprasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarrinhoDeComprasService {
    private final CarrinhoDeComprasRepository carrinhoDeComprasRepository;

    @Autowired
    public CarrinhoDeComprasService(CarrinhoDeComprasRepository carrinhoDeComprasRepository) {
        this.carrinhoDeComprasRepository = carrinhoDeComprasRepository;
    }
    public List<CarrinhoDeComprasModel> getCarrinhos(){
        return this.carrinhoDeComprasRepository.findAll();
    }

    public Optional<CarrinhoDeComprasModel> getCarrinhoById(Long id){
        return this.carrinhoDeComprasRepository.findById(id);
    }

    public void salvarCarrinho(CarrinhoDeComprasModel carrinho){
        this.carrinhoDeComprasRepository.save(carrinho);

    }

    public void deleterCarrinhoById(Long id){
        this.carrinhoDeComprasRepository.deleteById(id);
    }
}
