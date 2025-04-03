-- Criar o banco de dados caso não exista
CREATE DATABASE IF NOT EXISTS SistemaAcademico;

-- Seleciona o banco de dados SistemaAcademico para uso
USE SistemaAcademico;

-- Exibe as tabelas do banco de dados atual
SHOW TABLES;

-- Tabela Curso
CREATE TABLE IF NOT EXISTS `Curso` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `descricao` VARCHAR(255),
  PRIMARY KEY (`codigo`)
) ENGINE = InnoDB;

-- Tabela SituacaoAluno
CREATE TABLE IF NOT EXISTS `SituacaoAluno` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE = InnoDB;

-- Tabela Turma
CREATE TABLE IF NOT EXISTS `Turma` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  `curso_codigo` INT NOT NULL,  -- Chave estrangeira para o curso
  PRIMARY KEY (`codigo`),
  FOREIGN KEY (`curso_codigo`) REFERENCES `Curso`(`codigo`)
) ENGINE = InnoDB;

-- Tabela Aluno
CREATE TABLE aluno (
    codigo INT(11) NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    status TINYINT(1) NOT NULL,
    situacao_codigo INT(11) NOT NULL,
    turma_codigo INT(11) NOT NULL,
    PRIMARY KEY (codigo),
    FOREIGN KEY (situacao_codigo) REFERENCES situacaoaluno(codigo), -- Relacionamento com a tabela 'situacaoaluno'
    FOREIGN KEY (turma_codigo) REFERENCES turma(codigo) -- Relacionamento com a tabela 'turma'
);


-- Tabela Professor
CREATE TABLE IF NOT EXISTS `Professor` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE = InnoDB;

-- Tabela Frequencia
CREATE TABLE IF NOT EXISTS `Frequencia` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `data` DATE NOT NULL,
  `presente` BOOLEAN NOT NULL,
  `aluno_codigo` INT NOT NULL,  -- Alterado para 'codigo' em vez de 'matricula'
  PRIMARY KEY (`codigo`),
  FOREIGN KEY (`aluno_codigo`) REFERENCES `Aluno`(`codigo`)  -- Alterado para 'codigo'
) ENGINE = InnoDB;

-- Tabela RegistroFrequencia
CREATE TABLE IF NOT EXISTS `RegistroFrequencia` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `frequencia_codigo` INT NOT NULL,  -- Chave estrangeira para a frequência
  `professor_codigo` INT NOT NULL,  -- Chave estrangeira para o professor
  `data_registro` DATE NOT NULL,
  PRIMARY KEY (`codigo`),
  FOREIGN KEY (`frequencia_codigo`) REFERENCES `Frequencia`(`codigo`),
  FOREIGN KEY (`professor_codigo`) REFERENCES `Professor`(`codigo`)
) ENGINE = InnoDB;

-- Tabela Avaliacao
CREATE TABLE IF NOT EXISTS `Avaliacao` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE = InnoDB;

-- Tabela RegistroAvaliacao
CREATE TABLE IF NOT EXISTS `RegistroAvaliacao` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `avaliacao_codigo` INT NOT NULL,  -- Chave estrangeira para a avaliação
  `aluno_codigo` INT NOT NULL,  -- Alterado para 'codigo' em vez de 'matricula'
  `nota` DECIMAL(5,2) NOT NULL,
  PRIMARY KEY (`codigo`),
  FOREIGN KEY (`avaliacao_codigo`) REFERENCES `Avaliacao`(`codigo`),
  FOREIGN KEY (`aluno_codigo`) REFERENCES `Aluno`(`codigo`)  -- Alterado para 'codigo'
) ENGINE = InnoDB;
