package com.example.BibliotecaDigital.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BibliotecaDigital.model.Libro;
import com.example.BibliotecaDigital.service.LibroService;

@RestController
@RequestMapping("/libros")
public class LibroController {

    private final LibroService service = new LibroService();

    @GetMapping
    public List<Libro> listar() {
        return service.obtenerLibros();
    }

    @PostMapping
    public void agregar(@RequestBody Libro libro) {
        service.agregarLibro(libro);
    }
}
