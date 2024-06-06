package com.dawes.DiabetesLearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dawes.DiabetesLearning.modelo.ComentarioVO;
import com.dawes.DiabetesLearning.servicios.ServicioComentario;

/**
 * Controlador REST para gestionar los comentarios. Proporciona endpoints para
 * crear, actualizar, eliminar y obtener comentarios.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

	@Autowired
	private ServicioComentario servicioComentario;

	/**
	 * Obtener todos los comentarios.
	 * 
	 * @return una lista de todos los comentarios
	 */

	@GetMapping("")
	public List<ComentarioVO> obtenerTodosComentarios() {
		return servicioComentario.findAll();
	}

	/**
	 * Obtener un comentario por su ID.
	 * 
	 * @param id el ID del comentario
	 * @return el comentario correspondiente al ID, o null si no se encuentra
	 */

	@GetMapping("/{id}")
	public ComentarioVO obtenerComentarioPorId(@PathVariable Integer id) {
		return servicioComentario.findById(id).orElse(null);
	}

	/**
	 * Crear un nuevo comentario.
	 * 
	 * @param comentario el comentario a crear
	 * @return el comentario creado
	 */

	@PostMapping("/crear")
	public ComentarioVO crearComentario(@RequestBody ComentarioVO comentario) {
		return servicioComentario.save(comentario);
	}

	/**
	 * Actualizar un comentario existente por su ID.
	 * 
	 * @param id                el ID del comentario a actualizar
	 * @param comentarioDetails los nuevos detalles del comentario
	 * @return el comentario actualizado, o null si no se encuentra
	 */

	@PutMapping("/actualizar/{id}")
	public ComentarioVO actualizarComentario(@PathVariable Integer id, @RequestBody ComentarioVO comentarioDetails) {
		ComentarioVO comentario = servicioComentario.findById(id).orElse(null);
		if (comentario != null) {
			comentario.setContenido(null);
			comentario.setCurso(comentarioDetails.getCurso());
			comentario.setUser(comentarioDetails.getUser());
			return servicioComentario.save(comentario);
		}
		return null;
	}

	/**
	 * Eliminar un comentario por su ID.
	 * 
	 * @param id el ID del comentario a eliminar
	 */

	@DeleteMapping("/eliminar/{id}")
	public void eliminarCurso(@PathVariable Integer id) {
		servicioComentario.deleteById(id);
	}

}
