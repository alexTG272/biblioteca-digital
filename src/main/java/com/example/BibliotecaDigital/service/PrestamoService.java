package com.example.BibliotecaDigital.service;

import java.time.LocalDate;
import java.util.List;

import com.example.BibliotecaDigital.model.Libro;
import com.example.BibliotecaDigital.model.Prestamo;
import com.example.BibliotecaDigital.repository.LibroRepository;
import com.example.BibliotecaDigital.repository.PrestamoRepository;
import com.example.BibliotecaDigital.repository.UsuarioRepository;

public class PrestamoService {

    private final PrestamoRepository prestamoRepo = new PrestamoRepository();
    private final LibroRepository libroRepo = new LibroRepository();
    private final UsuarioRepository usuarioRepo = new UsuarioRepository();

    public List<Prestamo> obtenerPrestamos() {
        return prestamoRepo.findAll();
    }

    public void prestarLibro(Long libroId, Long usuarioId) {

        Libro libro = libroRepo.findById(libroId)
                .orElseThrow(() -> new RuntimeException("Libro no encontrado"));

        if (!libro.isDisponible()) {
            throw new RuntimeException("Libro no disponible");
        }

        usuarioRepo.findById(usuarioId).orElseThrow(() -> new RuntimeException("Usuario no existe"));

        libro.setDisponible(false);

        Prestamo p = new Prestamo();
        p.setId(System.currentTimeMillis());
        p.setLibroId(libroId);
        p.setUsuarioId(usuarioId);
        p.setFechaPrestamo(LocalDate.now());

        prestamoRepo.save(p);
    }

    public void devolverLibro(Long libroId) {

        Libro libro = libroRepo.findById(libroId)
                .orElseThrow(() -> new RuntimeException("Libro no encontrado"));

        libro.setDisponible(true);

        for (Prestamo p : prestamoRepo.findAll()) {
            if (p.getLibroId().equals(libroId) && p.getFechaDevolucion() == null) {
                p.setFechaDevolucion(LocalDate.now());
            }
        }
    }
}
