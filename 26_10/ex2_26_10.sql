create database db_ecommerce;

create table tb_produtos(
	id bigint(5) auto_increment,
	nome varchar(29) not null,
    categoria varchar(20),
    valor int(5),
    estoque int(5),
    ativo boolean,
    primary key(id)
);

INSERT INTO tb_produtos(nome, categoria, valor, estoque, ativo) VALUES ("Carne Oriental Seara Incrivel", "100% Vegetal", 15, 120, true);
 
INSERT INTO tb_produtos(nome, categoria, valor, estoque, ativo) VALUES ("Empanado Seara Incrível", "100% Vegetal", 16, 117, true);
 
INSERT INTO tb_produtos(nome, categoria, valor, estoque, ativo) VALUES ("Escondidinho Seara Incrível", "100% Vegetal", 17, 98, true);

INSERT INTO tb_produtos(nome, categoria, valor, estoque, ativo) VALUES ("Creme Dental Boni Natural 90g", "Higiene", 13, 520, true);
 
INSERT INTO tb_produtos(nome, categoria, valor, estoque, ativo) VALUES ("KiCoffee Bullet Vegan", "Vegano", 10, 1310, true);

select * from tb_produtos where valor < 500;
select * from tb_produtos where valor > 500;

update tb_produtos set estoque = 1309 WHERE id = 5;