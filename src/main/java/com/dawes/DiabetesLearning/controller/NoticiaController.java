package com.dawes.DiabetesLearning.controller;

import com.dawes.DiabetesLearning.modelo.NoticiaVO;
import com.dawes.DiabetesLearning.servicios.ServicioNoticia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/noticias")
public class NoticiaController {

    @Autowired
    private ServicioNoticia servicioNoticia;

    // Obtener todas las noticias
    @GetMapping("")
    public List<NoticiaVO> obtenerTodasNoticias() {
        return servicioNoticia.findAll();
    }

    // Obtener noticia por su ID
    @GetMapping("/{id}")
    public NoticiaVO obtenerNoticiaPorId(@PathVariable Integer id) {
        return servicioNoticia.findById(id).orElse(null);
    }

    // Crear una nueva noticia
    @PostMapping("/crear")
    public NoticiaVO crearNoticia(@RequestBody NoticiaVO noticia) {
        return servicioNoticia.save(noticia);
    }

    // Actualizar una noticia existente por su ID
    @PutMapping("/actualizar/{id}")
    public NoticiaVO actualizarNoticia(@PathVariable Integer id, @RequestBody NoticiaVO noticiaDetails) {
        NoticiaVO noticia = servicioNoticia.findById(id).orElse(null);
        if (noticia != null) {
            noticia.setEncabezado(noticiaDetails.getEncabezado());
            noticia.setAsunto(noticiaDetails.getAsunto());
            return servicioNoticia.save(noticia);
        }
        return null;
    }

    // Eliminar una noticia por su ID
    @DeleteMapping("/eliminar/{id}")
    public void eliminarNoticia(@PathVariable Integer id) {
        servicioNoticia.deleteById(id);
    }
}
