package com.colabuco.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_carrinho")
public class CarrinhoDeComprasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarrinho;
    private Double valorTotal;

    @OneToOne(mappedBy = "carrinho")
    private ClienteModel cliente;

    @OneToMany(mappedBy = "carrinho")
    private List<PedidoModel> pedidos;

    @ManyToMany
    @JoinTable(
            name = "carrinho_produto",
            joinColumns = @JoinColumn(name = "carrinho_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    private List<ProdutoModel> produtos;

    public CarrinhoDeComprasModel(Double valorTotal, ClienteModel cliente, List<ProdutoModel> produtos) {
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public Long getId() {
        return idCarrinho;
    }

    public void setId(Long id) {
        this.idCarrinho = id;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public List<ProdutoModel> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoModel> produtos) {
        this.produtos = produtos;
    }
}
