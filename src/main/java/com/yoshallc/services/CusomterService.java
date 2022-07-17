package com.yoshallc.services;

import com.yoshallc.requests.CustomerInqRequest;
import com.yoshallc.responses.CustomerInqResponse;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class CusomterService {

     private WebClient webClient;

    public Mono<CustomerInqResponse> getCustomerAccountInformation(){

        CustomerInqRequest customerInqRequest = new CustomerInqRequest("123-45-6789");

        webClient = WebClient.create("http://localhost:8080");
        return webClient
                .post()
                .uri("/api/customerinq")
                .accept(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromValue(customerInqRequest))
                .retrieve()
                .bodyToMono(CustomerInqResponse.class);
    }
}
