package com.tienda.demotienda.servicio;

import com.tienda.demotienda.entity.Inventario;
import com.tienda.demotienda.repositorio.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    public List<Inventario> listarInventarios() {
        return inventarioRepository.findAll();
    }

    public Inventario obtenerInventarioPorId(Long idInventario) {
        return inventarioRepository.findById(idInventario).orElse(null);
    }

    public Inventario crearInventario(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    public Inventario actualizarInventario(Long idInventario, Inventario inventarioActualizado) {
        return inventarioRepository.findById(idInventario).map(inventario -> {
            inventario.setCantidadDisponible(inventarioActualizado.getCantidadDisponible());
            inventario.setUbicacion(inventarioActualizado.getUbicacion());
            inventario.setProducto(inventarioActualizado.getProducto());
            return inventarioRepository.save(inventario);
        }).orElse(null);
    }

    public void eliminarInventario(Long idInventario) {
        inventarioRepository.deleteById(idInventario);
    }
}
