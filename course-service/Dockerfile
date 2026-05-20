FROM eclipse-temurin:21-jdk

WORKDIR /workspace
COPY . .
RUN chmod +x gradlew && ./gradlew :course-service:bootJar --no-daemon

EXPOSE 8081
ENTRYPOINT ["java", "-jar", "course-service/build/libs/course-service-0.0.1-SNAPSHOT.jar"]
