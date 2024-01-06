package com.colabuco.model;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "tb_cartao")
public class CartaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCartao;
    private String numCartao;
    private String validade;
    private String instituicao;
    private String bandeira;
    private String cvv;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private ClienteModel cliente;

    @OneToMany(mappedBy = "cartao")
    private List<PagamentoModel> pagamentos;
    public CartaoModel(){}
    public CartaoModel(String numCartao, String validade, String instituicao, String bandeira, String cvv, ClienteModel cliente) {
        this.numCartao = numCartao;
        this.validade = validade;
        this.instituicao = instituicao;
        this.bandeira = bandeira;
        this.cvv = cvv;
        this.cliente = cliente;
    }

}
