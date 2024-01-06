package com.colabuco.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_pedido")
public class PedidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;
    private Double valor;
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "carrinho_id")
    private CarrinhoDeComprasModel carrinho;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private ClienteModel cliente;

    public PedidoModel(){}

    public PedidoModel(Double valor, String status, CarrinhoDeComprasModel carrinho, ClienteModel cliente) {
        this.valor = valor;
        this.status = status;
        this.carrinho = carrinho;
        this.cliente = cliente;
    }

    public Long getId() {
        return idPedido;
    }


    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CarrinhoDeComprasModel getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(CarrinhoDeComprasModel carrinho) {
        this.carrinho = carrinho;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }
}
