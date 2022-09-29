create database spare; /* */

use spare;

show columns from usuarios;
show columns from producto;
show columns from venta;
show columns from cliente;
show columns from vendedor;
show columns from factura;
show columns from superadmin;

select * from factura;


create table usuarios(
num_id int primary key auto_increment,
usuario varchar(30) not null,
contrasena varchar(40) not null,
rol varchar(30) not null
);


create table producto(
id_producto int primary key auto_increment, /*este es para identificacion */
cod_producto int not null, /*este es solo para consultas */
nombre_producto varchar(30) not null,
valor_producto int not null
);

create table venta(
id_venta int primary key auto_increment,
cod_producto int not null,
valor_producto int not null
);

create table cliente(
id_cliente int primary key auto_increment,
nombre varchar(40) not null,
cedula int not null
);

create table vendedor(
id_vendedor int primary key auto_increment,
nombre_completo varchar(40) not null /*este nombre completo nos servira para cuando vayamos a autogenerar la factura y para eso necesitamos el nombre completo del vendedor */
);

create table factura(
id_factura int primary key auto_increment,
fecha varchar(30) not null,
cod_producto int not null,
cantidad int not null,
valor_unitario int not null,
valor_total int not null,
valor_neto int not null
);

create table superadmin(
id_super int primary key auto_increment,
nombre_completo varchar(40) not null
);





