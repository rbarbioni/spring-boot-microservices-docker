# Reactive Microservices Api with docker
## Microservices application build Spring Framework 5.0, Spring-Boot 2.0, Netty-Server, MongoDB with Docker and docker-compose.

- Spring-Boot 2.0
- Spring 5.0
- Spring-Data-Mongodb-Reactive
- Mongo-Repositories
- Reactor-Netty-Server
- Docker
- Docker-Compose

# Instructions

Install Docker
https://docs.docker.com/engine/installation/

Application
<pre>
Clone repo https://github.com/rbarbioni/spring-boot-microservices-docker.git
cd spring-boot-microservices-docker
./gradlew clean build && docker-compose up --build -d
</pre>

GET http://localhost:8080/api/user

GET http://localhost:8080/api/user/{id}

DELETE http://localhost:8080/api/user/{id}

PUT http://localhost:8080/api/user/{id}

POST http://localhost:8080/api/user

<pre>
{
  "name":"Renan",
  "email": "renan@email.com"
}
</pre>