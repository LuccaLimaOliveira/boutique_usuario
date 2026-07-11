package com.petshop.boutiqueusuario.infrastructure.repository;

import com.petshop.boutiqueusuario.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
