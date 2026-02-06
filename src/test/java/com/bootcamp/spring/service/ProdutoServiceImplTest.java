package com.bootcamp.spring.service;

import com.bootcamp.spring.dto.ProdutoRequestDTO;
import com.bootcamp.spring.mapper.ProdutoMapper;
import com.bootcamp.spring.model.Produto;
import com.bootcamp.spring.repository.ProdutoRepository;
import com.bootcamp.spring.service.impl.ProdutoServiceImpl;
import com.bootcamp.spring.service.impl.ProdutoValidationServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoServiceImplTest {

    @Test
    void deveSalvarProdutoComSucesso() {
        ProdutoRepository repository = Mockito.mock(ProdutoRepository.class);
        ProdutoMapper mapper = new ProdutoMapper();
        ProdutoValidationService validation = new ProdutoValidationServiceImpl();

        ProdutoService service = new ProdutoServiceImpl(repository, mapper, validation);

        ProdutoRequestDTO dto = new ProdutoRequestDTO("Mouse", 100.0);
        Produto produto = new Produto(1L, "Mouse", 100.0);

        Mockito.when(repository.save(Mockito.any()))
                .thenReturn(produto);

        var response = service.salvar(dto);

        assertEquals("Mouse", response.getNome());
        assertEquals(100.0, response.getPreco());
    }
}