package com.colabuco.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cliente")
public class ClienteModel extends AbstractCliente {
    @Column
    private String cpf;

    @OneToMany(mappedBy = "cliente")
    private List<CartaoModel> cartoes;

    @OneToMany(mappedBy = "cliente")
    private List<PedidoModel> pedidos;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_carrinho")
    private CarrinhoDeComprasModel carrinho;

    public ClienteModel() {
    }

    public ClienteModel(String nome, String email, String telefone, String endereco, String senha, String cpf) {
        super(nome, email, telefone, endereco, senha);
        this.cpf = cpf;
    }

    public ClienteModel(String nome, String email, String telefone, String endereco, String senha, List<CartaoModel> cartoes, List<PedidoModel> pedidos, CarrinhoDeComprasModel carrinho) {
        super(nome, email, telefone, endereco, senha);
        this.cartoes = cartoes;
        this.pedidos = pedidos;
        this.carrinho = carrinho;
    }

    public ClienteModel(List<CartaoModel> cartoes, List<PedidoModel> pedidos, CarrinhoDeComprasModel carrinho) {
        this.cartoes = cartoes;
        this.pedidos = pedidos;
        this.carrinho = carrinho;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<CartaoModel> getCartoes() {
        return cartoes;
    }

    public void setCartoes(List<CartaoModel> cartoes) {
        this.cartoes = cartoes;
    }

    public List<PedidoModel> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidoModel> pedidos) {
        this.pedidos = pedidos;
    }

    public CarrinhoDeComprasModel getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(CarrinhoDeComprasModel carrinho) {
        this.carrinho = carrinho;
    }
}
