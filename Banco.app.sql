create table cliente (
id serial primary key,
	nome varchar(100)not null,
	cpf varchar(50)unique not null,
	telefone varchar(50)not null,
	email varchar(100)unique
);
create table conta(
id serial primary key,
	numero_conta int unique not null,
	agencia varchar(100)not null,
	saldo numeric(10,2)not null,
	tipo_conta varchar(50)not null
);
create table funcionario(
id serial primary key,
	nome varchar(100)not null,
	cargo varchar(100)unique,
	salario numeric(10,2)not null,
	email varchar(100)unique
)