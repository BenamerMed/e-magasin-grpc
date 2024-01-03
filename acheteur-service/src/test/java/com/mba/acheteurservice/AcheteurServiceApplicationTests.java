package com.mba.acheteurservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AcheteurServiceApplicationTests {

    @Test
    void contextLoads() {
    }
/*
FROM,openjdk:17
VOLUME /tmp
COPY target/*.jar ap.jar
ENTRYPOINT ["java","-jar","/ap.jar"]
*/
}
