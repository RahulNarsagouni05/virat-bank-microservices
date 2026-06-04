package com.viratbank.accounts;

import com.viratbank.accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableFeignClients
/*@ComponentScans({ @ComponentScan("com.viratbank.accounts.controller") })
@EnableJpaRepositories("com.viratbank.accounts.repository")
@EntityScan("com.viratbank.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "viratbank Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Virat Kohli",
						email = "kohli@viratbank.com",
						url = "https://www.viratbank.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.viratbank.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "viratbank Accounts microservice REST API Documentation",
				url = "https://www.viratbank.com/swagger-ui.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
