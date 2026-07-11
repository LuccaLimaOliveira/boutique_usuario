package com.petshop.boutiqueusuario.infrastructure.repository;

import com.petshop.boutiqueusuario.infrastructure.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
