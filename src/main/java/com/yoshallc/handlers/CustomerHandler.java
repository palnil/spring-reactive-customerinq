package com.yoshallc.handlers;

import com.yoshallc.responses.CustomerInqResponse;
import com.yoshallc.services.CusomterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
@Slf4j
public class CustomerHandler {

    @Autowired
    private CusomterService cusomterService;

    public Mono<ServerResponse> getCustomerAccountResponse(ServerRequest serverRequest){
        Mono<CustomerInqResponse> customerInqResponseMono = cusomterService.getCustomerAccountInformation();
        return ok().body(Mono.just(customerInqResponseMono).block(), CustomerInqResponse.class);
    }
}
