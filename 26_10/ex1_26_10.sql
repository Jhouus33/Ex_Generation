create database db_funcionarios_empresa_XYZ;

create table tb_funcionarios(
	id bigint(5) auto_increment,
	nome varchar(20) not null,
    cargo varchar(20),
    salario int(5),
    ativo boolean,
    primary key(id)
);

select * from tb_funcionarios;

INSERT INTO tb_funcionarios(nome, cargo, salario, ativo) Values ("Erick", "Dev. Front-end", 3000, true);
INSERT INTO tb_funcionarios(nome, cargo, salario, ativo) Values ("Gustavo S.", "Dev. Back-end", 3300, true);
INSERT INTO tb_funcionarios(nome, cargo, salario, ativo) Values ("Caio M.", "Dev. Full Stack", 4300, true);
INSERT INTO tb_funcionarios(nome, cargo, salario, ativo) Values ("Felipe C.", "Software Engineer", 8200, true);
INSERT INTO tb_funcionarios(nome, cargo, salario, ativo) Values ("Jonathan F.", "Estágiario", 1100, true);

SELECT * FROM tb_funcionarios;

UPDATE tb_funcionarios SET nome = "Erick Neves" WHERE id = 1;

select * from tb_funcionarios where salario < 2000;

select * from tb_funcionarios where salario > 2000;