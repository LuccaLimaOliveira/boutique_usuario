package com.petshop.boutiqueusuario.business.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PetDTO {

    private Long id;
    private String nome;
    private String especie;
    private String raca;
    private String porte;
    private String sexo;
    private String observacoes;
    private LocalDate dataNascimento;
}
