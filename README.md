 # ✈️ Sistema de Reserva Aérea - Live Code Challenge

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![JUnit5](https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-success)

## 🏆 Sobre o Projeto
Este projeto é especial: foi o resultado do meu **primeiro Live Coding**! 
O desafio consistiu em implementar, sob tempo cronometrado e análise ao vivo, um backend para um sistema de reservas aéreas seguindo regras de negócio estritas e garantindo a qualidade através de Testes Unitários.

## 🎯 O Desafio
O objetivo era criar um sistema robusto onde:
- **Passageiros** e **Voos** possuem validações rigorosas (não permitir dados nulos, negativos ou vazios).
- **Reservas** garantem integridade (não permitir duplicidade de voos, validar status do passageiro).
- O código deveria ser **à prova de falhas** (NullPointer, IndexOutOfBounds) e seguir boas práticas de OO.

## 🛠️ Tecnologias e Práticas
- **Java 17**: Uso de Streams, Lambdas e manipulação de Coleções.
- **JUnit 5**: Criação de suíte de testes cobrindo cenários de sucesso e exceções (`assertThrows`).
- **Clean Code**: Validações encapsuladas e tratamento de exceções (`IllegalArgumentException`, `IllegalStateException`).
- **Git**: Versionamento do código.

## 🧠 Aprendizados do Live Code
Durante a execução, foquei em:
1. **Programação Defensiva**: Blindar as classes `Passageiro` e `Voo` já no construtor.
2. **Manipulação Segura de Listas**: Uso de `removeIf` para evitar erros de concorrência e índices.
3. **Testes Significativos**: Garantir que cada regra de negócio tivesse um teste correspondente.

## 🚀 Como Executar
1. Clone o repositório:
   ```bash
   git clone [https://github.com/SEU-USUARIO/livecode-sistema-reserva.git](https://github.com/SEU-USUARIO/livecode-sistema-reserva.git)
