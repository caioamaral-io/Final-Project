package com.bootcamp.spring.service.impl;

import com.bootcamp.spring.dto.*;
import com.bootcamp.spring.service.ProdutoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceLogImpl implements ProdutoService {

    @Override
    public ProdutoResponseDTO salvar(ProdutoRequestDTO dto) {
        System.out.println("Log de auditoria");
        throw new UnsupportedOperationException();
    }

    @Override
    public List<ProdutoResponseDTO> listar() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ProdutoResponseDTO buscarPorId(Long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ProdutoResponseDTO atualizar(Long id, ProdutoRequestDTO dto) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remover(Long id) {
        throw new UnsupportedOperationException();
    }
}