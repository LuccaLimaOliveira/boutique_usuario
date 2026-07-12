package com.petshop.boutiqueusuario.infrastructure.repository;

import com.petshop.boutiqueusuario.infrastructure.entity.HistoricoPet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricoPetRepository extends JpaRepository<HistoricoPet, Long> {
}
