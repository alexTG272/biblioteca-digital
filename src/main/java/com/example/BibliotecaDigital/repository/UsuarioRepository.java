package com.example.BibliotecaDigital.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.BibliotecaDigital.model.Usuario;

public class UsuarioRepository {

    private static List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> findAll() {
        return usuarios;
    }

    public void save(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Optional<Usuario> findById(Long id) {
        return usuarios.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();
    }
}