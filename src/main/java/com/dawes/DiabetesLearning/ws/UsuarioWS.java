package com.dawes.DiabetesLearning.ws;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dawes.DiabetesLearning.modelo.UsuarioVO;
import com.dawes.DiabetesLearning.servicioImpl.ServicioUsuarioImpl;

/**
 * Controlador REST para la entidad UsuarioVO.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */

@RestController
@RequestMapping("/usuarios")
public class UsuarioWS {
	@Autowired
	ServicioUsuarioImpl su;

	@PostMapping("/insertar")
	public ResponseEntity<?> insert(@RequestBody UsuarioVO user) {
		UsuarioVO savedUser;
		Map<String, Object> response = new HashMap<String, Object>();
		try {
			savedUser = su.save(user);
		} catch (Exception e) {
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<UsuarioVO>(savedUser, HttpStatus.OK);
	}

	@GetMapping("/buscar")
	public ResponseEntity<?> findAll() {
		Map<String, Object> response = new HashMap<String, Object>();
		try {
			List<UsuarioVO> usuarios = su.findAll();
			return new ResponseEntity<List<UsuarioVO>>(usuarios, HttpStatus.OK);
		} catch (Exception e) {
			response.put("message", "error al buscar los usuarios");
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// eliminar
	// modificar

	// Eliminar usuario por ID

}
