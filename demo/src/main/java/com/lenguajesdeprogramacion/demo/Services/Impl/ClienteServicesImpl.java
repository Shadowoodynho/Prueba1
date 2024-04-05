package com.lenguajesdeprogramacion.demo.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lenguajesdeprogramacion.demo.Entities.Cliente;
import com.lenguajesdeprogramacion.demo.Repositories.ClienteRepository;
import com.lenguajesdeprogramacion.demo.Services.ClienteServices;

@Service
public class ClienteServicesImpl implements ClienteServices {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerTodosLosClientes() {
        return (List<Cliente>) this.clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(int idCliente) {
        return this.clienteRepository.findById(idCliente).get();
    }

}
