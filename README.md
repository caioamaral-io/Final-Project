<h1 align="center">API de Produtos - Bootcamp Spring Boot</h1>

<div align="center">

![Java](https://img.shields.io/badge/Java-21-orange?style=flat&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.2-green?style=flat&logo=spring)
![Maven](https://img.shields.io/badge/Maven-3.9.4-red?style=flat&logo=apache-maven)
![H2 Database](https://img.shields.io/badge/H2%20Database-2.2.224-blue?style=flat&logo=database)
![Swagger](https://img.shields.io/badge/Swagger-2.2.0-green?style=flat&logo=swagger)

</div>

# Gerenciamento de Produtos

Este projeto é uma API REST para gerenciamento de produtos, como projeto final do Bootcamp Java da Deloitte. A aplicação foi projetada com foco na arquitetura limpa, boas práticas de desenvolvimento, princípios SOLID e qualidade de código, servindo como uma base sólida para aplicações Java modernas e escaláveis.

A API permite a execução completa de operações CRUD (Create, Read, Update, Delete) de forma clara, organizada e segura, utilizando DTOs, camada de serviço, Spring Data JPA e Hibernate. Para facilitar o desenvolvimento e os testes, é utilizado um banco de dados H2 em memória, juntamente com documentação interativa via Swagger e deployment na nuvem via Microsoft Azure.

Toda a comunicação com o cliente é realizada por JSON, seguindo estritamente os padrões REST, com os códigos de status HTTP apropriados sendo retornados para cada cenário.

# Comece aqui
Leia toda documentação para começar: https://bootdocs.vercel.app/docs


# Frontend
Leia toda documentação para começar: https://product-bootcamp.vercel.app

## Visão Geral

A API foi projetada para servir como uma base sólida e profissional para projetos Java usando Spring Boot, demonstrando uma arquitetura limpa, de fácil manutenção e escalabilidade.

### Funcionalidades Disponíveis

- Criação e listagem de produtos;
- Busca de produto por ID;
- Atualização e remoção de registros;
- Validação de dados utilizando Bean Validation;
- Tratamento de exceções global e personalizado;
- Mensagem simples para verificação do status da API;
- Acesso ao console H2 via navegador para inspeção do banco de dados;
- Documentação interativa com Swagger UI para testes rápidos de endpoints.

## Filosofia

O objetivo principal do projeto é demonstrar uma abordagem didática, profissional e escalável para construção de APIs REST com Spring Boot, aplicando conceitos amplamente utilizados em aplicações do mundo real.

Para alcançar isso, a aplicação adota os seguintes princípios:

- **Arquitetura limpa**, com clara separação de responsabilidades;
- **Isolamento das camadas Controller, Service e Repository**;
- **Uso de DTOs** para evitar a exposição direta das entidades de domínio;
- **Uso de mappers** para conversão entre entidades e DTOs;
- **Tratamento centralizado de exceções**, garantindo respostas padronizadas e amigáveis ao usuário;
- **Validações robustas** para garantir a integridade dos dados;
- **Banco de dados em memória (H2)** para desenvolvimento e testes rápidos;
- **Estrutura preparada para deployment na nuvem** através da Microsoft Azure.

Essa estrutura melhora a legibilidade, manutenção e torna o projeto facilmente extensível para aplicações maiores e mais complexas.

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **Hibernate**
- **Banco de Dados H2**
- **Swagger**
- **Maven**
- **Microsoft Azure** (deployment)

## URLs Gerais
- **Azure:** https://ca-bootcamp-gmcpg9ggcddbhug3.brazilsouth-01.azurewebsites.net
- **Swagger:** https://ca-bootcamp-gmcpg9ggcddbhug3.brazilsouth-01.azurewebsites.net/swagger-ui.html
