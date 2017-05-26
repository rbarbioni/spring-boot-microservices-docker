# Reactive Microservices with docker
## Sample Microservices application build Spring Framework 5.0, Spring-Boot 2.0, Netty-Server, MongoDB with docker.

- Spring-Boot 2.0
- Spring 5.0
- Spring-Data-Mongodb-Reactive
- Mongo-Repositories
- Reactor-Netty-Server
- Docker

# Instructions

<pre>
Clone repo https://github.com/rbarbioni/spring-boot-microservices-docker.git
cd spring-boot-microservices-docker
./gradlew build buildDocker
docker run -p 8080:8080 -t spring-boot-microservices-docker:1.0.0-SNAPSHOT
</pre>
