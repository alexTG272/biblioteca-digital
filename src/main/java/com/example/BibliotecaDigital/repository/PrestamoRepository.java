package com.example.BibliotecaDigital.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.BibliotecaDigital.model.Prestamo;

public class PrestamoRepository {

    private List<Prestamo> prestamos = new ArrayList<>();

    public List<Prestamo> findAll() {
        return prestamos;
    }

    public void save(Prestamo prestamo) {
        prestamos.add(prestamo);
    }
}