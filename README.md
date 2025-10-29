# Meu Primeiro Aplicativo Spring Boot

Este é o meu **primeiro projeto** com **Spring Boot** em Java. Estou aprendendo sobre desenvolvimento de aplicações web usando o framework Spring, e este repositório serve como documentação do meu aprendizado e progresso.

## 🎯 Objetivo do Projeto

O projeto demonstra um CRUD (Create, Read, Update, Delete) completo de usuários, implementando uma aplicação web com API REST e uma interface simples em HTML/JavaScript.

## 🚀 Tecnologias Utilizadas

Aqui estão as tecnologias e conceitos que aprendi e apliquei neste projeto:

- **Java 21** - Versão da linguagem utilizada
- **Spring Boot 3.5.7** - Framework principal para desenvolvimento
- **Spring Web** - Para criação de APIs REST
- **Spring Data JPA** - Para persistência de dados e ORM
- **PostgreSQL** - Banco de dados relacional
- **Hibernate** - Para mapeamento objeto-relacional
- **Spring Boot Validation** - Para validação de dados
- **Lombok** - Para reduzir código boilerplate (getters, setters, etc.)
- **Spring Boot DevTools** - Para desenvolvimento mais ágil
- **Spring Boot Actuator** - Para monitoramento da aplicação

## 📁 Estrutura do Projeto

```
src/
├── main/
│   ├── java/com/enuelll1/my_fist_spring_app/
│   │   ├── controller/     # Controladores REST
│   │   ├── model/          # Entidades JPA
│   │   ├── repository/     # Interfaces de repositório
│   │   ├── service/        # Lógica de negócio
│   │   └── MyFistSpringAppApplication.java
│   └── resources/
│       ├── templates/      # Templates HTML
│       └── application.properties
└── test/                   # Testes unitários
```

## 🔧 Funcionalidades Implementadas

### Modelo de Dados (Entity)
A entidade `Modelo` representa um usuário com os seguintes campos:
- **ID** (Chave primária, auto-incremento)
- **Nome** (Obrigatório, até 100 caracteres)
- **Email** (Obrigatório, único, validado)
- **Telefone** (Opcional)
- **Idade** (Opcional)
- **Data de Nascimento** (Opcional)
- **Gênero** (Opcional)
- **Cidade** (Opcional)
- **Estado** (Opcional, sigla de 2 letras)
- **Mensagem** (Opcional, texto longo)

### API REST Endpoints
- `POST /api/usuarios` - Criar novo usuário
- `GET /api/usuarios` - Listar todos os usuários
- `GET /api/usuarios/{id}` - Buscar usuário por ID
- `PUT /api/usuarios/{id}` - Atualizar usuário
- `DELETE /api/usuarios/{id}` - Deletar usuário

### Validações
- Nome é obrigatório
- Email é obrigatório e deve ter formato válido
- Email deve ser único no banco de dados
- Verificações de existência antes de atualizar/deletar

### Interface Web
Uma página HTML simples (`cadrastro.html`) que permite:
- Cadastrar novos usuários através de formulário
- Visualizar lista de usuários cadastrados
- Deletar usuários da lista

## ⚡ Como Executar o Projeto

### Pré-requisitos
- Java 21 instalado
- PostgreSQL rodando localmente
- Maven instalado

### Configuração do Banco
1. Criar um banco chamado `usuario_db` no PostgreSQL
2. Criar um usuário `meuappspring` com senha `senha1234567`
3. (OU alterar as configurações em `application.properties`)

### Executar
```bash
# Clonar o repositório (se aplicável)
git clone https://github.com/EnueLLL1/Meu-primeiroApp-spring.git
cd My-fist-spring-app

# Rodar a aplicação
mvn spring-boot:run

# OU usar a wrapper
./mvnw spring-boot:run
```

A aplicação estará rodando em `http://localhost:3000`

### Acessar a Interface Web
Abra no navegador: `http://localhost:3000/cadrastro.html`

## 📚 O que Aprendi

Durante o desenvolvimento deste projeto, aprendi conceitos fundamentais:

### Spring Boot Basics
- Estrutura padrão de um projeto Spring Boot
- Injeção de dependências (`@Autowired`)
- Anotações principais (`@RestController`, `@Service`, `@Repository`, etc.)

### JPA/Hibernate
- Mapeamento entidade-relacionamento (`@Entity`, `@Table`, `@Column`)
- Repositórios com Spring Data JPA
- Estratégias de geração de ID

### Validação de Dados
- Bean Validation com anotações (`@NotBlank`, `@Email`)
- Validações customizadas no service layer

### APIs REST
- Estrutura RESTful
- Códigos HTTP apropriados
- Manipulação de respostas (`ResponseEntity`)

### Integração Front-end/Back-end
- Consumo de API com JavaScript (`fetch`)
- Manipulação do DOM
- Tratamento básico de erros

### Configuração
- Arquivo `application.properties`
- Configuração de banco de dados
- Portas customizadas

## 🔍 Próximos Passos

Como estou aprendendo, pretendo expandir este projeto com:
- Autenticação e autorização (Spring Security)
- Testes unitários e de integração
- Documentação da API (Swagger)
- Melhorias na interface (CSS, frameworks como Bootstrap)
- Deploy em nuvem
- Tratamento de erros mais robusto
- Paginação de resultados

## 🤝 Contribuições

Este é um projeto de aprendizado pessoal, mas feedbacks são bem-vindos! Sinta-se à vontade para abrir issues ou pull requests com sugestões.

---

**Nota**: Este é efetivamente meu primeiro contato prático com Spring Boot, então o código pode não seguir todas as melhores práticas. Estou documentando aqui o meu aprendizado inicial. 😊
