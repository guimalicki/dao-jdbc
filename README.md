# Projeto de Treinamento JDBC

## Objetivo
Este projeto visa praticar a utilização do **JDBC** (Java Database Connectivity) para manipulação de dados em um banco de dados relacional, implementando o padrão **DAO** (Data Access Object) para organizar e acessar os dados de forma eficiente.

## Estrutura do Banco de Dados
O projeto utiliza um banco de dados **MySQL** com as seguintes tabelas:
- **Seller**: Armazena informações dos vendedores, como ID, nome e outros atributos.
- **Department**: Armazena informações dos departamentos, como ID e nome.
- **Relacionamento**: A tabela `Seller` possui uma relação muitos-para-um com `Department`, onde cada vendedor está associado a um departamento.

## Tecnologias Utilizadas
- **Java**: Linguagem de programação principal.
- **JDBC**: API para conexão e manipulação do banco de dados.
- **MySQL**: Sistema de gerenciamento de banco de dados relacional.
- **Padrão DAO**: Para encapsulamento da lógica de acesso aos dados.

## Pré-requisitos
- Java JDK 8 ou superior.
- MySQL Server instalado e configurado.
- Conector JDBC para MySQL (`mysql-connector-java`).
- Uma IDE (ex.: Eclipse, IntelliJ IDEA) para execução do projeto.

