create table funcionarios(
	id serial primary key,
	nome varchar(100)not null,
	cargo varchar(80),
	salario numeric(10,2),
	idade integer,
	cidade varchar(80),
	ativo boolean
);
insert into funcionarios(nome,cargo,salario,idade,cidade,ativo)
values
('Roberto','produtor',10000,25,'São Pedro',true),
('Senhoir','limpador',4000,24,'California',true),
('Deten','consertador',4000,34,'California',true),
('João','cientista',5000,30,'São Pedro',false),
('Cadastro','consertador',6000,29,'L.A.',true),
('Ronaldinho','produtor',5000,28,'L.A.',true),
('Men','produtor',3000,28,'São Pedro',true),
('Sistema','consertador',5000,25,'São Pedro',true),
('Debil','cientista',5000,26,'L.A.',true),
('Juvenal','limpador',3000,20,'California',false)

select *
from funcionarios;

select nome
from funcionarios;

select nome,cargo
from funcionarios;

select *
from funcionarios
where salario >= 3000;

select *
from funcionarios
where idade <=30;

select *
from funcionarios
where ativo = true;

select*
from funcionarios
where ativo = false;

select *
from funcionarios
where cidade = 'Porto Alegre';

select *
from funcionarios
where cidade in
('Porto Alegre','Canoas');

select *
from funcionarios
where idade between 20 and 40;

select *
from funcionarios
where idade >=25 and ativo=true;

select *
from funcionarios
where cidade ='Canoas' or cidade='Novo Hamburgo';

select *
from funcionarios
where not ativo=true;

select *
from funcionarios
order by nome;

select *
from funcionarios
limit 3;

create table produtos(
	id serial primary key,
	nome varchar(100),
	categoria varchar(100),
	preco numeric(10,2),
	estoque integer
);

INSERT INTO produtos (id, nome, categoria, preco, estoque)
VALUES
(1, 'Notebook Dell', 'Informática', 3500.00, 15),
(2, 'Mouse Logitech', 'Periféricos', 120.00, 50),
(3, 'Teclado Mecânico', 'Periféricos', 280.00, 30),
(4, 'Monitor Samsung 24"', 'Monitores', 899.90, 20),
(5, 'Headset Gamer', 'Áudio', 350.00, 25),
(6, 'SSD 1TB Kingston', 'Armazenamento', 450.00, 40),
(7, 'Impressora HP', 'Impressoras', 799.00, 10),
(8, 'Webcam Full HD', 'Acessórios', 220.00, 18),
(9, 'Smartphone Samsung', 'Celulares', 2200.00, 12),
(10, 'Tablet Lenovo', 'Tablets', 1500.00, 8);

select *
from produtos;

select *
from produtos
where preco >=500;

select *
from produtos
where preco<=100;

select *
from produtos
where estoque >=20;

select *
from produtos
where nome like 'M%'

select *
from produtos
where nome like '%a'

select *
from produtos
where nome like '%Mouse%';

select *
from produtos
order by preco; 

select *
from produtos
order by preco desc; 

select *
from produtos
limit 5

select *
from produtos
where categoria in
('Informatica','Escritorio');

create table pedidos(
	id serial primary key,
	cliente varchar(100),
	produto varchar(100),
	quantidade integer,
	valor_total numeric(10,2),
	data_pedido date
);


INSERT INTO pedidos (id, cliente, produto, quantidade, valor_total, data_pedido) VALUES
(1, 'João Silva', 'Notebook Dell', 1, 3500.00, '2026-06-15'),
(2, 'Maria Souza', 'Mouse Logitech', 2, 240.00, '2026-06-16'),
(3, 'Carlos Pereira', 'Teclado Mecânico', 1, 280.00, '2026-06-17'),
(4, 'Ana Oliveira', 'Monitor Samsung 24"', 2, 1799.80, '2026-06-18'),
(5, 'Pedro Santos', 'Headset Gamer', 1, 350.00, '2026-06-19'),
(6, 'Juliana Costa', 'SSD 1TB Kingston', 3, 1350.00, '2026-06-20'),
(7, 'Lucas Almeida', 'Impressora HP', 1, 799.00, '2026-06-21'),
(8, 'Fernanda Rocha', 'Webcam Full HD', 2, 440.00, '2026-06-22'),
(9, 'Ricardo Lima', 'Smartphone Samsung', 1, 2200.00, '2026-06-23'),
(10, 'Patrícia Gomes', 'Tablet Lenovo', 2, 3000.00, '2026-06-24');

select *
from pedidos;

select *
from pedidos
where valor_total >= 500;

select *
from pedidos
where valor_total between 200 and 800;

select *
from pedidos
where data_pedido between '2026-06-16'and '2026-06-24';


//Desafio extra
select *
from produtos
where preco>=500;

select cidade
from funcionarios

select cargo
from funcionarios

select categoria
from produtos;

select cliente
from pedidos

select *
from produtos
where estoque <= 5;

select *
from produtos
where estoque >= 5;

select *
from funcionarios
where salario between 3000 and 10000

select *
from funcionarios
where nome like 'R%'

select *
from pedidos 
order by data_pedido


