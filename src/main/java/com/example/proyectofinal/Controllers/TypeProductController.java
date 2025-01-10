package com.example.proyectofinal.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.proyectofinal.models.ProductType;

public class TypeProductController {
    
    private static List<ProductType> tipoProductos = new ArrayList<>();


    static {
        //Añadimos algunos usuarios iniciales
        tipoProductos.add(new ProductType(1L, "Mesa", "Diferentes tipos de mesa para el comedor"));
        tipoProductos.add(new ProductType(2L, "Televisor", "Módulos para poner un televisor"));
        tipoProductos.add(new ProductType(3L, "Silla", "Diferentes tipos de sillas y sillones"));
        tipoProductos.add(new ProductType(4L, "Sofá", "Tresillo, sofa modular y chaiselonge"));
    }

    //Nombre que usaremos en el "localhost:8080/ListadoTipoProductos"
    @GetMapping("/ListadoTipoProductos")
    //Creamos el model que hara de base de datos guardando la informacion
    public String list(Model model) {
        model.addAttribute("tipProduc", tipoProductos);
        
        return "productTypeList"; //Nombre del HTML que llamamos

    }   

}
