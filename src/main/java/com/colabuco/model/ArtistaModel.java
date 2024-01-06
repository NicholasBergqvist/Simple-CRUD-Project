package com.colabuco.model;
import jakarta.persistence.*;

import java.lang.annotation.Inherited;
import java.util.List;
@Entity
@Table(name = "tb_artista")
public class ArtistaModel extends AbstractCliente {

    @Column
    private String cnpj;

    @Column
    private String categoriaArte;

    @Column
    private String frete;

    @Column
    private String descricao;

    @OneToMany(mappedBy = "artista")
    private List<ProdutoModel> produtos;

    public ArtistaModel() {
    }


    public ArtistaModel(String nome, String email, String telefone, String endereco, String senha, String cnpj, String categoriaArte, String frete, String descricao) {
        super(nome, email, telefone, endereco, senha);
        this.cnpj = cnpj;
        this.categoriaArte = categoriaArte;
        this.frete = frete;
        this.descricao = descricao;
    }

    public ArtistaModel(String nome, String email, String telefone, String endereco, String senha, String cnpj, String categoriaArte, String frete, String descricao, List<ProdutoModel> produtos) {
        super(nome, email, telefone, endereco, senha);
        this.cnpj = cnpj;
        this.categoriaArte = categoriaArte;
        this.frete = frete;
        this.descricao = descricao;
        this.produtos = produtos;
    }

    public ArtistaModel(String cnpj, String categoriaArte, String frete, String descricao, List<ProdutoModel> produtos) {
        this.cnpj = cnpj;
        this.categoriaArte = categoriaArte;
        this.frete = frete;
        this.descricao = descricao;
        this.produtos = produtos;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCategoriaArte() {
        return categoriaArte;
    }

    public void setCategoriaArte(String categoriaArte) {
        this.categoriaArte = categoriaArte;
    }

    public String getFrete() {
        return frete;
    }

    public void setFrete(String frete) {
        this.frete = frete;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<ProdutoModel> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoModel> produtos) {
        this.produtos = produtos;
    }
}
