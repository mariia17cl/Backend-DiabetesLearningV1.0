package com.dawes.DiabetesLearning.controller;

import com.dawes.DiabetesLearning.modelo.RolVO;
import com.dawes.DiabetesLearning.modelo.UsuarioVO;
import com.dawes.DiabetesLearning.servicios.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controlador REST para gestionar los usuarios. Proporciona endpoints para
 * crear, actualizar, eliminar y obtener usuarios.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private ServicioUsuario servicioUsuario;

	/**
	 * Obtener todos los usuarios.
	 * 
	 * @return una lista de todos los usuarios
	 */
	@GetMapping("")
	public List<UsuarioVO> obtenerTodosUsuarios() {
		return servicioUsuario.findAll();
	}

	/**
	 * Obtener un usuario por su ID.
	 * 
	 * @param id el ID del usuario
	 * @return el usuario correspondiente al ID, o null si no se encuentra
	 */
	@GetMapping("/{id}")
	public UsuarioVO obtenerUsuarioPorId(@PathVariable Integer id) {
		return servicioUsuario.findById(id).orElse(null);
	}

	/**
	 * Crear un nuevo usuario.
	 * 
	 * @param usuario el usuario a crear
	 * @return el usuario creado
	 */
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public UsuarioVO crearUsuario(@RequestBody UsuarioVO usuario) {
		// Crear un objeto RolVO para representar el rol por defecto (ID 3)
		RolVO rolPorDefecto = new RolVO();
		rolPorDefecto.setIdrol(3); // Asignar el ID del rol por defecto
		rolPorDefecto.setNombreRol("Rol por defecto"); // Asignar el nombre del rol por defecto

		// Establecer el rol por defecto en el usuario
		usuario.setRol(rolPorDefecto);

		// Guardar el usuario en la base de datos
		return servicioUsuario.save(usuario);
	}

	/**
	 * Actualizar un usuario existente por su ID.
	 * 
	 * @param id             el ID del usuario a actualizar
	 * @param usuarioDetails los nuevos detalles del usuario
	 * @return el usuario actualizado, o null si no se encuentra
	 */
	@PutMapping("/actualizar/{id}")
	public UsuarioVO actualizarUsuario(@PathVariable Integer id, @RequestBody UsuarioVO usuarioDetails) {
		UsuarioVO usuario = servicioUsuario.findById(id).orElse(null);
		if (usuario != null) {
			usuario.setNombreUser(usuarioDetails.getNombreUser());
			// Aquí puedes agregar el resto de atributos que desees actualizar
			return servicioUsuario.save(usuario);
		}
		return null;
	}

	/**
	 * Eliminar un usuario por su ID.
	 * 
	 * @param id el ID del usuario a eliminar
	 */
	@DeleteMapping("/eliminar/{id}")
	public void eliminarUsuario(@PathVariable Integer id) {
		servicioUsuario.deleteById(id);
	}
}
