package com.tienda.demotienda.repositorio;

import com.mysql.cj.log.Log;
import com.tienda.demotienda.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
