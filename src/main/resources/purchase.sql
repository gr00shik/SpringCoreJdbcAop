create database springcorejdbc;

use springcorejdbc;

create table purchase(
id int not null auto_increment,
nameTool varchar(20) not null,
cost long not null,
dateSale date,
seller varchar(20),
primary key (id)
);

insert into purchase (nameTool, cost, dateSale, seller) values ("Iphone", 1800, '2018-03-05', "Ivanov Ivan");
insert into purchase (nameTool, cost, dateSale, seller) values ("Samsung", 1200, '2018-04-08', "Petrov Petr");