package br.marcelojssantos.webapirest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.HashSet;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket documentacaoAPI(){
        var docket = new Docket(DocumentationType.SWAGGER_2);

        docket.select()
                .apis(RequestHandlerSelectors.basePackage("br.marcelojssantos.webapirest.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.informacoesAPI().build())
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")));

        return docket;
    }

    private ApiInfoBuilder informacoesAPI(){
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

        apiInfoBuilder.title("API REST")
                .description("API REST com Spring Web e documentada c/ Swagger")
                .version("1.0.0")
                .contact(this.contato())
                .build();

        return apiInfoBuilder;
    }

    private Contact contato(){
        return new Contact(
                "Marcelo JS Santos",
                "https://github.com/MarceloJSSantos/api-rest-bootcamp-dio-quebec",
                null);
    }

}
