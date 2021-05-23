FROM openjdk:8-jdk-alpine

# build parameters
ARG JAR_FILE
ARG WORK_PATH="/Users/michael/Documents/workspace/doctors"

# env variables
ENV JAVA_OPTS="" \
    JAR_FILE=${JAR_FILE}

MAINTAINER michaelggmanz@gmail.com

VOLUME /tmp
COPY target/DoctorS-0.0.1.war doctors.war
ENTRYPOINT ["java", "-jar", "/doctors.war"]
EXPOSE 8090