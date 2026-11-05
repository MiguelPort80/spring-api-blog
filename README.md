# Blogging Platform API 🚀

API RESTful desenvolvida com **Spring Boot** para gerenciar uma plataforma de blog, baseada no desafio do [Roadmap.sh](https://roadmap.sh/projects/blogging-platform-api). O objetivo deste projeto é construir um sistema robusto de gerenciamento de posts, com suporte a autenticação, comentários e filtragem de conteúdo.

## 📋 Funcionalidades
- **Autenticação e Autorização:** Sistema de registro e login de usuários (com segurança/JWT, se aplicável).
- **Gerenciamento de Posts (CRUD):** Criar, ler, atualizar e excluir postagens do blog.
- **Sistema de Comentários:** Permitir que usuários comentem nas postagens.
- **Filtros e Busca:** Buscar posts por categorias, tags ou palavras-chave.
- **Paginação:** Organização eficiente de grandes volumes de posts.

## 🛠️ Tecnologias Utilizadas
- **Java**
- **Spring Boot**
- **Spring Data JPA** (Hibernate)
- **Spring Security** (Controle de acesso)
- **Banco de Dados Relacional** (MySQL)
- **Maven / Gradle** (Gerenciador de dependências)

## ⚙️ Como Executar o Projeto

### Pré-requisitos
Certifique-se de ter instalado na sua máquina:
- Java 17+
- Maven
- Mysql

### Passo a passo
1. Clone este repositório:
   ```bash
   git clone [https://github.com/MiguelPort80/nome-do-seu-repositorio.git](https://github.com/MiguelPort80/nome-do-seu-repositorio.git)
   ```
2.Abra o projeto na sua IDE favorita (IntelliJ IDEA, Eclipse, VS Code).

3.Configure as credenciais do seu banco de dados no arquivo src/main/resources/application.properties (ou application.yml).

4.Execute a aplicação executando a classe principal do Spring Boot (Application.java).

5.A API estará rodando em http://localhost:8080.
