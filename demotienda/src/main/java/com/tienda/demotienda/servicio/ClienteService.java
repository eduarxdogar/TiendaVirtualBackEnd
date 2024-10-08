package com.tienda.demotienda.servicio;

import com.tienda.demotienda.entity.Cliente;
import com.tienda.demotienda.repositorio.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Cliente obtenerClientePorId(Long idCliente) {
        return clienteRepository.findById(idCliente).orElse(null);
    }

    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente actualizarCliente(Long idCliente, Cliente clienteActualizado) {
        return clienteRepository.findById(idCliente).map(cliente -> {
            cliente.setNombre(clienteActualizado.getNombre());
            cliente.setEmail(clienteActualizado.getEmail());
            cliente.setDireccion(clienteActualizado.getDireccion());
            return clienteRepository.save(cliente);
        }).orElse(null);
    }

    public void eliminarCliente(Long idCliente) {
        clienteRepository.deleteById(idCliente);
    }
}
