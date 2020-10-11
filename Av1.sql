--- Apaga a base de dados a1 caso exista
DROP DATABASE a1;

--Cria uma noa base de dados chamada a1
CREATE DATABASE a1;

-- conecta na base de dados av1
\c av1;

-- cria a tabela funcionários
CREATE TABLE funcionarios(
		matricula INTEGER PRIMARY KEY,
		nome varchar(50),
		email varchar(50) UNIQUE,
		dt_nasc DATE,
		senha varchar(10)
);
