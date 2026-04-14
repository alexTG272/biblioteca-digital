package com.example.BibliotecaDigital.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.BibliotecaDigital.model.Libro;

public class LibroRepository {

    private static List<Libro> libros = new ArrayList<>();

    public List<Libro> findAll() {
        return libros;
    }

    public void save(Libro libro) {
        libros.add(libro);
    }

    public Optional<Libro> findById(Long id) {
        return libros.stream()
                .filter(l -> l.getId().equals(id))
                .findFirst();
    }
}