package com.dawes.DiabetesLearning.controller;

import com.dawes.DiabetesLearning.modelo.InscripcionVO;
import com.dawes.DiabetesLearning.servicios.ServicioInscripcion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para gestionar las inscripciones. Proporciona endpoints para
 * crear, actualizar, eliminar y obtener inscripciones.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */
@RestController
@RequestMapping("/inscripciones")
public class InscripcionController {

	@Autowired
	private ServicioInscripcion servicioInscripcion;

	/**
	 * Obtener todas las inscripciones.
	 * 
	 * @return una lista de todas las inscripciones
	 */
	@GetMapping("")
	public List<InscripcionVO> obtenerTodasInscripciones() {
		return servicioInscripcion.findAll();
	}

	/**
	 * Obtener una inscripción por su ID.
	 * 
	 * @param id el ID de la inscripción
	 * @return la inscripción correspondiente al ID, o null si no se encuentra
	 */
	@GetMapping("/{id}")
	public InscripcionVO obtenerInscripcionPorId(@PathVariable Integer id) {
		return servicioInscripcion.findById(id).orElse(null);
	}

	/**
	 * Crear una nueva inscripción.
	 * 
	 * @param inscripcion la inscripción a crear
	 * @return la inscripción creada
	 */
	@PostMapping("/crear")
	public InscripcionVO crearInscripcion(@RequestBody InscripcionVO inscripcion) {
		return servicioInscripcion.save(inscripcion);
	}

	/**
	 * Actualizar una inscripción existente por su ID.
	 * 
	 * @param id                 el ID de la inscripción a actualizar
	 * @param inscripcionDetails los nuevos detalles de la inscripción
	 * @return la inscripción actualizada, o null si no se encuentra
	 */
	@PutMapping("/actualizar/{id}")
	public InscripcionVO actualizarInscripcion(@PathVariable Integer id,
			@RequestBody InscripcionVO inscripcionDetails) {
		InscripcionVO inscripcion = servicioInscripcion.findById(id).orElse(null);
		if (inscripcion != null) {
			inscripcion.setFechaInscripcion(inscripcionDetails.getFechaInscripcion());
			inscripcion.setUser(inscripcionDetails.getUser());
			inscripcion.setCurso(inscripcionDetails.getCurso());
			return servicioInscripcion.save(inscripcion);
		}
		return null;
	}

	/**
	 * Eliminar una inscripción por su ID.
	 * 
	 * @param id el ID de la inscripción a eliminar
	 */
	@DeleteMapping("/eliminar/{id}")
	public void eliminarInscripcion(@PathVariable Integer id) {
		servicioInscripcion.deleteById(id);
	}
}
