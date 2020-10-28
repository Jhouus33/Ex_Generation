create database db_ecommerce2;



create table tb_categoria(
	id bigint(3) auto_increment,
    tipo varchar(30),
    ativo boolean,
    primary key (id)
);

insert into tb_categoria (tipo, ativo) values ("Tvs e Vídeo", true);
insert into tb_categoria (tipo, ativo) values ("Telefonia", true);
insert into tb_categoria (tipo, ativo) values ("Eletroportáteis", true);

select * from tb_categoria;

create table tb_produto(
	id bigint(5) auto_increment,  
	nome varchar(30),
    preco int(11),
    quantidade int(11),
    peso decimal (10,1),
    bivolt boolean,
    categoria_id bigint(3),
    primary key(id),
    foreign key (categoria_id) references tb_categoria (id)
);

select * from tb_produto;

insert into tb_produto (nome, preco, quantidade, peso, bivolt, categoria_id) 
	values ("Máquina de Bebidas", 1999, 25, 4.3, false, 3); 
    
insert into tb_produto (nome, preco, quantidade, peso, bivolt, categoria_id) 
	values ("Liquidificador Philips", 349, 35, 3.8, false, 3);

insert into tb_produto (nome, preco, quantidade, peso, bivolt, categoria_id) 
	values ("Máquina de Café", 379, 105, 2.9, true, 3);

insert into tb_produto (nome, preco, quantidade, peso, bivolt, categoria_id) 
	values ("Smart TV LED 50", 2299, 150, 11.4, true, 1);
    
insert into tb_produto (nome, preco, quantidade, peso, bivolt, categoria_id) 
	values ("Smart TV LED 58", 2999, 120, 12.6, true, 1); 
    
insert into tb_produto (nome, preco, quantidade, peso, bivolt, categoria_id) 
	values ("Smart TV LED 65", 3999, 80, 14.9, true, 1); 
    
insert into tb_produto (nome, preco, quantidade, peso, bivolt, categoria_id) 
	values ("Smart TV LED 65 8k", 12999, 20, 13.5, true, 1); 

insert into tb_produto (nome, preco, quantidade, peso, bivolt, categoria_id) 
	values ("Smartphone Samsung", 2499, 200, 0.3, true, 2);

insert into tb_produto (nome, preco, quantidade, peso, bivolt, categoria_id) 
	values ("Smartphone Motorola", 4279, 120, 0.5, true, 2);

insert into tb_produto (nome, preco, quantidade, peso, bivolt, categoria_id) 
	values ("Iphone", 4814, 80, 0.5, true, 2); 
    
select * from tb_categoria;
select * from tb_produto;

select * from tb_produto where preco > "2000";
select * from tb_produto where preco between "1000" and "2000"; 
select * from tb_produto where nome like "S%"; -- troquei o C pq não inseri nenhum
