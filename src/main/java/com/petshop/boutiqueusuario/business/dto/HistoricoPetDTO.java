package com.petshop.boutiqueusuario.business.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HistoricoPetDTO {

    private Long id;
    private String descricao;
    private String dataRegistro;
}
