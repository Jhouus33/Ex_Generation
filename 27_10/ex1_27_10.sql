create database db_RH2;

create table tb_cargo(
	id bigint(3) auto_increment,
    cargo varchar(30),
    salarioBase bigint,
    tipodeContratacao varchar(30),
    primary key(id)
);

create table tb_funcionario(
	id bigint(3) auto_increment,
    nome varchar(30),
    email varchar(30),
    dataAdmmissao DATE,
    cargo_id bigint(3),
    ativo boolean,
    primary key(id),
    foreign key (cargo_id) references tb_cargo (id)
); 