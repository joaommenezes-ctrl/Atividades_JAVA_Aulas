CREATE TABLE cliente(
    codigo SERIAL PRIMARY KEY,
    nome varchar(60) not null,
    telefone VARCHAR(11), 
    email VARCHAR(30) NOT NULL UNIQUE);

INSERT INTO cliente 
    (nome, telefone, email) 
VALUES 
    ('Ana','2422439089','ana@gmail.com');