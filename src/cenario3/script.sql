CREATE DATABASE RodaGigante;

-- Definição da tabela Pessoa
CREATE TABLE Pessoa (
                        ID INT PRIMARY KEY NOT NULL,
                        Nome VARCHAR(50) NOT NULL,
                        Idade INT NOT NULL
                    );

-- Definição da tabela Gondola
CREATE TABLE Gondola (
                        Numero INT PRIMARY KEY NOT NULL,
                        Assento1 INT NOT NULL,
                        Assento2 INT NOT NULL,
                        FOREIGN KEY (Assento1) REFERENCES Pessoa(ID),
                        FOREIGN KEY (Assento2) REFERENCES Pessoa(ID)
                    );

-- Inserindo dados
INSERT INTO Pessoa (ID, Nome, Idade) VALUES (1, 'Maria Clara', 18);
INSERT INTO Pessoa (ID, Nome, Idade) VALUES (2, 'Pedro Queblas', 20);
INSERT INTO Gondola (Numero, Assento1, Assento2) VALUES (17, 1, 2);

INSERT INTO Pessoa (ID, Nome, Idade) VALUES (3, 'Mariana Xavier', 21);
INSERT INTO Pessoa (ID, Nome, Idade) VALUES (4, 'João Martins', 30);
INSERT INTO Gondola (Numero, Assento1, Assento2) VALUES (18, 3, 4);