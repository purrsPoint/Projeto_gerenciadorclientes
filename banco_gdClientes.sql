create database gerenciador_clientes;
use gerenciador_clientes;
create table clientes(

    id int(11) not null primary key auto_increment,
    nome varchar(255) not null,
    email varchar(100),
    telefone varchar(20)
);