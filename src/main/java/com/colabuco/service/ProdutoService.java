package com.colabuco.service;

import com.colabuco.model.PedidoModel;
import com.colabuco.model.ProdutoModel;
import com.colabuco.repository.PedidoRepository;
import com.colabuco.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }


    public List<ProdutoModel> getProdutos(){
        return this.produtoRepository.findAll();
    }

    public Optional<ProdutoModel> getProdutoById(Long id){
        return this.produtoRepository.findById(id);
    }

    public void salvarProduto(ProdutoModel produto){
        this.produtoRepository.save(produto);

    }

    public void deleterProdutoById(Long id){
        this.produtoRepository.deleteById(id);
    }
}
