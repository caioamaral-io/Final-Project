package com.bootcamp.spring.service;

import com.bootcamp.spring.dto.*;

import java.util.List;

public interface ProdutoService {
    ProdutoResponseDTO salvar(ProdutoRequestDTO dto);
    List<ProdutoResponseDTO> listar();
    ProdutoResponseDTO buscarPorId(Long id);
    ProdutoResponseDTO atualizar(Long id, ProdutoRequestDTO dto);
    void remover(Long id);
}