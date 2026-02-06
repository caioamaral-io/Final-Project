package com.bootcamp.spring.mapper;

import com.bootcamp.spring.dto.*;
import com.bootcamp.spring.model.Produto;
import org.springframework.stereotype.Component;

@Component
public class ProdutoMapper {

    public Produto toEntity(ProdutoRequestDTO dto) {
        Produto produto = new Produto();
        produto.setNome(dto.getNome());
        produto.setPreco(dto.getPreco());
        return produto;
    }

    public ProdutoResponseDTO toDTO(Produto produto) {
        return new ProdutoResponseDTO(
                produto.getId(),
                produto.getNome(),
                produto.getPreco()
        );
    }
}