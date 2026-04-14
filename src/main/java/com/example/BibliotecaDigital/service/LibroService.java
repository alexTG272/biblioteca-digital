package com.example.BibliotecaDigital.service;

import java.util.List;

import com.example.BibliotecaDigital.model.Libro;
import com.example.BibliotecaDigital.repository.LibroRepository;

public class LibroService {

    private final LibroRepository repository = new LibroRepository();

    public List<Libro> obtenerLibros() {
        return repository.findAll();
    }

    public void agregarLibro(Libro libro) {
        libro.setDisponible(true);
        repository.save(libro);
    }
}
