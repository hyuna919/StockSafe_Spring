package com.LJ.StockSafe.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//http://localhost:9999/swagger-ui.html
	
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("StockSafeApi")
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.LJ.StockSafe.controller"))
				.paths(PathSelectors.ant("/**"))
				.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("StockSafe API")
				.description("StockSafe API Reference for Developers")
				.termsOfServiceUrl("https://github.com/hyuna919/StockSafe_Spring")
				.license("StockSafe License")
				.licenseUrl("ssafy@ssafy.com").version("1.0").build();
	}

}
