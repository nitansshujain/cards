package com.microservice.cards;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.microservice.cards.controller") })
@EnableJpaRepositories("com.microservice.cards.repository")
@EntityScan("com.microservice.cards.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "JainBank Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Nitansshu Jain",
						email = "nitansshujain@gmail.com",
						url = "https://www.linkedin.com/in/nitansshujain/"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.linkedin.com/in/nitansshujain/"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "JainBank Accounts microservice REST API Documentation",
				url = "https://www.linkedin.com/in/nitansshujain/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}
