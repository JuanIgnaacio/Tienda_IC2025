package com.parcial_1.controller;

import com.parcial_1.domain.Libro;
import com.parcial_1.service.LibroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
@RequestMapping("/libros")
public class LibroController {
    @Autowired
    private LibroService libroService;
    
    @GetMapping("/listado")
    public String inicio(Model model){
        var libros = LibroService.getLibros(false);
        model.addSttribute("libros", libros);
        return "listado";
    }

}
