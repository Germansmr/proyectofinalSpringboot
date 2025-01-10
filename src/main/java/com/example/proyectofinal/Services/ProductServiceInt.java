package com.example.proyectofinal.Services;

import java.util.List;

import com.example.proyectofinal.models.Producto;

public interface ProductServiceInt {

    List<Producto> findAll();

    Producto findById(Long id);

    void create(Long id, String name, Long price, Long productTypeId);

    void create(Long id, String name, Long price, Long productTypeId);

}