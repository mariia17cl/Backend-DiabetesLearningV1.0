package com.dawes.DiabetesLearning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dawes.DiabetesLearning.modelo.CursoVO;
import com.dawes.DiabetesLearning.modelo.InscripcionVO;
import com.dawes.DiabetesLearning.modelo.UsuarioVO;
import com.dawes.DiabetesLearning.servicios.ServicioCurso;
import com.dawes.DiabetesLearning.servicios.ServicioInscripcion;
import com.dawes.DiabetesLearning.servicios.ServicioUsuario;

/**
 * Clase de prueba para verificar el funcionamiento de las operaciones CRUD en
 * la entidad InscripcionVO.
 * 
 * @author María Clemente Luengo
 * @version 1.0
 */
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
public class TestInscripcion {

	@Autowired
	private ServicioUsuario su;

	@Autowired
	private ServicioInscripcion si;

	@Autowired
	private ServicioCurso sc;

	/**
	 * Método de prueba para verificar la inserción de inscripciones.
	 */
	@Test
	void test01Insertar() {
		CursoVO curso1 = sc.findById(1).get();
		CursoVO curso2 = sc.findById(2).get();
		CursoVO curso3 = sc.findById(3).get();

		UsuarioVO usuario2 = su.findById(2).get();
		UsuarioVO usuario4 = su.findById(4).get();
		UsuarioVO usuario5 = su.findById(5).get();

		InscripcionVO i1 = new InscripcionVO(LocalDate.of(2023, 12, 5), usuario2, curso1, false);
		si.save(i1);
		InscripcionVO i2 = new InscripcionVO(LocalDate.of(2023, 11, 28), usuario4, curso3, false);
		si.save(i2);
		InscripcionVO i3 = new InscripcionVO(LocalDate.of(2023, 10, 29), usuario5, curso2, false);
		assertNotNull(si.save(i3));
	}

	/**
	 * Método de prueba para verificar la eliminación de inscripciones.
	 */
	@Test
	public void test02eliminar() {
		InscripcionVO i = si.findById(3).get();
		si.delete(i);
		assertTrue(si.findById(3).isEmpty());
	}

	/**
	 * Método de prueba para verificar la modificación de inscripciones.
	 */
	@Test
	public void test03modificar() {
		InscripcionVO i = si.findById(2).get();
		i.setFechaInscripcion(LocalDate.of(2023, 11, 29));
		assertEquals(LocalDate.of(2023, 11, 29), si.save(i).getFechaInscripcion());
	}

	/**
	 * Método de prueba para verificar la búsqueda de todas las inscripciones.
	 */
	@Test
	public void test04findbyall() {
		assertEquals(2, si.findAll().size());
	}
}
