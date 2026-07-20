package com.petshop.boutiqueusuario.business.converter;

import com.petshop.boutiqueusuario.business.dto.*;
import com.petshop.boutiqueusuario.infrastructure.entity.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UsuarioConverter {

    public Usuario paraUsuario(UsuarioDTO usuarioDTO){
        return Usuario.builder()
                .nomeCompleto(usuarioDTO.getNomeCompleto())
                .cpf(usuarioDTO.getCpf())
                .email(usuarioDTO.getEmail())
                .senha(usuarioDTO.getSenha())
                .enderecos(usuarioDTO.getEnderecos() != null ? paraListaEndereco(usuarioDTO.getEnderecos()) : null)
                .telefones(usuarioDTO.getTelefones() != null ? paraListaTelefone(usuarioDTO.getTelefones()) : null)
                .build();
    }

    public List<Endereco> paraListaEndereco(List<EnderecoDTO> enderecoDTOS){
        List<Endereco> enderecos = new ArrayList<>();
        for (EnderecoDTO enderecoDTO : enderecoDTOS){
            enderecos.add(paraEndereco(enderecoDTO));
        }
        return enderecos;
    }

    public Endereco paraEndereco(EnderecoDTO enderecoDTO){
        return Endereco.builder()
                .rua(enderecoDTO.getRua())
                .numero(enderecoDTO.getNumero())
                .complemento(enderecoDTO.getComplemento())
                .cidade(enderecoDTO.getCidade())
                .estado(enderecoDTO.getEstado())
                .bairro(enderecoDTO.getBairro())
                .cep(enderecoDTO.getCep())
                .build();
    }

    public List<Telefone> paraListaTelefone(List<TelefoneDTO> telefoneDTOS){
        return telefoneDTOS.stream().map(this::paraTelefone).toList();
    }

    public Telefone paraTelefone(TelefoneDTO telefoneDTO){
        return Telefone.builder()
                .numero(telefoneDTO.getNumero())
                .ddd(telefoneDTO.getDdd())
                .build();
    }

    public Pet paraPet(PetDTO petDTO){
        return Pet.builder()
                .nome(petDTO.getNome())
                .especie(petDTO.getEspecie())
                .raca(petDTO.getRaca())
                .sexo(petDTO.getSexo())
                .observacoes(petDTO.getObservacoes())
                .dataNascimento(petDTO.getDataNascimento())
                .build();
    }

    public HistoricoPet paraHistoricoPet(HistoricoPetDTO historicoPetDTO){
        return HistoricoPet.builder()
                .descricao(historicoPetDTO.getDescricao())
                .dataRegistro(historicoPetDTO.getDataRegistro())
                .build();
    }

    // Para DTO
    public UsuarioDTO paraUsuarioDTO(Usuario usuario){
        return UsuarioDTO.builder()
                .nomeCompleto(usuario.getNomeCompleto())
                .cpf(usuario.getCpf())
                .email(usuario.getEmail())
                .senha(usuario.getSenha())
                .enderecos(usuario.getEnderecos() != null ? paraListaEnderecoDTO(usuario.getEnderecos()) : null)
                .telefones(usuario.getTelefones() != null ? paraListaTelefoneDTO(usuario.getTelefones()) : null)
                .build();
    }

    public List<EnderecoDTO> paraListaEnderecoDTO(List<Endereco> enderecos){
        List<EnderecoDTO> enderecoDTOS = new ArrayList<>();
        for (Endereco endereco : enderecos){
            enderecoDTOS.add(paraEnderecoDTO(endereco));
        }
        return enderecoDTOS;
    }

    public EnderecoDTO paraEnderecoDTO(Endereco endereco){
        return EnderecoDTO.builder()
                .rua(endereco.getRua())
                .numero(endereco.getNumero())
                .complemento(endereco.getComplemento())
                .cidade(endereco.getCidade())
                .estado(endereco.getEstado())
                .bairro(endereco.getBairro())
                .cep(endereco.getCep())
                .build();
    }

    public List<TelefoneDTO> paraListaTelefoneDTO(List<Telefone> telefones){
        return telefones.stream().map(this::paraTelefoneDTO).toList();
    }

    public TelefoneDTO paraTelefoneDTO(Telefone telefone){
        return TelefoneDTO.builder()
                .numero(telefone.getNumero())
                .ddd(telefone.getDdd())
                .build();
    }

    public PetDTO paraPetDTO(Pet pet){
        return PetDTO.builder()
                .nome(pet.getNome())
                .especie(pet.getEspecie())
                .raca(pet.getRaca())
                .sexo(pet.getSexo())
                .observacoes(pet.getObservacoes())
                .dataNascimento(pet.getDataNascimento())
                .build();
    }

    public HistoricoPetDTO paraHistoricoPetDTO(HistoricoPet historicoPet){
        return HistoricoPetDTO.builder()
                .descricao(historicoPet.getDescricao())
                .dataRegistro(historicoPet.getDataRegistro())
                .build();
    }

}
