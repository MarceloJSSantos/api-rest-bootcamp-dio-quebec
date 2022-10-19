package br.marcelojssantos.webapirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class WebApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApiRestApplication.class, args);
	}

}
