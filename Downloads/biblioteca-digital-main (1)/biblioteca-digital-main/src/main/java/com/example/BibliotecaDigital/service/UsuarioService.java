package com.example.BibliotecaDigital.service;

import java.util.List;

import com.example.BibliotecaDigital.model.Usuario;
import com.example.BibliotecaDigital.repository.UsuarioRepository;

public class UsuarioService {

    private final UsuarioRepository repo = new UsuarioRepository();

    public List<Usuario> listar() {
        return repo.findAll();
    }

    public void crear(Usuario usuario) {
        repo.save(usuario);
    }

    public Usuario buscar(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
    }
}
