CREATE DATABASE cadastro;
USE cadastro;

CREATE TABLE usuarios (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100),
    telefone VARCHAR(20),
    tipo_usuario VARCHAR(50)
);
DROP TABLE usuarios;
SELECT * FROM usuarios;

CREATE TABLE padaria (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100),
    telefone VARCHAR(20)
);
-- DROP TABLE padaria;
SELECT * FROM padaria;