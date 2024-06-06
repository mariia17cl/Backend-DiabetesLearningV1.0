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
import com.dawes.DiabetesLearning.servicios.ServicioRol;

/**
 * Clase de prueba para verificar el funcionamiento de las operaciones CRUD en
 * la entidad RolVO.
 * 
 * <p>
 * Esta clase realiza pruebas de inserción, eliminación, modificación y
 * recuperación de roles.
 * </p>
 * 
 * @author María Clemente Luengo
 * @version 1.0
 */

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
public class TestRol {

	@Autowired
	private ServicioRol sr;

	/**
	 * Método de prueba para verificar la inserción de roles.
	 */
	@Test
	void test01Insertar() {
		RolVO administrador = new RolVO("administrador", new ArrayList<>());
		sr.save(administrador);
		RolVO anonimo = new RolVO("anónimo", new ArrayList<>());
		sr.save(anonimo);
		RolVO registrado = new RolVO("registrado", new ArrayList<>());
		assertNotNull(sr.save(registrado));

	}

	/**
	 * Método de prueba para verificar la eliminación de un rol.
	 */
	@Test
	public void test02eliminar() {
		RolVO rol = sr.findById(2).get();
		sr.delete(rol);
		// vuelvo a buscarlo
		assertTrue(sr.findById(2).isEmpty());
	}

	/**
	 * Método de prueba para verificar la modificación de un rol.
	 */
	@Test
	public void test03modificar() {
		RolVO rol = sr.findById(1).get();
		rol.setNombreRol("Administrador");
		assertEquals("Administrador", sr.save(rol).getNombreRol());
	}

	/**
	 * Método de prueba para verificar la recuperación de todos los roles.
	 */
	@Test
	public void test04findbyall() {
		assertEquals(2, sr.findAll().size());
	}

	/**
	 * Método de prueba para verificar la recuperación de un rol por su nombre.
	 */
	@Test
	public void test05findByNombreRol() {
		assertEquals("registrado", sr.findByNombreRol("registrado").get().getNombreRol());
	}

}
