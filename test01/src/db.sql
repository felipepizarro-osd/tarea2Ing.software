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
        valor_arrinedo int not null ,
        nombre_propietario text ,
        foreign key (nombre_propietario) references propietario(nombre)
    );
    create table arriendo (
        id_cliente text,
        id_dueño text,
        foreign key (id_cliente) references clientes(id),
        foreign key (id_dueño) references propietario(id)
    );
    insert into propietario values ('19825202-6','Felipe Pizarro');
    insert into casa values (1,300000,'Felipe Pizarro');
    insert into casa values (2,360000,'Marcelo Guerra');
    insert into casa values (3,370000,'Luis Flores');
    insert into casa values (4,350000,'Diego Barros');
    insert into casa values (5,320000,'Cristian Arqueros');