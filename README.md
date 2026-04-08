# 📧 Event & Email Microservices

Este projeto consiste em uma arquitetura baseada em **microservices**, desenvolvida para gerenciamento de eventos e envio automático de e-mails de confirmação de inscrição.

---

## 🚀 Tecnologias utilizadas

- Java
- Spring Boot
- AWS (Simple Email Service - SES)
- Banco de dados H2 (em memória)

---

## 🧩 Arquitetura do Projeto

O sistema é dividido em dois microserviços principais:

### 1️⃣ Event Service (Microserviço de Eventos)

Responsável por toda a gestão de eventos e inscrições.

#### 🔹 Funcionalidades:

- ✅ Criar um evento
- 📋 Listar todos os eventos
- 📅 Listar eventos futuros (com base na data)
- 📝 Realizar inscrição em um evento

#### 🔹 Fluxo de inscrição:

Quando um usuário se inscreve em um evento:
1. A inscrição é registrada no sistema  
2. Uma mensagem é enviada para o microserviço de e-mail  

---

### 2️⃣ Email Service (Microserviço de E-mail)

Responsável pelo envio de e-mails de confirmação utilizando a AWS.

#### 🔹 Funcionalidades:

- 📧 Envio de e-mail automático ao usuário  
- ✅ Confirmação de inscrição em eventos  

#### 🔹 Integração:

- Recebe eventos/mensagens do **Event Service**  
- Dispara um e-mail para o participante confirmando a inscrição  

---

## 📌 Exemplos de endpoints

### 📍 Criar evento
```http
POST /events

GET /events

GET /events/upcoming

{
  "participantEmail": "usuario@email.com"
}

💾 Banco de Dados

Utilizado o H2 Database (em memória)
Ideal para desenvolvimento e testes
🔹 Console (se habilitado):

http://localhost:8080/h2-console

## 📧 Integração com AWS

O envio de e-mails é realizado através do:

- **AWS Simple Email Service (SES)**

### 🔹 É necessário configurar:

- Credenciais AWS  
- Região  
- Permissões adequadas  

---

## ⚙️ Como rodar o projeto

### 🔹 Pré-requisitos:

- Java 17+  
- Maven ou Gradle  
