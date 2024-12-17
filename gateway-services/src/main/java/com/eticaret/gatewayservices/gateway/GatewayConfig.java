package com.eticaret.gatewayservices.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("urun-servicess", r -> r.path("/api/products/**") // Urun service yönlendirmesi
                        .uri("http://urun-servicess:8087")) // Güncel servis adı
                .route("siparis-services", r -> r.path("/api/orders/**") // Siparişler için yönlendirme
                        .uri("http://siparis-services:8082"))
                .build();
    }
}
