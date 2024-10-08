package com.tienda.demotienda.servicio;

import com.tienda.demotienda.entity.DetallePedido;
import com.tienda.demotienda.repositorio.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePedidoService {

    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    public List<DetallePedido> listarDetalles() {
        return detallePedidoRepository.findAll();
    }

    public DetallePedido obtenerDetallePorId(Long idDetalle) {
        return detallePedidoRepository.findById(idDetalle).orElse(null);
    }

    public DetallePedido crearDetalle(DetallePedido detalle) {
        return detallePedidoRepository.save(detalle);
    }

    public DetallePedido actualizarDetalle(Long idDetalle, DetallePedido detalleActualizado) {
        return detallePedidoRepository.findById(idDetalle).map(detalle -> {
            detalle.setCantidad(detalleActualizado.getCantidad());
            detalle.setPrecioTotal(detalleActualizado.getPrecioTotal());
            detalle.setPedido(detalleActualizado.getPedido());
            detalle.setProducto(detalleActualizado.getProducto());
            return detallePedidoRepository.save(detalle);
        }).orElse(null);
    }

    public void eliminarDetalle(Long idDetalle) {
        detallePedidoRepository.deleteById(idDetalle);
    }
}
