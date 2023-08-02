FROM cimg/openjdk:17.0

WORKDIR /

COPY target/phone-country-0.0.1-SNAPSHOT.jar phone-country.jar

ENTRYPOINT ["java", "-jar", "/phone-country.jar"]
