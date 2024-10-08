package com.tienda.demotienda.servicio;

import com.tienda.demotienda.entity.Pedido;
import com.tienda.demotienda.repositorio.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {


    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    public Pedido obtenerPedidoPorId(Long idPedido) {
        return pedidoRepository.findById(idPedido).orElse(null);
    }

    public Pedido crearPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public Pedido actualizarPedido(Long idPedido, Pedido pedidoActualizado) {
        return pedidoRepository.findById(idPedido).map(pedido -> {
            pedido.setFecha(pedidoActualizado.getFecha());
            pedido.setEstado(pedidoActualizado.getEstado());
            pedido.setCliente(pedidoActualizado.getCliente());
            return pedidoRepository.save(pedido);
        }).orElse(null);
    }

    public void eliminarPedido(Long idPedido) {
        pedidoRepository.deleteById(idPedido);
    }
}
