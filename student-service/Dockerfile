FROM eclipse-temurin:21-jdk

WORKDIR /workspace
COPY . .
RUN chmod +x gradlew && ./gradlew :student-service:bootJar --no-daemon

EXPOSE 9090
ENTRYPOINT ["java", "-jar", "student-service/build/libs/student-service-0.0.1-SNAPSHOT.jar"]
