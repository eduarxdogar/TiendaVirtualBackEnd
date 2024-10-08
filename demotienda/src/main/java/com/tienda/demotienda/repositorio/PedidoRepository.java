package com.tienda.demotienda.repositorio;

import com.tienda.demotienda.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository  extends JpaRepository<Pedido ,Long> {
}
