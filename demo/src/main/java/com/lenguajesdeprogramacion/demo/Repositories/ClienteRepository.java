package com.lenguajesdeprogramacion.demo.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.lenguajesdeprogramacion.demo.Entities.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
