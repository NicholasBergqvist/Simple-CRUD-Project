package com.colabuco.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_pagamento")
public class PagamentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPagamento;
    @Column
    private String formaPagamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cartao_id")
    private CartaoModel cartao;


    public PagamentoModel(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Long getIdPagamento() {
        return idPagamento;
    }


    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
