package com.bootcamp.spring.repository;

import com.bootcamp.spring.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}