package com.colabuco.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_produto")
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduto;
    private String nome;
    private String categoria;
    private String descricao;
    private Double preco;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "artista_id")
    private ArtistaModel artista;
    public ProdutoModel(){

    }
    public ProdutoModel(String nome, String categoria, String descricao, Double preco, ArtistaModel artista) {

        this.nome = nome;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
        this.artista = artista;
    }

    public Long getId() {
        return idProduto;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public ArtistaModel getArtista() {
        return artista;
    }

    public void setArtista(ArtistaModel artista) {
        this.artista = artista;
    }
}
