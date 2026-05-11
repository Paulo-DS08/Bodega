package com.example.demo.service;

import com.example.demo.dto.LoginDTO;
import com.example.demo.entity.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repo;

    public Usuario guardar(Usuario usuario) {
        return repo.save(usuario);
    }

    public Optional<Usuario> buscarPorId(String id) {
        return repo.findById(id);
    }

    public void eliminar(String id) {
        repo.deleteById(id);
    }

    // 🔥 VALIDAR USUARIO (LOGIN)
    public Optional<Usuario> validarUsuario(LoginDTO dto) {
        return repo.findByLogiUsuaAndPassUsua(dto.getUser(), dto.getPass());
    }
}