package com.petshop.boutiqueusuario.infrastructure.repository;

import com.petshop.boutiqueusuario.infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
