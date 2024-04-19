package com.aiqiku.luapigateway.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;


/**
 * 定义KeyResolver的bean对象
 */

@Slf4j
@Configuration
public class KeyResolverConfig {

    /**
     * 基于url
     */
    @Bean
    public KeyResolver pathKeyResolver() {
        System.out.println("基于url限流");
        return exchange -> Mono.just(
                exchange.getRequest().getPath().toString()
        );
    }

    /**
     * 基于用户限流
     */
    @Bean
    KeyResolver userKeyResolver() {
        System.out.println("基于用户限流");
        //按用户限流
        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("user"));
    }
   
//    @Bean
//    @Primary
//    KeyResolver ipKeyResolver() {
//        System.out.println("基于IP来限流");
//        //按IP来限流
//        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
//    }

    /**
     * 基于IP来限流
     */
    @Primary
    @Bean
    public KeyResolver ipKeyResolver() {
        return new KeyResolver() {
            @Override
            public Mono<String> resolve(ServerWebExchange exchange) {
                ServerHttpRequest request = exchange.getRequest();
                String remoteAddr = request.getRemoteAddress().getAddress().getHostAddress();
                // 这里根据请求【URI】进行限流
                log.info("这里根据url请求 {}", remoteAddr);
                return Mono.just(remoteAddr);
            }
        };
    }
}
