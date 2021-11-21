create database sunsetbandb;
create table clientes (
    id text not null primary key,
    nombre text not null 
);
create table propietario (
    id text not null primary key,
    nombre text not null
);
create table casa (
    numero int not null primary key,
    valor_arrinedo int not null primary key,
    id_propietario text ,
    foreign key (id_propietario) references propietario(id)
);
create table arriendo (
    id_cliente text,
    id_dueño text,
    foreign key (id_cliente) references clientes(id),
    foreign key (id_dueño) references propietario(id)
);