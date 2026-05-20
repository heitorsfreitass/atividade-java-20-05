package com.demo.dig.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "TBL_CLIENTES")
@Data
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ProdutoModel> products;

    public ClienteModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ProdutoModel> getProducts() {
        return products;
    }

    public void setProducts(List<ProdutoModel> products) {
        this.products = products;
    }
}
