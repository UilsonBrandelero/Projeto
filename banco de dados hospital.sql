create table medicos(
	crm varchar(256),
	nome_med varchar(256),
	ender_med varchar (256),
	cidade_med varchar (256),
	uf_med varchar (2),
	primary key (crm)
	
)
insert into medicos (crm, nome_med,ender_med,cidade_med,uf_med)
values ('1000', 'Maria das Dores', 'Rua das Acácias','Chapeco','SC');

insert into medicos (crm, nome_med,ender_med,cidade_med,uf_med)
values ('1001', 'João da Silva', 'Rua dos Coqueiros','Xaxim','SC');

insert into medicos (crm, nome_med,ender_med,cidade_med,uf_med)
values ('1002', 'Ana Paula Padrão', 'Rua São Paulo','Chapeco','SC');

insert into medicos (crm, nome_med,ender_med,cidade_med,uf_med)
values ('1003', 'Flavio Bohr', 'Rua São João','Xanxeré','SC');


create table pacientes(
	cod_pac SERIAL not null,
	nome_pac varchar (256),
	ender_pac varchar (256),
	cidade_pac varchar (256),
	uf_pacinte varchar (02),
	primary key (cod_pac)
)
alter table pacientes add column  fone_pac varchar(20);
alter table pacientes RENAME column  uf_pacinte to uf_pac ;
select *from pacientes


insert into pacientes (nome_pac, ender_pac, cidade_pac, uf_pac,fone_pac)
values ('Maria Ana Soares', 'AV. Getulio Vargas', 'Chapecó','SC','3238888'); 

insert into pacientes (nome_pac, ender_pac, cidade_pac, uf_pac,fone_pac)
values ('Carlos Abrahao', 'AV. Fernando Machado', 'Chapecó','SC','3234598'); 

insert into pacientes (nome_pac, ender_pac, cidade_pac, uf_pac,fone_pac)
values ('Pedro Pereira', 'Rua do Comercio', 'Xaxim','SC','3222020'); 


create table consultas(
	cod_consulta serial not null,
	data_consulta date,
	crm_med_consulta varchar(256),
	cod_pac_consulta int,
	historico varchar (256),
	primary key (cod_consulta),
	foreign key (crm_med_consulta) references medicos (crm),
	foreign key (cod_pac_consulta) references pacientes (cod_pac)
	
)
alter table consultas add column hora_consulta time;
select *from consultas

insert into consultas (data_consulta, hora_consulta,crm_med_consulta,cod_pac_consulta,historico)
values ('2000-01-05', '14:00:00','1001',1,'Fratura de Omoplata' );

insert into consultas (data_consulta, hora_consulta,crm_med_consulta,cod_pac_consulta,historico)
values ('2000-05-30', '9:00:00','1002',3,'Refluxo' );

insert into consultas (data_consulta, hora_consulta,crm_med_consulta,cod_pac_consulta,historico)
values ('2000-11-10', '13:15:00','1001',1,'Pe direito Quebrado' );

insert into consultas (data_consulta, hora_consulta,crm_med_consulta,cod_pac_consulta,historico)
values ('2000-11-22', '8:00:00','1000',2,'Cefaleia' );

create table especialidades (
	cod_esp int not null,
	especialidade varchar (256),
	primary key(cod_esp)
	
	
)

select *from especialidades

insert into especialidades (cod_esp,especialidade)
values (100, 'Otorrinolaringologista');

insert into especialidades (cod_esp,especialidade)
values (101, 'Ortopedista');

insert into especialidades (cod_esp,especialidade)
values (102, 'Pediatra');

insert into especialidades (cod_esp,especialidade)
values (103, 'Gastroenterologista');

insert into especialidades (cod_esp,especialidade)
values (104, 'Cirurgião');

insert into especialidades (cod_esp,especialidade)
values (105, 'Clinico Geral');

create table espMedico(
	 
	crm_medico varchar(256),
	cod_esp_medico int,
	
	foreign key (crm_medico) references medicos (crm),
	foreign key (cod_esp_medico) references especialidades (cod_esp)
)
select *from espMedico

insert into espMedico (crm_medico, cod_esp_medico)
values ('1000',105);

insert into espMedico (crm_medico, cod_esp_medico)
values ('1001',101);

insert into espMedico (crm_medico, cod_esp_medico)
values ('1002',102);

insert into espMedico (crm_medico, cod_esp_medico)
values ('1003',103);

create table foneMedico (
	crm_medico varchar(256),
	fone varchar (20),
	foreign key (crm_medico) references medicos (crm)
	

)
select *from foneMedico

insert into foneMedico (crm_medico, fone)
values (1000,'99876565');

insert into foneMedico (crm_medico, fone)
values (1001,'99876060');

insert into foneMedico (crm_medico, fone)
values (1001,'99972309');

insert into foneMedico (crm_medico, fone)
values (1002,'3232120');

insert into foneMedico (crm_medico, fone)
values (1002,'3234478');

insert into foneMedico (crm_medico, fone)
values (1003,'3249087');


select nome_pac, ender_pac,fone_pac  from pacientes

select nome_med, fone from medicos join foneMedico on crm = crm_medico;

select  nome_med, ender_med, fone from medicos join foneMedico on crm = crm_medico;

select nome_pac, data_consulta, hora_consulta from pacientes join consultas on cod_pac = cod_pac_consulta;

select nome_med, especialidade from medicos join espMedico on crm = crm_medico 
join especialidades on cod_esp = cod_esp_medico;
