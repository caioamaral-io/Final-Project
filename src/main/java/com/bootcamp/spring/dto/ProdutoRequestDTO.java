package com.bootcamp.spring.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class ProdutoRequestDTO {

    @NotBlank(message = "Nome não pode ser vazio")
    private String nome;

    @NotNull(message = "Preço não pode ser nulo")
    @Positive(message = "Preço deve ser positivo")
    private Double preco;

    public ProdutoRequestDTO() {}

    public ProdutoRequestDTO(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public Double getPreco() { return preco; }

    public void setNome(String nome) { this.nome = nome; }
    public void setPreco(Double preco) { this.preco = preco; }
}