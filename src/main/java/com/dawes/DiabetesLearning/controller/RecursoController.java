package com.dawes.DiabetesLearning.controller;

import com.dawes.DiabetesLearning.modelo.RecursoVO;
import com.dawes.DiabetesLearning.servicios.ServicioRecurso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para gestionar los recursos. Proporciona endpoints para
 * crear, actualizar, eliminar y obtener recursos.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */
@RestController
@RequestMapping("/recursos")
public class RecursoController {

	@Autowired
	private ServicioRecurso servicioRecurso;

	/**
	 * Obtener todos los recursos.
	 * 
	 * @return una lista de todos los recursos
	 */
	@GetMapping("")
	public List<RecursoVO> obtenerTodosRecursos() {
		return servicioRecurso.findAll();
	}

	/**
	 * Obtener un recurso por su ID.
	 * 
	 * @param id el ID del recurso
	 * @return el recurso correspondiente al ID, o null si no se encuentra
	 */
	@GetMapping("/{id}")
	public RecursoVO obtenerRecursoPorId(@PathVariable Integer id) {
		return servicioRecurso.findById(id).orElse(null);
	}

	/**
	 * Crear un nuevo recurso.
	 * 
	 * @param recurso el recurso a crear
	 * @return el recurso creado
	 */
	@PostMapping("/crear")
	public RecursoVO crearRecurso(@RequestBody RecursoVO recurso) {
		return servicioRecurso.save(recurso);
	}

	/**
	 * Actualizar un recurso existente por su ID.
	 * 
	 * @param id             el ID del recurso a actualizar
	 * @param recursoDetails los nuevos detalles del recurso
	 * @return el recurso actualizado, o null si no se encuentra
	 */
	@PutMapping("/actualizar/{id}")
	public RecursoVO actualizarRecurso(@PathVariable Integer id, @RequestBody RecursoVO recursoDetails) {
		RecursoVO recurso = servicioRecurso.findById(id).orElse(null);
		if (recurso != null) {
			recurso.setNombreRecurso(recursoDetails.getNombreRecurso());
			recurso.setUrl(recursoDetails.getUrl());
			// Aquí puedes agregar el resto de atributos que desees actualizar
			return servicioRecurso.save(recurso);
		}
		return null;
	}

	/**
	 * Eliminar un recurso por su ID.
	 * 
	 * @param id el ID del recurso a eliminar
	 */
	@DeleteMapping("/eliminar/{id}")
	public void eliminarRecurso(@PathVariable Integer id) {
		servicioRecurso.deleteById(id);
	}
}
