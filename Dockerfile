FROM adoptopenjdk/openjdk11:jdk-11.0.8_10-alpine

# build parameters
ARG JAR_FILE
ARG WORK_PATH="/Users/michael/Documents/workspace/doctors"

# env variables
ENV JAVA_OPTS="" \
    JAR_FILE=${JAR_FILE}

MAINTAINER michaelggmanz@gmail.com

VOLUME /tmp
COPY target/DoctorS-0.0.1.jar doctors.jar
ENTRYPOINT ["java", "-jar", "/doctors.jar"]
EXPOSE 8090