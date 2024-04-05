package com.lenguajesdeprogramacion.demo.Services;

import java.util.List;

import com.lenguajesdeprogramacion.demo.Entities.Cliente;

public interface ClienteServices {

    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> obtenerTodosLosClientes();

    public Cliente buscarPorId(int idCliente);
}
