create database db_construindo_a_nossa_vida;

create table tb_endEstoque(
id int(2) auto_increment,
nome varchar(30),
endereco varchar(30),
primary key(id)
);

ALTER TABLE tb_endestoque CHANGE endereco endereco tinytext;

insert into tb_endestoque (nome, endereco) values ("Santos", "Rua Princesa Isabel, 70 - Santos/SP"); 
insert into tb_endestoque (nome, endereco) values ("São Paulo", "Travessa Maravilha Tristeza, 33 - São Paulo/SP"); 

select * from tb_endestoque;

create table tb_categoria (
	id int(10) auto_increment,
    departamento varchar(30),
    subDepartamento varchar(30),
    estoque_id int(2),
    foreign key (estoque_id) references tb_endestoque (id),
    primary key(id)
    
);

insert into tb_categoria(departamento, subDepartamento, estoque_id) values ("Banheiros", "Banheiras e Ofurôs", 1);
insert into tb_categoria(departamento, subDepartamento, estoque_id) values ("madeiras", "Deck", 2);
insert into tb_categoria(departamento, subDepartamento, estoque_id) values ("Ferramentas", "Ferramentas para Construção", 1);

update tb_categoria set departamento = "Madeiras" where id= 2; -- atualizar linha

select * from tb_categoria;

create table tb_produto (
	id int(11) auto_increment,
    nome tinytext,
    preco decimal(10,2),
    descricaoCurta tinytext,
    quantidade int(4),
    categoria_id int(10),
    foreign key (categoria_id) references tb_categoria(id),
    primary key(id)
);

insert into tb_produto (nome, preco, descricaoCurta, quantidade, categoria_id) 
	values ("Betoneira 1 Traço 400L", 3099.90, "Betoneira 1 Traço 400 Litros é adequada para todos os tipos de obras.", 15, 3);

insert into tb_produto (nome, preco, descricaoCurta, quantidade, categoria_id) 
	values ("Cortador de Piso Manual", 199.90, "O cortador de piso manual é a ferramenta ideal para combinar conforto ao trabalhar, praticidade e precisão a cada corte.", 120, 3);

insert into tb_produto (nome, preco, descricaoCurta, quantidade, categoria_id) 
	values ("Banheira de Hidromassagem", 4289.90, "Banheira de Hidromassagem Cromoterapia 45x170x110cm Neo Confort Plus Sensea.", 10, 1);

insert into tb_produto (nome, preco, descricaoCurta, quantidade, categoria_id) 
	values ("Banheira de Hidromassagem Ova", 20549.90, "Banheira de Hidromassagem Oval Vancouver 180x108x70cm Gel Coat Branca Astra.", 5, 1);
    
insert into tb_produto (nome, preco, descricaoCurta, quantidade, categoria_id) 
	values ("Ofurô de Hidromassagem Duplo", 4940.90, "Ofurô de Hidromassagem Duplo 160x110x61 Mondialle.", 8, 1);

insert into tb_produto (nome, preco, descricaoCurta, quantidade, categoria_id) 
	values ("Pallet Liso Madeira Pinus Bruto 100x100cm Settis", 70.90, "O pallet decorativo pode ser utilizado em diversos projetos de bricolagem como sofás, camas ou mesas. É um produto indicado para áreas internas e pode ser combinado com outros produtos.", 100, 2);

insert into tb_produto (nome, preco, descricaoCurta, quantidade, categoria_id) 
	values ("Escada para Sotão", 2199.90, "Escada para Sotão Dobrável Madeira 0,60x2,80m Renafer", 1, 2);

insert into tb_produto (nome, preco, descricaoCurta, quantidade, categoria_id) 
	values ("Forro Rígido", 69.90, "Forro Rígido de Madeira Pinus Natural 0,9x2,00m Schneider", 100, 2);

select * from tb_produto;

select * from tb_produto where preco > "50";
select * from tb_produto where preco between "3" and "60";
select * from tb_produto where nome like "%cl%";

select * from tb_produto
	inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;
    
select tb_produto.nome, tb_produto.preco, tb_categoria.departamento from tb_produto
	inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
		where tb_categoria.departamento = "Madeiras";

