package com.example.BibliotecaDigital.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.BibliotecaDigital.model.Prestamo;
import com.example.BibliotecaDigital.service.PrestamoService;

@RestController
@RequestMapping("/prestamos")
public class PrestamoController {

    private final PrestamoService service = new PrestamoService();

    @GetMapping
    public List<Prestamo> listar() {
        return service.obtenerPrestamos();
    }

    @PostMapping("/devolver")
    public void devolver(@RequestParam Long libroId) {
        service.devolverLibro(libroId);
    }

    @PostMapping
    public void prestar(@RequestBody Prestamo prestamo) {
        service.prestarLibro(prestamo.getLibroId(), prestamo.getUsuarioId());
    }
}

