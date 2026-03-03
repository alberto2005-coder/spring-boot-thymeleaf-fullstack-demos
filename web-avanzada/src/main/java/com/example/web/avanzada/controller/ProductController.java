package com.example.web.avanzada.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api") 
public class ProductController {

    @GetMapping("users")
    public Map<String, Object> pruebas() {
        Map<String, Object> body = new HashMap<>();
        body.put("title", "titulo hola mundo API");
        body.put("nombre", "nombre JSON");
        body.put("apellidos", "apellidos JSON");
        return body;
    }

    @PostMapping("create")
    public String postMethodName(@RequestBody String entity) {
        try {
            File.createTempFile("testfile", ".tmp");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return entity.replace("Gomez", "Gómez");
    }
}