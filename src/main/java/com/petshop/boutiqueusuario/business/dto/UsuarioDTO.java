package com.petshop.boutiqueusuario.business.dto;

import com.petshop.boutiqueusuario.infrastructure.entity.Endereco;
import com.petshop.boutiqueusuario.infrastructure.entity.Telefone;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioDTO {

    private String nomeCompleto;
    private String cpf;
    private String email;
    private String senha;

    private List<EnderecoDTO> enderecos;
    private List<TelefoneDTO> telefones;
}
