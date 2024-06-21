create table doadores(	
	id_doador SERIAL not null,
	nome_doador varchar (256) not null,
	cpf_cnpj varchar (18) not null,
	telefone_doador varchar(16),
	email_doador varchar(256),
	senha_doador varchar(256),
	primary key (id_doador)
	
)
select *from doadores
SELECT *FROM doadores WHERE nome_doador = 'Pedro'

create table endereco_doadores (
	id_endereco_doador SERIAL not null,
	endereco_id_doador int not null,
	rua_doador varchar (256) not null,
	bairro_doador varchar (256) not null,
	numero_doador varchar (256) not null,
	complemento_doador varchar (256),
	primary key (id_endereco_doador),
	foreign key (endereco_id_doador) references doadores (id_doador)
	

)


select * from endereco_doadores 
select *from doadores join endereco_doadores on id_doador = endereco_id_doador