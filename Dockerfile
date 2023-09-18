FROM openjdk:17.0.1-jdk-slim
MAINTAINER delivery_post_service.com
# #if you want to specify jar-file in console use next 3 lines and add after 'docker build'
# #next line '--build-arg JAR_FILE=target/*.jar' for maven build
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","${JAVA_OPTS}","-jar","/app.jar"]
# # otherwise directly specify jar

COPY target/*.jar delivery_post_service.jar
EXPOSE 1085 5432
ENTRYPOINT ["java","-Dspring.profile.active=test" ,"-jar","delivery_post_service.jar"]