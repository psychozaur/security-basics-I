package workshop.sb.security.basics;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SecurityBasicsApplication {

	public static void main(String[] args) {
		// TODO 7 dodaj konfigurację security do SpringApplication.run
		SpringApplication.run(SecurityBasicsApplication.class, args);
	}

	/*
		https://igorski.co/java/spring-boot/layout-dialect-spring-boot-2/
	 */
	@Bean
	public LayoutDialect layoutDialect() {
		return new LayoutDialect();
	}

}

