CREATE DATABASE IF NOT EXISTS cadastro;

USE cadastro;

-- DROP DATABASE cadastro;

CREATE TABLE usuarios(
	id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100),
    telefone VARCHAR(100),
    tipo_usuario VARCHAR(100)
);

SELECT * FROM usuarios;
