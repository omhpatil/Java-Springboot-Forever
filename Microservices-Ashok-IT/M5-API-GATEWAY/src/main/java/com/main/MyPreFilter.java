package com.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.List;

@Component
public class MyPreFilter implements GlobalFilter {

    private static final Logger logger = LoggerFactory.getLogger(MyPreFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        logger.info("filter() method executed....");

        // Get incoming request
        ServerHttpRequest request = exchange.getRequest();

        // Get request headers
        HttpHeaders headers = request.getHeaders();

        // Print all headers
        headers.headerNames().forEach(headerName -> {
            List<String> values = headers.get(headerName);
            System.out.println(headerName + " :: " + values);
        });

        // Continue request processing
        return chain.filter(exchange);
    }
}