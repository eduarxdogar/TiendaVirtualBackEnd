package com.tienda.demotienda.repositorio;

import com.tienda.demotienda.entity.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepository  extends JpaRepository<Inventario,Long> {
}
