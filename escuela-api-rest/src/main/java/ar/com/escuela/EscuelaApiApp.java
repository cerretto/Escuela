package ar.com.escuela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class EscuelaApiApp {

	public static void main(String[] args) {
		SpringApplication.run(EscuelaApiApp.class, args);
	}

}
