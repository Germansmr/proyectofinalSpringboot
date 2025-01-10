package com.example.proyectofinal.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.proyectofinal.models.Producto;

public class ProductController {

    private static List<Producto> productos = new ArrayList<>();

    static {
        //Añadimos algunos usuarios iniciales
        productos.add(new Producto(1L, "Mesa circular Razor", 200L, 1L ));
        productos.add(new Producto(2L, "Módulo televisor Sinair", 850L, 2L));
        productos.add(new Producto(3, "Silla metálica Candy", 180L, 3L));
        productos.add(new Producto(4, "Sillón chaiselonge Roma", 1200L, 4L));
    }

    //Nombre que usaremos en el "localhost:8080/ListadoTipoProductos"
    @GetMapping("/ListadoProductos")
    //Creamos el model que hara de base de datos guardando la informacion
    public String listProd(Model model) {
        model.addAttribute("produc", productos);
        
        return "productList"; //Nombre del HTML que llamamos

    }    

}
