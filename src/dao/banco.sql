-- 1. Cria o banco de dados 'EstanteVirtual'
CREATE DATABASE IF NOT EXISTS EstanteVirtual;

-- 2. Seleciona o banco de dados para uso
USE EstanteVirtual;

-- 3. Cria a tabela 'colecao'
CREATE TABLE colecao (
    -- ID como chave primária e autoincremento para facilitar o gerenciamento
    ID INT AUTO_INCREMENT PRIMARY KEY,
    
    -- O tipo de item (apenas 'Livro', 'Filme' ou 'Jogo')
    Tipo ENUM('Livro', 'Filme', 'Jogo') NOT NULL, 
    
    -- O nome do item (VARCHAR com limite de 255 caracteres)
    Nome VARCHAR(255) NOT NULL,
    
    -- O gênero do item (VARCHAR com limite de 100 caracteres)
    Genero VARCHAR(100),
    
    -- A nota, que varia de 0.0 a 5.0, permitindo um dígito antes e um depois da vírgula (ponto no SQL)
    -- DECIMAL(2, 1) armazena números com 2 dígitos no total, sendo 1 após o ponto (ex: 1.5, 5.0).
    Nota DECIMAL(2, 1) CHECK (Nota >= 0.0 AND Nota <= 5.0),
    
    -- Indica se é favorito (TRUE ou FALSE). BOOLEAN é um sinônimo de TINYINT(1) no MySQL.
    Favorito BOOLEAN
);

-- 4. Insere 3 itens pré-prontos de cada Tipo (Livro, Filme, Jogo)

-- LIVROS
INSERT INTO colecao (Tipo, Nome, Genero, Nota, Favorito) VALUES
('Livro', 'O Senhor dos Anéis: A Sociedade do Anel', 'Fantasia', 4.8, TRUE),
('Livro', '1984', 'Ficção Distópica', 4.5, TRUE),
('Livro', 'Cem Anos de Solidão', 'Realismo Mágico', 4.2, FALSE);

-- FILMES
INSERT INTO colecao (Tipo, Nome, Genero, Nota, Favorito) VALUES
('Filme', 'A Viagem de Chihiro', 'Animação', 5.0, TRUE),
('Filme', 'O Poderoso Chefão', 'Drama Policial', 4.9, FALSE),
('Filme', 'Pulp Fiction: Tempo de Violência', 'Neo-Noir', 4.7, TRUE);

-- JOGOS
INSERT INTO colecao (Tipo, Nome, Genero, Nota, Favorito) VALUES
('Jogo', 'The Witcher 3: Wild Hunt', 'RPG', 5.0, TRUE),
('Jogo', 'Stardew Valley', 'Simulação', 4.6, TRUE),
('Jogo', 'Red Dead Redemption 2', 'Ação-Aventura', 4.9, FALSE);

-- 5. Consulta para verificar os dados inseridos (opcional)
SELECT * FROM colecao;