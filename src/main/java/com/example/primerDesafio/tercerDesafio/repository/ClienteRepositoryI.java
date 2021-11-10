package com.example.primerDesafio.tercerDesafio.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.primerDesafio.tercerDesafio.entities.Cliente;

@Repository
public interface ClienteRepositoryI extends JpaRepository<Cliente, Long> {
	
	Cliente findClienteByNombreANDApellidos(String nombre,String primerApellido,String segundoApellido);
	public void addClient(Cliente cliente);
	public void deleteClient(Cliente cliente);
	public void modifyClient(Cliente cliente);
	public Cliente searchClient(Long id);
	public Cliente searchClientByNameAndSurname(String nombre,String primerApellido,String SegundoApellido);
	
}
