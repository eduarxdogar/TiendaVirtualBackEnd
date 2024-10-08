package com.tienda.demotienda.servicio;

import com.tienda.demotienda.entity.Producto;
import com.tienda.demotienda.repositorio.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    public Producto obtenerProductoPorId(Long idProducto) {
        return productoRepository.findById(idProducto).orElse(null);
    }

    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto actualizarProducto(Long idProducto, Producto productoActualizado) {
        return productoRepository.findById(idProducto).map(producto -> {
            producto.setNombre(productoActualizado.getNombre());
            producto.setPrecio(productoActualizado.getPrecio());
            producto.setStock(productoActualizado.getStock());
            return productoRepository.save(producto);
        }).orElse(null);
    }

    public void eliminarProducto(Long idProducto) {
        productoRepository.deleteById(idProducto);
    }
}

