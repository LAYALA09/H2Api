package ar.com.h2.h2api.context;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



//http://localhost:8080/swagger-ui.html

@EnableSwagger2

// Usamos para la configuracion de  doc de  la API REST
@Configuration

public class SwaggerConfig {
    @Bean
    public Docket apiD() {

        return new Docket(DocumentationType.SWAGGER_2)

                .select()
                .apis(RequestHandlerSelectors.basePackage("ar.com.h2.h2api"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiDetails());


    }

    private ApiInfo apiDetails() {
        return new ApiInfoBuilder().title("Libros").
                description("Swagger tutorial").license("Libros").build();

    }
}
