# Usa uma imagem leve do Java (Eclipse Temurin é a recomendada hoje em dia)
FROM eclipse-temurin:17-jdk-alpine

# Define a pasta de trabalho dentro do container
WORKDIR /app

# O comando abaixo mantém o container rodando para você poder executar comandos nele
CMD ["tail", "-f", "/dev/null"]