package com.bootcamp.spring.service.impl;

import com.bootcamp.spring.dto.*;
import com.bootcamp.spring.exception.ProdutoNotFoundException;
import com.bootcamp.spring.mapper.ProdutoMapper;
import com.bootcamp.spring.model.Produto;
import com.bootcamp.spring.repository.ProdutoRepository;
import com.bootcamp.spring.service.*;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository repository;
    private final ProdutoMapper mapper;
    private final ProdutoValidationService validationService;

    public ProdutoServiceImpl(
            ProdutoRepository repository,
            ProdutoMapper mapper,
            ProdutoValidationService validationService
    ) {
        this.repository = repository;
        this.mapper = mapper;
        this.validationService = validationService;
    }

    @Override
    public ProdutoResponseDTO salvar(ProdutoRequestDTO dto) {
        Produto produto = mapper.toEntity(dto);
        validationService.validar(produto);
        return mapper.toDTO(repository.save(produto));
    }

    @Override
    public List<ProdutoResponseDTO> listar() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }

    @Override
    public ProdutoResponseDTO buscarPorId(Long id) {
        Produto produto = repository.findById(id)
                .orElseThrow(() -> new ProdutoNotFoundException(id));
        return mapper.toDTO(produto);
    }

    @Override
    public ProdutoResponseDTO atualizar(Long id, ProdutoRequestDTO dto) {
        Produto produto = repository.findById(id)
                .orElseThrow(() -> new ProdutoNotFoundException(id));

        produto.setNome(dto.getNome());
        produto.setPreco(dto.getPreco());

        validationService.validar(produto);
        return mapper.toDTO(repository.save(produto));
    }

    @Override
    public void remover(Long id) {
        if (!repository.existsById(id)) {
            throw new ProdutoNotFoundException(id);
        }
        repository.deleteById(id);
    }
}