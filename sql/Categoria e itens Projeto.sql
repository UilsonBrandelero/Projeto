CREATE TABLE categoria_item(
	id_categoria SERIAL not null,
	nome_categoria varchar(50) not null,
	PRIMARY KEY (id_categoria)
	
);

CREATE TABLE itens (
	id_item SERIAL not null,
	id_categoria_item int not null,
	nome_item varchar (50),
	primary key (id_item),
	foreign key (id_categoria_item) REFERENCES categoria_item (id_categoria)
);

SELECT *FROM CATEGORIA_ITEM
insert into categoria_item (nome_categoria) values ('Higiene Pessoal');
insert into categoria_item (nome_categoria) values ('Produtos de Limpeza');
insert into categoria_item (nome_categoria) values ('Alimentação');
insert into categoria_item (nome_categoria) values ('Cama');

insert into itens (id_categoria_item, nome_item) values (1, 'Sabonete');
insert into itens (id_categoria_item, nome_item) values (1, 'Creme dental');
insert into itens (id_categoria_item, nome_item) values (1, 'Escovas de Dente');
insert into itens (id_categoria_item, nome_item) values (1, 'Fio dental');
insert into itens (id_categoria_item, nome_item) values (1, 'Shampoo');

insert into itens (id_categoria_item, nome_item) values (2, 'Detergente');
insert into itens (id_categoria_item, nome_item) values (2, 'Sabão em Pó');
insert into itens (id_categoria_item, nome_item) values (2, 'Água Sanitária');
insert into itens (id_categoria_item, nome_item) values (2, 'Sabão em Barra');
insert into itens (id_categoria_item, nome_item) values (2, 'Esponjas');
insert into itens (id_categoria_item, nome_item) values (2, 'Vassoura');
insert into itens (id_categoria_item, nome_item) values (2, 'Rodo');

insert into itens (id_categoria_item, nome_item) values (3, 'Arroz 5Kg');
insert into itens (id_categoria_item, nome_item) values (3, 'Feijão 1 Kg');
insert into itens (id_categoria_item, nome_item) values (3, 'Sal 1 Kg');
insert into itens (id_categoria_item, nome_item) values (3, 'Oleo de Soja');
insert into itens (id_categoria_item, nome_item) values (3, 'Leite 1L');
insert into itens (id_categoria_item, nome_item) values (3, 'Agua Mineral 500ml');

insert into itens (id_categoria_item, nome_item) values (4, 'Colchão');
insert into itens (id_categoria_item, nome_item) values (4, 'Travesseiro');
insert into itens (id_categoria_item, nome_item) values (4, 'Cobertor');
insert into itens (id_categoria_item, nome_item) values (4, 'Roupa de Cama');




