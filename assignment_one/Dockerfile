FROM eclipse-temurin:21-jdk-jammy

WORKDIR /app

COPY src ./src

RUN find src -name "*.java" >source.txt \ && javac @source.txt -d out

CMD  ["java ", "out", "casestudy.question1.Main"]


