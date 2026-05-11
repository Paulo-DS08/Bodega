package com.example.demo.controller;

import com.example.demo.dto.LoginDTO;
import com.example.demo.entity.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    // REGISTRAR USUARIO
    @PostMapping
    public Usuario guardar(@RequestBody Usuario usuario) {
        return service.guardar(usuario);
    }

    // BUSCAR
    @GetMapping("/{id}")
    public Optional<Usuario> buscar(@PathVariable String id) {
        return service.buscarPorId(id);
    }

    // ELIMINAR
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        service.eliminar(id);
    }

    // 🔥 LOGIN
    @PostMapping("/login")
    public Object login(@RequestBody LoginDTO dto) {

        Optional<Usuario> usuario = service.validarUsuario(dto);

        if (usuario.isPresent()) {
            return usuario.get();
        } else {
            return new Object() {
                public final String mensaje = "Usuario o contraseña incorrectos";
            };
        }
    }
}