# Simulador de Corrida - Programação Orientada a Objetos (POO)

Este repositório contém a implementação do Trabalho Prático da disciplina de Programação Orientada a Objetos, do curso de Engenharia de Software da Universidade Católica do Salvador (UCSAL).

**Professora:** Christianne Orrico Dalforno

## 👥 Equipa de Desenvolvimento
* Vinicius Marlin Santos Ribeiro
* Afonso Carlos Figueredo dos Santos
* Matheus Bacelar Ribeiro
* Rafael dos Santos da Luz

## 🎯 Objetivo do Projeto
Desenvolver, utilizando a linguagem Java, um simulador de corrida via console disputada por dois veículos. A cada passo da simulação, os veículos recebem uma velocidade aleatória (1, 2 ou 3) que é somada à sua distância percorrida. A progressão é ilustrada visualmente no terminal através do avanço de caracteres (ex: `#`). Vence o veículo que atingir ou ultrapassar primeiro a distância máxima estabelecida.

## 🏗️ Arquitetura e Organização
O projeto foi estruturado seguindo os princípios de Responsabilidade Única (SRP) e o padrão MVC (Model-View-Controller) para permitir o desenvolvimento paralelo da equipa e garantir um código modular e organizado.

A estrutura de pacotes foi definida da seguinte forma:
- `br.com.ucsal.simulador.modelo`: Contém as regras de negócio puras (classes `Veiculo` e `Corrida`).
- `br.com.ucsal.simulador.visao`: Contém a lógica de interface (classe `Renderizador`), separando o desenho visual da matemática do jogo.
- `br.com.ucsal.simulador.Main`: Atua como orquestrador, ditando o ritmo da simulação e conectando a visão ao modelo.

> **Nota de Conformidade:** Cumprindo rigorosamente a regra de avaliação do trabalho, o código-fonte entregue não contém qualquer tipo de comentário explicativo.

## 🚀 Como Compilar e Executar (Via Terminal)

Para cumprir o requisito de compilação ao vivo diante da professora durante a apresentação, executa os comandos abaixo diretamente no terminal:

### Passo 1: Aceder à pasta do código
Navega até à pasta `src` do projeto no teu terminal:
```bash
cd caminho/para/o/projeto/src
```

### Passo 2: Compilar os ficheiros
Compila todos os ficheiros `.java` mantendo a estrutura dos pacotes:
```bash
javac br/com/ucsal/simulador/modelo/*.java br/com/ucsal/simulador/visao/*.java br/com/ucsal/simulador/Main.java
```

### Passo 3: Executar a simulação
Executa a classe principal chamando o caminho do pacote (sem a extensão `.class`):
```bash
java br.com.ucsal.simulador.Main
```

## 🔄 Metodologia de Trabalho
O projeto foi conduzido através de Sprints de codificação utilizando o **GitHub Flow**:
- **Sprint 1:** Construção das classes base (`Veiculo`, `Corrida`, `Renderizador`, `Main`) em *branches* isoladas.
- **Sprint 2:** Integração progressiva dos módulos e sincronização do laço principal.
- **Sprint 3:** Bateria de testes de cenários (empates e ultrapassagens), limpeza de comentários e homologação para apresentação.