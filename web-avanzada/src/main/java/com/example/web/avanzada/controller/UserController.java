
package com.example.web.avanzada.controller;

import com.example.web.avanzada.model.Producto;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {

    @GetMapping("/pruebas")
    public String pruebas(Model model) {
        model.addAttribute("title", "Título (Web Dinámica)");
        model.addAttribute("nombre", "Pepe");
        model.addAttribute("apellido", "Gomez");
        return "pruebas"; 
    }

    @GetMapping("/contacto")
    public String contacto(Model model) {
        model.addAttribute("mensaje", "hola desde spring mvc");
        model.addAttribute("objeto", new Producto(1, "ordenador", 200));
        return "contacto"; 
    }

    @GetMapping("/productos")
    public String mostrarProductos(Model model) {
        
        List<Producto> listaDeProductos = new ArrayList<>();
        listaDeProductos.add(new Producto(101, "Portátil Gamer", 1450.75));
        listaDeProductos.add(new Producto(102, "Ratón Óptico", 45.99));
        listaDeProductos.add(new Producto(103, "Teclado Mecánico", 112.50));

        model.addAttribute("productos", listaDeProductos);

        return "productos/ver_productos"; 
    }
}
