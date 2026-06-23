package com.example.BibliotecaDigital.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BibliotecaDigital.model.Usuario;
import com.example.BibliotecaDigital.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service = new UsuarioService();

    @GetMapping
    public List<Usuario> listar() {
        return service.listar();
    }

    @PostMapping
    public void crear(@RequestBody Usuario usuario) {
        service.crear(usuario);
    }
}