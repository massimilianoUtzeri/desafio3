package com.example.primerDesafio.tercerDesafio.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.primerDesafio.tercerDesafio.entities.Cliente;
import com.example.primerDesafio.tercerDesafio.repository.ClienteRepositoryI;

@Service
public class ClienteServiceImpl implements ClienteServiceI {
	
	@Autowired
	ClienteRepositoryI repository;
	
	@Override
	@Transactional
	public Cliente findClienteByNombreANDApellidos(String nombre, String primerApellido, String segundoApellido) {
		
		return repository.findClienteByNombreANDApellidos(nombre, primerApellido, segundoApellido);
		
	}

	@Override
	@Transactional
	public void addClient(Cliente cliente) {
		repository.save(cliente);
	}

	@Override
	@Transactional
	public void deleteClient(Cliente cliente) {
		repository.delete(cliente);
		
	}

	@Override
	@Transactional
	public void modifyClient(Cliente cliente) {
	repository.save(cliente);
		
	} 

	@Override
	@Transactional
	public Cliente searchClient(Long id) {
		Cliente c =  repository.getById(id);
		return c;
	}

	@Override
	@Transactional
	public Cliente searchClientByNameAndSurname(String nombre, String primerApellido, String SegundoApellido) {
		
		return repository.findClienteByNombreANDApellidos(nombre, primerApellido, SegundoApellido);
	}

	@Override
	public List<Cliente> findAll() {
		
		return repository.findAll();
	}

	@Override
	public List<Cliente> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cliente> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Cliente> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cliente> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Cliente> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cliente> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cliente> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Cliente> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cliente> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Cliente> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Cliente entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Cliente> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Cliente> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cliente> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cliente> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Cliente> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}