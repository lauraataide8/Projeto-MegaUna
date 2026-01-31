# 🚀 Projeto: Mega Una (API REST)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![RestAPI](https://img.shields.io/badge/Rest--API-005571?style=for-the-badge&logo=restapi)
![SENAI](https://img.shields.io/badge/SENAI-Red?style=for-the-badge)

O **Mega Una** é o meu primeiro projeto desenvolvido durante o curso de **Desenvolvimento de APIs REST no SENAI**. A aplicação consiste em um sistema de sorteios inspirado na dinâmica da Mega-Sena, permitindo a gestão de apostas e a geração de números aleatórios via requisições HTTP.

---

## 📋 Sobre o Projeto
O objetivo principal foi aplicar os fundamentos da arquitetura REST, manipulando recursos de sorteios e apostas através dos métodos HTTP (GET, POST, etc.). O sistema garante que os números gerados sigam as regras de um sorteio real, evitando duplicidade e respeitando os intervalos numéricos definidos.

## 🛠️ Tecnologias e Conceitos Aplicados
* **Linguagem:** Java (utilizando as bibliotecas padrão de sorteio).
* **Arquitetura:** REST (Representational State Transfer).
* **Ferramentas:** PowerShell, Postman e IntelliJ IDEA.
* **Lógica de Programação:** Uso de `Collections` e algoritmos de aleatoriedade.

## ⚙️ Funcionalidades (Endpoints)
| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| `POST` | `/sorteio` | Gera um novo jogo com 6 números únicos (01 a 60). |
| `GET` | `/resultados` | Lista os últimos jogos gerados. |
| `GET` | `/conferir/{id}` | Verifica se uma aposta específica foi premiada. |

## 💡 Por que este projeto é importante?
Sendo meu primeiro projeto no SENAI, o Mega Una marca a transição da lógica de programação básica para o desenvolvimento de sistemas conectados. Ele resolve problemas clássicos de backend, como:
* **Validação de Dados:** Impedir que números repetidos sejam sorteados.
* **Padronização:** Retorno de respostas em formato JSON.
* **Organização:** Estruturação de pastas e responsabilidades no código.
