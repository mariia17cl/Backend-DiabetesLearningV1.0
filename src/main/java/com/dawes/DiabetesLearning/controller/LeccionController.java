package com.dawes.DiabetesLearning.controller;

import com.dawes.DiabetesLearning.modelo.LeccionVO;
import com.dawes.DiabetesLearning.servicios.ServicioLeccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para gestionar las lecciones. Proporciona endpoints para
 * crear, actualizar, eliminar y obtener lecciones.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */
@RestController
@RequestMapping("/lecciones")
public class LeccionController {

	@Autowired
	private ServicioLeccion servicioLeccion;

	/**
	 * Obtener todas las lecciones.
	 * 
	 * @return una lista de todas las lecciones
	 */
	@GetMapping("")
	public List<LeccionVO> obtenerTodasLecciones() {
		return servicioLeccion.findAll();
	}

	/**
	 * Obtener una lección por su ID.
	 * 
	 * @param id el ID de la lección
	 * @return la lección correspondiente al ID, o null si no se encuentra
	 */
	@GetMapping("/{id}")
	public LeccionVO obtenerLeccionPorId(@PathVariable Integer id) {
		return servicioLeccion.findById(id).orElse(null);
	}

	/**
	 * Crear una nueva lección.
	 * 
	 * @param leccion la lección a crear
	 * @return la lección creada
	 */
	@PostMapping("/crear")
	public LeccionVO crearLeccion(@RequestBody LeccionVO leccion) {
		return servicioLeccion.save(leccion);
	}

	/**
	 * Actualizar una lección existente por su ID.
	 * 
	 * @param id             el ID de la lección a actualizar
	 * @param leccionDetails los nuevos detalles de la lección
	 * @return la lección actualizada, o null si no se encuentra
	 */
	@PutMapping("/actualizar/{id}")
	public LeccionVO actualizarLeccion(@PathVariable Integer id, @RequestBody LeccionVO leccionDetails) {
		LeccionVO leccion = servicioLeccion.findById(id).orElse(null);
		if (leccion != null) {
			leccion.setTituloLeccion(leccionDetails.getTituloLeccion());
			leccion.setContenido(leccionDetails.getContenido());
			leccion.setOrden(leccionDetails.getOrden());
			return servicioLeccion.save(leccion);
		}
		return null;
	}

	/**
	 * Eliminar una lección por su ID.
	 * 
	 * @param id el ID de la lección a eliminar
	 */
	@DeleteMapping("/eliminar/{id}")
	public void eliminarLeccion(@PathVariable Integer id) {
		servicioLeccion.deleteById(id);
	}

}
