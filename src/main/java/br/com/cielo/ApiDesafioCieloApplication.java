package br.com.cielo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan
@EnableWebMvc
@EnableAutoConfiguration
@Configuration
@SpringBootApplication
public class ApiDesafioCieloApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiDesafioCieloApplication.class, args);
		System.out.println("SERVIÇO PRONTO PARA SER CONSUMIDO!......");
	}
}
