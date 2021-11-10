package com.example.primerDesafio.tercerDesafio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.primerDesafio.tercerDesafio.entities.Cliente;

@SpringBootApplication
public class TercerDesafioApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TercerDesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Cliente c1 = new Cliente();
		c1.setId(1);
		c1.setNombre("Massimiliano");
		c1.setPrimerApellido("Utzeri");
		c1.setSegundoApellido("Giuliani");
		c1.setDocIdentidad(452147547);
		
		
		
	}

}
