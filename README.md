# skyfire

1. to generate Lexer, Parser, Visitor automatically, take xml as example

add antlr-4.7-complete.jar to classpath
>java org.antlr.v4.Tool -o E:\xml\ -visitor -no-listener -Dlanguage=Java E:\xml\XMLLexer.g4
>java org.antlr.v4.Tool -o E:\xml\ -visitor -no-listener -Dlanguage=Java E:\xml\XMLParser.g4

2. install MySQL

download MySQL community version: mysql-installer-community-5.7.21.0.msi
double click and install
create new database pcsg
create new table pcsg

>create table pcsg (
id int auto_increment,
parent varchar(100) not null,
context varchar(500) not null,
rule varchar(1000) not null,
prob float not null,
primary key(id)
);

download mysql-connector-java-5.1.46.tar.gz from http://dev.mysql.com/downloads/connector/j/ and unzip it
add mysql-connector-java-5.1.46-bin.jar to build path

3.change Visitor

 