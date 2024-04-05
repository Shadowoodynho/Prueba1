package com.lenguajesdeprogramacion.demo.Controllers;

import org.springframework.web.bind.annotation.RestController;

import com.lenguajesdeprogramacion.demo.Entities.Cliente;
import com.lenguajesdeprogramacion.demo.Services.Impl.ClienteServicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api")
public class ClienteController {

    @Autowired
    private ClienteServicesImpl clienteServicesImpl;

    @PostMapping("/clientes/nuevo")
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return this.clienteServicesImpl.crearCliente(cliente);
    }

    @GetMapping("clientes/todos")
    public List<Cliente> obtenerTodosLosClientes() {
        return this.clienteServicesImpl.obtenerTodosLosClientes();
    }

    @GetMapping("clientes/porId")
    public Cliente getCliente(@RequestParam(name = "codigoCliente") int codigoCliente) {
        return this.clienteServicesImpl.buscarPorId(codigoCliente);
    }

}
