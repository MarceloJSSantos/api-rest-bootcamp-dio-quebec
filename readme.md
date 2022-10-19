# Exercício "Criando uma API REST Documentada com Spring Web w Swagger"

repositório com a VERSÃO PESSOAL do exercício prático do curso do "Criando uma API REST Documentada com Spring Web w Swagger" do Bootcamp "Quebec Java Digital"".

--------------------

Neste projeto foi desenvolvido um sistema que implementa APIs REST, usando Spring Web, documentada com Swagger e com tratamento de exceções de negócio com handles.

--------------------

### Instalação e Execução

Baixar e importar todos os módulos em sua IDE preferida

Após executar todos os módulos, basta apenas abrir os endpoints abaixo:


#### Rotas

| VERBO | URL                                  | CORPO                                                                                                        |
|-------|--------------------------------------|--------------------------------------------------------------------------------------------------------------|
| GET   | http://localhost:8080/               | NÃO É NECESSÁRIO                                                                                             |
| GET   | http://localhost:8080/usuarios       | NÃO É NECESSÁRIO                                                                                             |
| GET   | http://localhost:8080/usuarios/teste | NÃO É NECESSÁRIO                                                                                             |
| DEL   | http://localhost:8080/usuarios/100   | NÃO É NECESSÁRIO                                                                                             |
| POST  | http://localhost:8080/usuarios       | <pre lang="json">{<br>    "login": "silviana.galaga",<br>    "password": "12345678"<br>}                     |
| PUT   | http://localhost:8080/usuarios       | <pre lang="json">{<br>    "id": 2000,<br>    "login": "silviana.galaga", <br>    "password": "12345678"<br>} |                                                                         |


