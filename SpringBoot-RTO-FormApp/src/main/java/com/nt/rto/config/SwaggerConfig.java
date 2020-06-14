package com.nt.rto.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket createDocket() {
		System.out.println("SwaggerConfig.createDocket()");
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.nt.app.controller")).paths(PathSelectors.any())
				.build().apiInfo(apiInfo());

	}

	public ApiInfo apiInfo() {

		return new ApiInfo("Vehicle", "Get Vehicle Details", "1.0", "www.vehicles.com/termsAndCons",
				new Contact("siri", "siri.com/vehicle", "siri@vehicle.com"), "LICENSE-2020", " www.vehicle.org/license-siri",
				Collections.emptyList());
	}
}
