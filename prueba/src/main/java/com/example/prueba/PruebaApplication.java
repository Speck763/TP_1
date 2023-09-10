package com.example.prueba;

import com.example.prueba.repositorios.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PruebaApplication {

	@Autowired
	ClienteRepository clienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
		System.out.println("Estoy Funcionando con one to many");
	}

	@Bean
	CommandLineRunner init(ClienteRepository clienteRepository){
		return args -> {
			System.out.println("--------Estoy funcionando--------");
		};
	}
}
