package com.wind.zuul.main;

import com.netflix.zuul.ZuulFilter;
import com.wind.zuul.filter.GatewayFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class WindZuulGatewayApplication {

	@Bean
	public ZuulFilter getGatewayFilter() {
		return new GatewayFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(WindZuulGatewayApplication.class, args);
	}
}
