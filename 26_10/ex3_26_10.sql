create database db_escola;

create table tb_turma(
	turma varchar(3),
    id bigint(3) auto_increment,
    primary key(id)
);

TRUNCATE TABLE tb_turma;

insert into tb_turma(turma) values ("1AM");
insert into tb_turma(turma) values ("1BM");
insert into tb_turma(turma) values ("1CM");
insert into tb_turma(turma) values ("1AN");
insert into tb_turma(turma) values ("2AM");
insert into tb_turma(turma) values ("2BM");
insert into tb_turma(turma) values ("2CM");
insert into tb_turma(turma) values ("2AN");
insert into tb_turma(turma) values ("3AM");
insert into tb_turma(turma) values ("3BM");
insert into tb_turma(turma) values ("3CM");
insert into tb_turma(turma) values ("3AN");

select * from tb_turma;

create table tb_alunos(
	id bigint(5) auto_increment,
	nome varchar(29) not null,
    sobrenome varchar(29) not null,
    email varchar(30),
    turma_id bigint(20),
	frequencia bigint(3),
    media decimal(2,2),
    primary key(id),
    foreign key (turma_id) references tb_turma (id)
);

ALTER TABLE tb_alunos MODIFY media DECIMAL(10,2) ;

insert into tb_alunos (nome, sobrenome, email, turma_id, frequencia, media) values ("Jonathan", "Ferreira", "j@generation.com", 12, 93, 08.80);
insert into tb_alunos (nome, sobrenome, email, turma_id, frequencia, media) values ("Maria", "Coutinho", "mc@generation.com", 7, 95, 09.90);
insert into tb_alunos (nome, sobrenome, email, turma_id, frequencia, media) values ("Negra", "Li", "nl@generation.com", 8, 87, 09.80);
insert into tb_alunos (nome, sobrenome, email, turma_id, frequencia, media) values ("Rebecca", "Alves", "ra@generation.com", 5, 89, 10.00);
insert into tb_alunos (nome, sobrenome, email, turma_id, frequencia, media) values ("Nathalie", "Emmanuel", "ne@generation.com", 5, 80, 08.10);
insert into tb_alunos (nome, sobrenome, email, turma_id, frequencia, media) values ("Sheron", "Meneses", "sm@generation.com", 3, 65, 07.00);
insert into tb_alunos (nome, sobrenome, email, turma_id, frequencia, media) values ("Cris", "Vianna", "cv@generation.com", 1, 70, 07.30);
insert into tb_alunos (nome, sobrenome, email, turma_id, frequencia, media) values ("Juliana", "Alves", "ja@generation.com", 7, 90, 08.00);
insert into tb_alunos (nome, sobrenome, email, turma_id, frequencia, media) values ("Isabela", "Lima", "il@generation.com", 12, 50, 06.30);

select * from tb_alunos where media < 7;
select * from tb_alunos where media > 7;
