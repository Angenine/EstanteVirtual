# Estante Virtual

Um sistema gerenciador de coleções pessoais desenvolvido em Java, permitindo organizar Livros, Filmes e Jogos, com funcionalidades de categorização e favoritos.

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
   git clone https://github.com/Angenine/EstanteVirtual.git
   ```
2. Configure o Banco de Dados:

- Crie um banco de dados MySQL chamado estante_virtual (ou o nome que você usou).
- Copie e rode o script abaixo no seu cliente SQL (MySQL Workbench, DBeaver, etc.):

```sql
-- Banco de dados 'EstanteVirtual'
CREATE DATABASE IF NOT EXISTS EstanteVirtual;
USE EstanteVirtual;

-- Tabela 'colecao'
CREATE TABLE colecao (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    -- O tipo de item (apenas 'Livro', 'Filme' ou 'Jogo')
    Tipo ENUM('Livro', 'Filme', 'Jogo') NOT NULL, 
    Nome VARCHAR(255) NOT NULL,
    Genero VARCHAR(100),
    Nota DECIMAL(2, 1) CHECK (Nota >= 0.0 AND Nota <= 5.0),
    Favorito BOOLEAN
);

-- Dados iniciais para teste
INSERT INTO colecao (Tipo, Nome, Genero, Nota, Favorito) VALUES
('Livro', 'O Senhor dos Anéis: A Sociedade do Anel', 'Fantasia', 4.8, TRUE),
('Livro', '1984', 'Ficção Distópica', 4.5, TRUE),
('Livro', 'Cem Anos de Solidão', 'Realismo Mágico', 4.2, FALSE),
('Filme', 'A Viagem de Chihiro', 'Animação', 5.0, TRUE),
('Filme', 'O Poderoso Chefão', 'Drama Policial', 4.9, FALSE),
('Filme', 'Pulp Fiction: Tempo de Violência', 'Neo-Noir', 4.7, TRUE),
('Jogo', 'The Witcher 3: Wild Hunt', 'RPG', 5.0, TRUE),
('Jogo', 'Stardew Valley', 'Simulação', 4.6, TRUE),
('Jogo', 'Red Dead Redemption 2', 'Ação-Aventura', 4.9, FALSE);
```

3. Importe no NetBeans:
- Abra o NetBeans > File > Open Project > Selecione a pasta clonada.
- Execute a classe TelaPrincipal.java.

-----

Desenvolvido por Angeline Izaura de Lima Melo.
