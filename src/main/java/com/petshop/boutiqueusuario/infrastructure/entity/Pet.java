package com.petshop.boutiqueusuario.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pet")
@Builder
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome", length = 100)
    private String nome;
    @Column(name = "especie", length = 100)
    private String especie;
    @Column(name = "raca", length = 100)
    private String raca;
    @Column(name = "porte", length = 100)
    private String porte;
    @Column(name = "sexo", length = 100)
    private String sexo;
    @Column(name = "observacoes", length = 100)
    private String observacoes;
    @Column(name = "dataNascimento", length = 100)
    private LocalDate dataNascimento;

    @Column(name = "usuario_id")
    private Long usuario_id;
}
