package com.bootcamp.spring.service.impl;

import com.bootcamp.spring.exception.ProdutoValidationException;
import com.bootcamp.spring.model.Produto;
import com.bootcamp.spring.service.ProdutoValidationService;
import org.springframework.stereotype.Service;

@Service
public class ProdutoValidationServiceImpl implements ProdutoValidationService {

    @Override
    public void validar(Produto produto) {
        if (produto.getPreco() == null || produto.getPreco() <= 0) {
            throw new ProdutoValidationException("Preço deve ser maior que zero");
        }
    }
}