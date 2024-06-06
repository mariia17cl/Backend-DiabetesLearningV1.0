package com.dawes.DiabetesLearning.controller;

import com.dawes.DiabetesLearning.modelo.CursoVO;
import com.dawes.DiabetesLearning.servicios.ServicioCurso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para gestionar los cursos. Proporciona endpoints para crear,
 * actualizar, eliminar y obtener cursos.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */
@RestController
@RequestMapping("/cursos")
public class CursoController {

	@Autowired
	private ServicioCurso servicioCurso;

	/**
	 * Obtener todos los cursos.
	 * 
	 * @return una lista de todos los cursos
	 */
	@GetMapping("")
	public List<CursoVO> obtenerTodosCursos() {
		return servicioCurso.findAll();
	}

	/**
	 * Obtener un curso por su ID.
	 * 
	 * @param id el ID del curso
	 * @return el curso correspondiente al ID, o null si no se encuentra
	 */
	@GetMapping("/{id}")
	public CursoVO obtenerCursoPorId(@PathVariable Integer id) {
		return servicioCurso.findById(id).orElse(null);
	}

	/**
	 * Crear un nuevo curso.
	 * 
	 * @param curso el curso a crear
	 * @return el curso creado
	 */
	@PostMapping("/crear")
	public CursoVO crearCurso(@RequestBody CursoVO curso) {
		return servicioCurso.save(curso);
	}

	/**
	 * Actualizar un curso existente por su ID.
	 * 
	 * @param id           el ID del curso a actualizar
	 * @param cursoDetails los nuevos detalles del curso
	 * @return el curso actualizado, o null si no se encuentra
	 */
	@PutMapping("/actualizar/{id}")
	public CursoVO actualizarCurso(@PathVariable Integer id, @RequestBody CursoVO cursoDetails) {
		CursoVO curso = servicioCurso.findById(id).orElse(null);
		if (curso != null) {
			curso.setTituloCurso(cursoDetails.getTituloCurso());
			curso.setDescripcion(cursoDetails.getDescripcion());
			curso.setNivel(cursoDetails.getNivel());
			return servicioCurso.save(curso);
		}
		return null;
	}

	/**
	 * Eliminar un curso por su ID.
	 * 
	 * @param id el ID del curso a eliminar
	 */
	@DeleteMapping("/eliminar/{id}")
	public void eliminarCurso(@PathVariable Integer id) {
		servicioCurso.deleteById(id);
	}

	/**
	 * Buscar un curso por su ID.
	 * 
	 * @param id el ID del curso
	 * @return el curso correspondiente al ID, o null si no se encuentra
	 */
	@GetMapping("/buscar/{id}")
	public CursoVO buscarCursoPorId(@PathVariable Integer id) {
		return servicioCurso.findById(id).orElse(null);
	}
}
