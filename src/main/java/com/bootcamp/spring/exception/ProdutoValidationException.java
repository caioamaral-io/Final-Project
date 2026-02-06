package com.bootcamp.spring.exception;

public class ProdutoValidationException extends RuntimeException {
    public ProdutoValidationException(String msg) {
        super(msg);
    }
}