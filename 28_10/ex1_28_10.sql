create database db_cidade_das_carnes;

create table tb_categoria (
	id int(4) auto_increment,
	embutidos varchar(30),
    hamburgueres varchar(30),
    carnes varchar(30),
    primary key(id)
);

ALTER TABLE tb_categoria CHANGE embutidos Tipo varchar(30);
ALTER TABLE tb_categoria CHANGE hamburgueres Vegan boolean;
ALTER TABLE tb_categoria CHANGE carnes Perecível boolean;


insert into tb_categoria (Tipo, Vegan, Perecível) values ("Embutidos", true, true);
insert into tb_categoria (Tipo, Vegan, Perecível) values ("Hamburgueres", true, true);
insert into tb_categoria (Tipo, Vegan, Perecível) values ("Carnes", true, true);
insert into tb_categoria (Tipo, Vegan, Perecível) values ("Suplemnetos", true, false);

select * from tb_categoria;

create table tb_produto(
	id int(4) auto_increment,
    nome varchar(30),
    preco decimal(10,2),
    categoria_id int(4),
    quantidade int(5),
    ativo boolean,
    primary key(id),
    foreign key (categoria_id) references tb_categoria (id) 
);

insert into tb_produto ( nome, preco, categoria_id, quantidade, ativo) 
	values ("Almôndegas de soja", 15.97, 1, 180, true);

insert into tb_produto ( nome, preco, categoria_id, quantidade, ativo) 
	values ("Kibe", 14.99, 3, 180, true);
    
insert into tb_produto ( nome, preco, categoria_id, quantidade, ativo) 
	values ("Burguer Cogumelos", 18.97, 1, 100, true);
 
insert into tb_produto ( nome, preco, categoria_id, quantidade, ativo) 
	values ("Hambúrguer de Lentilha", 15.97, 2, 80, true);
    
insert into tb_produto ( nome, preco, categoria_id, quantidade, ativo) 
	values ("Steak Sabor Peixe", 35.97, 3, 50, true);

insert into tb_produto ( nome, preco, categoria_id, quantidade, ativo) 
	values ("Soy Protein", 76.90, 4, 40, true);

insert into tb_produto ( nome, preco, categoria_id, quantidade, ativo) 
	values ("Vegan Ômega 3", 28.50, 4, 240, true);

select * from tb_produto;

update tb_produto set categoria_id=2 where id= 2; -- atualizar linha
update tb_categoria set Tipo="Suplementos" where id= 4; -- atualizar linha

select * from tb_produto where preco > "50";
select * from tb_produto where preco between "3" and "60";
select * from tb_produto where nome like "%co%";

select * from tb_produto
	inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

select tb_produto.nome, tb_produto.preco, tb_categoria.Tipo from tb_produto
	inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

select tb_produto.nome, tb_produto.preco, tb_categoria.Tipo from tb_produto
	inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
		where tb_categoria.Tipo = "Suplementos";







