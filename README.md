# Basic Java Challenges ☕

Repositório destinado ao estudo de lógica de programação, algoritmos e fundamentos da linguagem Java.

O objetivo é resolver desafios básicos e práticos, focando na sintaxe e nas estruturas de dados da linguagem, mantendo um ambiente de desenvolvimento limpo e isolado.

## 🚀 Tecnologias

- **Java 17** (OpenJDK / Eclipse Temurin)
- **Docker & Docker Compose** (para ambiente de execução)

## 🐳 Por que Docker?

Para evitar problemas comuns como "na minha máquina funciona" ou conflitos entre diferentes versões do JDK instaladas no sistema operacional, este projeto foi configurado para rodar inteiramente dentro de um container Docker.

Isso garante que:
1. Não é necessário instalar o Java no seu computador local.
2. O ambiente é leve (Alpine Linux) e descartável.
3. Você pode editar o código na sua IDE favorita e rodar o resultado instantaneamente no container.

## 🛠️ Como executar

### 1. Subindo o ambiente
Na raiz do projeto, execute o comando abaixo para construir e iniciar o container em segundo plano:

```bash
docker compose up -d
```

### 2. Rodando os códigos (modo recomendado)

Para ter uma experiência fluida (com autocomplete funcionando no terminal), recomendo "entrar" no container e executar os comandos de lá.

1. Acesse o terminal interativo do container:
    ```bash
    docker exec -it basic-java-challenges sh
    ```
2. Agora, dentro do container, você pode navegar e executar os arquivos Java diretamente. O Tab funcionará para completar os caminhos:
    ```bash
    # Exemplo de execução
    java src/fundamentals/difference/Difference.java
    ```
3. Para sair do container, basta digitar exit.

<hr/>

#### Alternativa (comando único)
Se preferir rodar apenas um arquivo sem entrar no container (o autocomplete do terminal pode não funcionar bem aqui):

```bash
docker exec -it basic-java-challenges java src/fundamentals/difference/Difference.java
```
<hr/>

## 📂 Estrutura do Projeto

Os arquivos fonte estão dentro da pasta `src`. Lembre-se que em Java, a estrutura de pastas deve seguir o nome do pacote (`package`).

```text
├── docker-compose.yml   # Configuração do serviço Docker
├── Dockerfile           # Definição da imagem Java 17 Alpine
└── src/
    └── fundamentals/    # Exercícios de fundamentos
        └── difference/
            └── Difference.java
```