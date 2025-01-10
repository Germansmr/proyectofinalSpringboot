package com.example.proyectofinal.Controllers;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.proyectofinal.models.ProductType;
import com.example.proyectofinal.models.Producto;



@Controller
public class UserController {
    
    //Lista de usuarios persistente (asi podemos añadir usuarios desde otros metodos)
    private static List<Producto> productos = new ArrayList<>();
    private static List<ProductType> tipoProductos = new ArrayList<>();


    static {
        //Añadimos algunos usuarios iniciales
        tipoProductos.add(new ProductType(1L, "Mesa", "Diferentes tipos de mesa para el comedor"));
        tipoProductos.add(new ProductType(2L, "Televisor", "Módulos para poner un televisor"));
        tipoProductos.add(new ProductType(3L, "Silla", "Diferentes tipos de sillas y sillones"));
        tipoProductos.add(new ProductType(4L, "Sofá", "Tresillo, sofa modular y chaiselonge"));
    }

    static {
        //Añadimos algunos usuarios iniciales
        productos.add(new Producto(1L, "Mesa circular Razor", 200L, 1L ));
        productos.add(new Producto(2L, "Módulo televisor Sinair", 850L, 2L));
        productos.add(new Producto(3, "Silla metálica Candy", 180L, 3L));
        productos.add(new Producto(4, "Sillón chaiselonge Roma", 1200L, 4L));
    }

    
    //Nombre que usaremos en el "localhost:8080/ListadoTipoProductos"
    @GetMapping("/ListadoTipoProductos")
    //Creamos el model que hara de base de datos guardando la informacion
    public String list(Model model) {
        model.addAttribute("tipProduc", tipoProductos);
        
        return "productTypeList"; //Nombre del HTML que llamamos

    }    
    //Nombre que usaremos en el "localhost:8080/ListadoTipoProductos"
    @GetMapping("/ListadoProductos")
    //Creamos el model que hara de base de datos guardando la informacion
    public String listProd(Model model) {
        model.addAttribute("produc", productos);
        
        return "productList"; //Nombre del HTML que llamamos

    }    

}

    /*@PostMapping("/createUser")
    public String crearUsuario(
        ModelMap model,
        @RequestParam String name,
        @RequestParam String lastName,
        @RequestParam String email) {
        
        if (name == null || name.isEmpty() || lastName == null || lastName.isEmpty() || email == null || email.isEmpty()) {
            model.put("texto", "Por favor complete todos los campos requeridos.");
            return "userCreated";
        }

        User user = new User(null, null, null);
        user.setName(name);
        user.setLastname(lastName);
        user.setEmail(email);
        

        model.put("texto", "El usuario se ha creado correctamente.");
        model.put("user", user);

        
        return "userCreated";
    }
    */
    //Ejercicio FORMULARIO
    /*
    //Coge los datos del usuario y crea un user a null
    @GetMapping("/anyadir")
        public String greetingForm(Model model) {
        model.addAttribute("user", new User(null,null,null));
        //Returna anyadir html
        return "anyadir";
    }
    */
    /*
    //Manda los datos a la pagina de resultados
    @PostMapping("/resultado")
    public String greetingSubmit(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        //Añadimos el nuevo resultado al array de users
        users.add(user);
        return "resultado";
    }*/   

