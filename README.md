# Estante Virtual

Um sistema gerenciador de coleções pessoais desenvolvido em Java, permitindo organizar Livros, Filmes e Jogos, com funcionalidades de categorização e favoritos.

![Badge Concluído](http://img.shields.io/static/v1?label=STATUS&message=CONCLUÍDO&color=GREEN&style=for-the-badge)

## Demonstração

![Tela Principal](TelaPrincipal(EstanteVirtual).png)

## Funcionalidades

- **Cadastro Completo (CRUD):** Adicionar, visualizar, editar e excluir itens da coleção.
- **Dashboard de Métricas:** Contadores em tempo real mostrando a quantidade de itens por categoria (Filmes, Livros, Jogos e Favoritos).
- **Sistema de Filtros:**
  - Filtragem dinâmica por categoria (Checkbox).
  - Busca textual por nome do item.
  - Filtro de favoritos.
- **Interface Gráfica:** Interface amigável desenvolvida com Java Swing.

## Tecnologias Utilizadas

- **Java 21** (Linguagem principal)
- **Swing/AWT** (Interface Gráfica)
- **JDBC & MySQL** (Banco de Dados)
- **NetBeans IDE** (Ambiente de desenvolvimento)

## Estrutura do Projeto

O projeto utiliza o padrão de arquitetura em camadas:
- **View:** Telas e interface com o usuário (`TelaPrincipal`, `CadastrarItem`).
- **DAO (Data Access Object):** Comunicação com o banco de dados.
- **DTO (Data Transfer Object):** Objetos de transferência de dados (Modelo).

## Como rodar o projeto

### Pré-requisitos
- Java JDK 21 ou superior instalado.
- NetBeans IDE (recomendado).
- MySQL Server instalado.

### Passo a passo

1. Clone o repositório:
   ```bash
   git clone 
