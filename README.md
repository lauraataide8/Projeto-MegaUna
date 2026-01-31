# 🚀 Projeto Mega Una - Jornada Spring Boot (SENAI)

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Status](https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow?style=for-the-badge)

O **Mega Una** é o meu primeiro projeto desenvolvido no curso de **Desenvolvimento de APIs REST com Spring Boot** no SENAI. A aplicação está sendo construída ao longo de 10 sábados, evoluindo de uma lógica de console para uma API completa.

---

## 📅 Cronograma do Curso
O aprendizado está estruturado em duas etapas principais:
* **Sábados 01 a 10:** Desenvolvimento e refatoração do projeto Mega Una (Lógica -> Spring Boot).
* **Sábados 11 a 15:** Desenvolvimento de um projeto final secundário para conclusão do módulo.

---

## 💻 Estado Atual: Mega Una V3
Nesta fase inicial, o projeto foca nos fundamentos da **Programação Orientada a Objetos (POO)** e lógica de interação via console:

* **Classe `Jogo`:** Responsável por encapsular o número sorteado (entre 1 e 100) e gerenciar o limite de 3 tentativas.
* **Classe `MegaUnaV3`:** Contém o motor principal do jogo, utilizando métodos modulares para coleta de dados, processamento de jogadas e finalização.

### 🛠️ Tecnologias e Conceitos Aplicados
* **Linguagem:** Java 17.
* **Scanner & Random:** Manipulação de entrada de dados e geração de valores aleatórios.
* **Modularização:** Divisão de responsabilidades em métodos estáticos (`coletarNome`, `jogar`, `finalizarJogo`).
* **POO:** Instanciação de objetos para manter o estado do jogo.

---

## ⚙️ Próximos Passos (Evolução para API)
Como parte da grade curricular de API REST, as próximas versões incluirão:
1.  **Framework Spring Boot:** Migração da interface de console para endpoints HTTP.
2.  **Web Controllers:** Criação de rotas para receber apostas via JSON.
3.  **Persistência:** Uso de banco de dados para salvar o histórico de ganhadores.

---

## 🚀 Como testar localmente
1. Certifique-se de ter o **Java 17+** instalado.
2. Clone o repositório.
3. Abra o projeto no **IntelliJ IDEA**.
4. Execute o arquivo `MegaUnaV3.java`.

---

> **Nota:** Este repositório reflete meu progresso real como estudante. Cada "commit" representa um novo conceito aprendido em sala de aula.
