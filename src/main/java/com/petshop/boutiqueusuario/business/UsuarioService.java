package com.petshop.boutiqueusuario.business;

import com.petshop.boutiqueusuario.business.converter.UsuarioConverter;
import com.petshop.boutiqueusuario.business.dto.UsuarioDTO;
import com.petshop.boutiqueusuario.infrastructure.Exceptions.ConflictException;
import com.petshop.boutiqueusuario.infrastructure.Exceptions.ResourceNotFoundException;
import com.petshop.boutiqueusuario.infrastructure.entity.Usuario;
import com.petshop.boutiqueusuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;
    private final PasswordEncoder passwordEncoder;

    public UsuarioDTO salvarUsuario(UsuarioDTO usuarioDTO) {
        emailExiste(usuarioDTO.getEmail());
        usuarioDTO.setSenha(passwordEncoder.encode(usuarioDTO.getSenha()));
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }

    public void emailExiste(String email) {
        try {
            boolean existe = verificaEmailExistente(email);
            if (existe) {
                throw new ConflictException("Email já cadastrado!" + email);
            }
        } catch (ConflictException e) {
            throw new ConflictException("Email já cadastrado!" + e.getCause());
        }
    }

    public boolean verificaEmailExistente(String email) {
        return usuarioRepository.existsByEmail(email);
    }

    public UsuarioDTO buscarUsuarioPorEmail(String email) {
        try {
            return usuarioConverter.paraUsuarioDTO(usuarioRepository.findByEmail(email).orElseThrow(
                    () -> new ResourceNotFoundException("Email não encontrado! " + email)));
        } catch (ResourceNotFoundException e) {
            throw new ResourceNotFoundException("Emmail não encontrado! ");
        }

    }

}