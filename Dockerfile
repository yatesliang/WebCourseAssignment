FROM maven:3.6-jdk-8
MAINTAINER yates.lyc@gmail.com

COPY . /www/server
WORKDIR /www/server
RUN mvn clean install -Dmaven.test.skip=true -U 
CMD mvn spring-boot:run
