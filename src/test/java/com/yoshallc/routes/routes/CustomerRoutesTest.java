package com.yoshallc.routes.routes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerRoutesTest {

    @Autowired
    private WebTestClient client;

    @Test
    void helloEmployeeRoute(){

        client.get().uri("/hello").exchange().expectStatus().isOk();
    }
}
