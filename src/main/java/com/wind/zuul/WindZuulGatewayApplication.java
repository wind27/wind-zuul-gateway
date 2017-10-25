package com.wind.zuul;

import com.netflix.zuul.ZuulFilter;
import com.wind.zuul.filter.GatewayFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.web.*;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;


//@Import({ DispatcherServletAutoConfiguration.class, EmbeddedServletContainerAutoConfiguration.class,
//		ErrorMvcAutoConfiguration.class, HttpEncodingAutoConfiguration.class,
//		HttpMessageConvertersAutoConfiguration.class, JacksonAutoConfiguration.class, MultipartAutoConfiguration.class,
//		ServerPropertiesAutoConfiguration.class, WebMvcAutoConfiguration.class })
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
