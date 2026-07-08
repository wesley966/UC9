create table animal(
id serial primary key,
	nome varchar(100)not null,
	especie varchar(50),
	idade int,
	peso numeric(10,2)
);
create table cuidador(
id serial primary key,
	nome varchar(100)not null,
	cpf varchar(50)unique,
	telefone varchar(50)unique,
	turno varchar(10)not null
);
create table recinto(
id serial primary key,
	nome varchar(100)not null,
	tipo varchar(100)not null,
	capacidade int,
	localizacao varchar(100)
);