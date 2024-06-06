package com.dawes.DiabetesLearning.controller;

import com.dawes.DiabetesLearning.modelo.RolVO;
import com.dawes.DiabetesLearning.servicios.ServicioRol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para gestionar los roles. Proporciona endpoints para crear,
 * actualizar, eliminar y obtener roles.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */
@RestController
@RequestMapping("/roles")
public class RolController {

	@Autowired
	private ServicioRol servicioRol;

	/**
	 * Obtener todos los roles.
	 * 
	 * @return una lista de todos los roles
	 */
	@GetMapping("")
	public List<RolVO> obtenerTodosRoles() {
		return servicioRol.findAll();
	}

	/**
	 * Obtener un rol por su ID.
	 * 
	 * @param id el ID del rol
	 * @return el rol correspondiente al ID, o null si no se encuentra
	 */
	@GetMapping("/{id}")
	public RolVO obtenerRolPorId(@PathVariable Integer id) {
		return servicioRol.findById(id).orElse(null);
	}

	/**
	 * Crear un nuevo rol.
	 * 
	 * @param rol el rol a crear
	 * @return el rol creado
	 */
	@PostMapping("/crear")
	public RolVO crearRol(@RequestBody RolVO rol) {
		return servicioRol.save(rol);
	}

	/**
	 * Actualizar un rol existente por su ID.
	 * 
	 * @param id         el ID del rol a actualizar
	 * @param rolDetails los nuevos detalles del rol
	 * @return el rol actualizado, o null si no se encuentra
	 */
	@PutMapping("/actualizar/{id}")
	public RolVO actualizarRol(@PathVariable Integer id, @RequestBody RolVO rolDetails) {
		RolVO rol = servicioRol.findById(id).orElse(null);
		if (rol != null) {
			rol.setNombreRol(rolDetails.getNombreRol());
			return servicioRol.save(rol);
		}
		return null;
	}

	/**
	 * Eliminar un rol por su ID.
	 * 
	 * @param id el ID del rol a eliminar
	 */
	@DeleteMapping("/eliminar/{id}")
	public void eliminarRol(@PathVariable Integer id) {
		servicioRol.deleteById(id);
	}
}
