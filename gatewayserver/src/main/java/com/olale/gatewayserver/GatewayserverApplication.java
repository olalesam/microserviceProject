package com.olale.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayserverApplication.class, args);
	}

//    @Bean
//    public RouteLocator routes(RouteLocatorBuilder rlb) {
//        return rlb.routes()
//                // Alias propre: /teachers/** -> /api/teachers/** sur TEACHER-MICROSERVICE
//                .route("teacher", r -> r
//                        .path("/teachers/**")
//                        .filters(f -> f.rewritePath("^/teachers/(?<seg>.*)", "/api/teachers/${seg}"))
//                        .uri("lb://TEACHER-MICROSERVICE"))
//
//                // (optionnel) garde aussi l’URL “technique” si tu veux tester
//                .route("teacher-micro", r -> r
//                        .path("/teacher-microservice/**")
//                        .filters(f -> f.stripPrefix(1))
//                        .uri("lb://TEACHER-MICROSERVICE"))
//
//                .route("department", r -> r
//                        .path("/departments/**")
//                        .filters(f -> f.rewritePath("^/departments/(?<seg>.*)", "/api/departments/${seg}"))
//                        .uri("lb://DEPARTMENT-MICROSERVICE"))
//                .build();
//    }
}
