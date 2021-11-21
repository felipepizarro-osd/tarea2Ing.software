    create database sunsetbandb;
    create table clientes (
        id text not null primary key,
        nombre text not null 
        cantidad_dias int ;-- indica los dias que el cliente a arrendado el servicio
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
        casa_id int,
        foreign key (id_cliente) references clientes(id),
        foreign key (id_dueño) references propietario(id),
        foreign key (casa_id) references casa(numero)
    );
insert into propietario values ('19825202-6','Felipe Pizarro');
insert into propietario values ('20897397-8','Marcelo Guerra');
insert into propietario values ('19825203-6','Luis Flores');
insert into propietario values ('19825204-6','Diego Barros');
insert into propietario values ('19825205-6','Cristian Arqueros');




insert into casa values (1,300000,'19825202-6');
insert into casa values (2,360000,'20897397-8');
insert into casa values (3,370000,'19825203-6');
insert into casa values (4,350000,'19825204-6');
insert into casa values (5,320000,'19825205-6');

