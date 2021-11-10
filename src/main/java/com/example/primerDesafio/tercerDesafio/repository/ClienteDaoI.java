package com.example.primerDesafio.tercerDesafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

@Component
public interface ClienteDaoI extends JpaRepository {
	
	public void insertClienteById(@Param("id") Long id,@Param("nombre") String nombre,
			@Param("primerApellido") String primerApellido,@Param("segundoApellido") String segundoApellido,
			@Param("fechaDeNacimiento") String fechaDeNacimiento,@Param("docIdentidad") String docIdentidad);

}
