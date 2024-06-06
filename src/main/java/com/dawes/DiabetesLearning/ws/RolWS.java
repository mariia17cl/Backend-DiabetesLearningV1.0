package com.dawes.DiabetesLearning.ws;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dawes.DiabetesLearning.modelo.RolVO;
import com.dawes.DiabetesLearning.servicioImpl.ServicioRolImpl;

/**
 * Controlador REST para la entidad RolVO.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */

@RestController
public class RolWS {

	@Autowired
	ServicioRolImpl sr;

	@PostMapping("/add")
	public ResponseEntity<?> insert(@RequestBody RolVO rol) {
		RolVO savedRol;
		Map<String, Object> response = new HashMap<String, Object>();
		try {
			savedRol = sr.save(rol);
			response.put("mensaje", "El rol se ha eliminado.");

		} catch (Exception e) {
			response.put("mensaje", e.getMessage());
			return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<RolVO>(savedRol, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		Map<String, Object> response = new HashMap<String, Object>();
		try {
			response.put("mensaje", "El rol se ha eliminado.");
		} catch (Exception e) {

		}
		return null;
	}

}
