CREATE DATABASE db_login;

USE db_login;

-- DROP TABLE Pessoa;

CREATE TABLE Pessoa(
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(100),
    endereco VARCHAR(100),
    sexo VARCHAR(50),
    cpf VARCHAR(50),
    curso VARCHAR(50),
    matricula VARCHAR(50)
)AUTO_INCREMENT=1;

SELECT * FROM Pessoa;