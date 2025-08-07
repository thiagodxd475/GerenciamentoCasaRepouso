# 🏡 Sistema de Gerenciamento para Casa de Repouso

## 📋 Descrição

Este projeto tem como objetivo desenvolver um sistema simples para gerenciamento de uma **casa de repouso**, permitindo o cadastro e exibição de **pacientes (idosos)** e **funcionários**.

A aplicação é feita em **Java**, utilizando princípios de **Programação Orientada a Objetos (POO)** e estrutura de dados como `HashMap` para armazenar os registros. A futura integração com **PostgreSQL** está planejada para persistência dos dados.

---

## 🎯 Funcionalidades Implementadas

- ✅ Cadastro de pacientes (nome, idade, CPF, RG)
- ✅ Cadastro de funcionários (nome, idade, CPF, RG, salário)
- ✅ Exibição de dados cadastrados no console
- ✅ Armazenamento temporário com `HashMap`

---

## 🚧 Funcionalidades Futuras

- [ ] Persistência de dados com PostgreSQL (via JDBC)
- [ ] Separação por camadas (MVC)
- [ ] Interface gráfica com JavaFX ou Swing
- [ ] Relatórios em PDF
- [ ] Tela de login

---


## 📁 Estrutura Atual do Projeto

CasaDeRepouso/
├── paciente/
│ └── cadastrar_paciente.java
│ └── pacientes.java
├── Funcionarios/
│ └── Colaboradores.java
│ └── ColaboradoresArvore.java
├── README.md

