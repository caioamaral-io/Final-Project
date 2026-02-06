package com.bootcamp.spring.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
@Tag(name = "Health Check", description = "Endpoint para verificação de status da API")
public class HealthController {

    @Operation(summary = "Health Check", description = "Verifica se a API está funcionando corretamente")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "API está funcionando")
    })
    @GetMapping
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("API de Produtos está rodando! 🚀 - Versão Azure");
    }
}