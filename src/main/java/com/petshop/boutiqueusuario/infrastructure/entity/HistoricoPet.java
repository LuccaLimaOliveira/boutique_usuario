package com.petshop.boutiqueusuario.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "historicoPet")
@Builder
public class HistoricoPet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao", length = 100)
    private String descricao;
    @Column(name = "dataRegistro", length = 100)
    private String dataRegistro;
    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
}
