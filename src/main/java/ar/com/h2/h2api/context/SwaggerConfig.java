package ar.com.h2.h2api.context;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


import java.util.Collections;
// Usamos para la configuracion de  doc de  la API REST
@Configuration

public class SwaggerConfig {
    @Bean
    public Docket apiD() {


        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiDetails())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();


    }

    private ApiInfo apiDetails() {
return new ApiInfo("Spring Boot API REST",
                "Library Api rest docs",
                "1.0",
                "https://www.google.com.ar",
                new Contact("Liliana","https://www.google.com.ar", "alan@example.com" ),
                "MIT",
                "https://www.google.com.ar",
                Collections.emptyList());

    }
}
