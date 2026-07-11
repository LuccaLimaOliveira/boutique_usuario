package com.petshop.boutiqueusuario.infrastructure.repository;

import com.petshop.boutiqueusuario.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
