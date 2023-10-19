
# API de Pagamento Simplificada

Esse repositório é uma API Simplificada da Pagamentos do desafio open-source da PicPay:
[Desafio Back-end PicPay](https://github.com/PicPay/picpay-desafio-backend)

## Tecnologias
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

  

## Acesso Rápido
- [Pré Requisitos](#pré-requisitos)
- [Como usar](#como-usar)
- [API Endpoints](#api-endpoints)
- [Database](#banco-de-dados)


## Pré Requisitos
- Java JDK 14 ou superior;


## Como usar
 - Execute o projeto utilizando o Maven;
 - Link da API http://localhost:8080;
  

## API Endpoints
Esses são os endpoints disponíveis na API

**Buscar usuários**
```markdown
GET /users
```

```json
[
	{
		"id":  Number,
		"fullName":  String,
		"document":  String,
		"email":  String,
		"password":  String,
		"balance":  String,
		"userType":  "DEFAULT" || "MERCHANT"
	}
]
```

  

**Criar usuários**
```markdown
POST /users
```

```json
{
	"fullName":  String,
	"document":  String,
	"email":  String,
	"password":  String,
	"balance":  Float,
	"userType":  "DEFAULT" || "MERCHANT"
}
```

  

**Criar uma transação**
```markdown
POST /transactions
```
```json
{
	"senderId":  Number
	"receiverId":  Number
	"value":  Float
}
```

  
## Banco de Dados
O projeto usa H2 Database como a base de dados, saiba mais em: [H2 Database Tutorial](https://www.h2database.com/html/tutorial.html)