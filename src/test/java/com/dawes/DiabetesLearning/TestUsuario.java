package com.dawes.DiabetesLearning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dawes.DiabetesLearning.modelo.RolVO;
import com.dawes.DiabetesLearning.modelo.UsuarioVO;
import com.dawes.DiabetesLearning.servicios.ServicioRol;
import com.dawes.DiabetesLearning.servicios.ServicioUsuario;

/**
 * Clase de prueba para verificar el funcionamiento de las operaciones CRUD en
 * la entidad UsuarioVO.
 * 
 * <p>
 * Esta clase realiza pruebas de inserción, eliminación, modificación y
 * recuperación de usuarios.
 * </p>
 * 
 * @author María Clemente Luengo
 * @version 1.0
 */

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest

public class TestUsuario {

	@Autowired
	private ServicioUsuario su;

	@Autowired
	private ServicioRol sr;

	/**
	 * Método de prueba para verificar la inserción de usuarios.
	 */
	@Test
	void test01Insertar() {
		RolVO administrador = sr.findByNombreRol("Administrador").get();
		RolVO registrado = sr.findByNombreRol("registrado").get();
		// creo usuarios dentro del metodo
		UsuarioVO usu1 = new UsuarioVO("María", "5845981Y", "mariacl26@educastur.es", "1234", administrador,
				new ArrayList<>(), new ArrayList<>());
		su.save(usu1);
		UsuarioVO usu2 = new UsuarioVO("Alejandro Vega", "5896237Y", "alexvg05@gmail.com", "alex05", registrado,
				new ArrayList<>(), new ArrayList<>());
		su.save(usu2);
		UsuarioVO usu3 = new UsuarioVO("Raquel Cabezas", "5834489J", "raquelccb59@gmail.es", "raquel2", registrado,
				new ArrayList<>(), new ArrayList<>());
		su.save(usu3);

		UsuarioVO usu4 = new UsuarioVO("Victor Fernández", "5834689J", "vict009@gmail.com", "vity", registrado,
				new ArrayList<>(), new ArrayList<>());
		su.save(usu4);
		UsuarioVO usu5 = new UsuarioVO("Juan Solar", "1045987K", "js76@gmail.com", "jj88", registrado,
				new ArrayList<>(), new ArrayList<>());
		assertNotNull(su.save(usu5));

	}

	/**
	 * Método de prueba para verificar la eliminación de un usuario.
	 */
	@Test
	public void test02eliminar() {
		UsuarioVO user = su.findById(3).get();
		su.delete(user);
		// vuelvo a buscarlo
		assertTrue(su.findById(3).isEmpty());
	}

	/**
	 * Método de prueba para verificar la modificación de un usuario.
	 */
	@Test
	public void test03modificar() {
		UsuarioVO user = su.findById(1).get();
		user.setNombreUser("María Clemente Luengo");
		// save sirve para insertar y modificar
		assertEquals("María Clemente Luengo", su.save(user).getNombreUser());
	}

	/**
	 * Método de prueba para verificar la recuperación de todos los usuarios.
	 */
	@Test
	public void test04findbyall() {
		assertEquals(4, su.findAll().size());
	}

}
