# 🧩 Java Algorithms & Challenges

Repositório dedicado à prática de **algoritmos**, **estruturas de dados** e **resolução de problemas** em Java — com foco em raciocínio computacional e escrita de código idiomático.

O objetivo não é acumular soluções, mas desenvolver a capacidade de analisar um problema, identificar a estrutura de dados adequada e implementar uma solução eficiente e legível.

## 📂 Estrutura do Repositório

```
java-algorithms-and-challenges/
└── src/
    ├── logic/               # Desafios de lógica e raciocínio algorítmico
    ├── data_structures/     # Implementações do zero: pilhas, filas, listas, árvores, grafos
    └── leetcode/            # Problemas do LeetCode organizados por categoria
        ├── arrays/
        ├── strings/
        ├── linked_lists/
        ├── trees/
        ├── dynamic_programming/
        └── ...
```

Cada solução tem comentários explicando a abordagem escolhida e a complexidade de tempo e espaço.

## 📊 Complexidade — O que analiso em cada solução

| Notação | Nome | Exemplo |
|---|---|---|
| O(1) | Constante | Acesso por índice em array |
| O(log n) | Logarítmica | Busca binária |
| O(n) | Linear | Percorrer uma lista |
| O(n log n) | Linearítmica | Merge sort |
| O(n²) | Quadrática | Bubble sort, força bruta com dois loops |

## 🏗️ Estruturas de Dados (implementadas do zero)

| Estrutura | Status |
|---|---|
| Array dinâmico | ⏳ |
| Stack (Pilha) | ⏳ |
| Queue (Fila) | ⏳ |
| Linked List | ⏳ |
| Binary Search Tree | ⏳ |
| Hash Map | ⏳ |
| Graph | ⏳ |

> Implementar do zero antes de usar as versões da JDK é a forma mais eficaz de entender o custo real de cada operação.

## 🔢 LeetCode — Progresso por Categoria

| Categoria | Resolvidos |
|---|---|
| Arrays & Hashing | 0 |
| Two Pointers | 0 |
| Sliding Window | 0 |
| Stack | 0 |
| Binary Search | 0 |
| Linked List | 0 |
| Trees | 0 |
| Dynamic Programming | 0 |

## 🚀 Como Executar

Pré-requisito: **JDK 17+** instalado.

```bash
# Compilar
javac src/logic/NomeDoDesafio.java

# Executar
java -cp src logic.NomeDoDesafio
```

O ambiente também está configurado com **Docker** para rodar qualquer solução sem instalar Java localmente:

```bash
docker compose up -d
docker exec -it java-challenges java src/logic/NomeDoDesafio.java
```

## 📚 Referências

| Material | Foco |
|---|---|
| *Introduction to Algorithms* — CLRS | Fundação teórica de algoritmos e estruturas de dados |
| [NeetCode.io](https://neetcode.io) | Roadmap de LeetCode organizado por padrões |
| [LeetCode](https://leetcode.com/wendersonguedez) | Plataforma de prática |

## 🔗 Outros Repositórios

| Repo | Descrição |
|---|---|
| [java-engineering-fundamentals](https://github.com/wendersonguedez/java-engineering-fundamentals) | Core Java, OOP, SOLID e fundamentos da linguagem |
| [task-tracker-cli](https://github.com/wendersonguedez/task-tracker-cli) | Projeto prático: CLI de gerenciamento de tarefas em Java puro |
| [gallery-plus](https://github.com/wendersonguedez/gallery-plus) | Projeto fullstack em TypeScript com deploy em produção (Railway) |

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=flat-square&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/LeetCode-Em%20progresso-yellow?style=flat-square&logo=leetcode&logoColor=white" />
  <img src="https://img.shields.io/badge/Foco-DSA%20%26%20Problem%20Solving-informational?style=flat-square" />
</p>
