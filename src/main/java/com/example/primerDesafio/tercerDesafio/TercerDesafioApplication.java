package com.example.primerDesafio.tercerDesafio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.primerDesafio.tercerDesafio.entities.Cliente;
import com.example.primerDesafio.tercerDesafio.services.ClienteServiceI;

@SpringBootApplication
public class TercerDesafioApplication implements CommandLineRunner {
	
	
	@Autowired
	ClienteServiceI clienteService;

	public static void main(String[] args) {
		SpringApplication.run(TercerDesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Añadir
		Cliente c1 = new Cliente();
		c1.setId(1);
		c1.setNombre("Massimiliano");
		c1.setPrimerApellido("Utzeri");
		c1.setSegundoApellido("Giuliani");
		c1.setDocIdentidad(452147547);
		clienteService.addClient(c1);
		
		Cliente c2 = new Cliente();
		c2.setId(2);
		c2.setNombre("Antonio");
		c2.setPrimerApellido("Orozco");
		c2.setSegundoApellido("Rodriguez");
		c2.setDocIdentidad(431147547);
		clienteService.addClient(c1);
		
		//Remover
		clienteService.delete(c2);
		
		//Buscar por nombre y apellido
		
		System.out.println(clienteService.findClienteByNombreANDApellidos("Massimiliano", "Utzeri", "Giuliani").toString());

	}

}
