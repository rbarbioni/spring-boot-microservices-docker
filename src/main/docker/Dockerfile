FROM frolvlad/alpine-oraclejdk8:slim

RUN mkdir workspace

WORKDIR workspace

ADD ./build/libs/spring-boot-microservices-docker-1.0.0-SNAPSHOT.jar app.jar

EXPOSE 5005

EXPOSE 8085

CMD java -jar ${ADDITIONAL_OPTS} app.jar