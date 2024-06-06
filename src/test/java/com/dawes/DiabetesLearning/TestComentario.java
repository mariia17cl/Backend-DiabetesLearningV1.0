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

import com.dawes.DiabetesLearning.modelo.ComentarioVO;
import com.dawes.DiabetesLearning.modelo.CursoVO;
import com.dawes.DiabetesLearning.modelo.UsuarioVO;
import com.dawes.DiabetesLearning.servicios.ServicioComentario;
import com.dawes.DiabetesLearning.servicios.ServicioCurso;
import com.dawes.DiabetesLearning.servicios.ServicioUsuario;

/**
 * Clase de prueba para verificar el funcionamiento de las operaciones CRUD en
 * la entidad ComentarioVO.
 * 
 * @author María Clemente Luengo
 * @version 1.0
 */

@TestMethodOrder(MethodOrderer.MethodName.class)

@SpringBootTest
public class TestComentario {

	@Autowired
	private ServicioUsuario su;

	@Autowired
	private ServicioComentario scom;

	@Autowired
	private ServicioCurso sc;

	/**
	 * Método de prueba para verificar la inserción de comentarios.
	 */
	@Test
	void test01Insertar() {
		CursoVO curso1 = sc.findById(1).get();
		CursoVO curso2 = sc.findById(2).get();
		CursoVO curso3 = sc.findById(3).get();

		UsuarioVO usuario2 = su.findById(2).get();
		UsuarioVO usuario4 = su.findById(4).get();
		UsuarioVO usuario5 = su.findById(5).get();

		ComentarioVO c1 = new ComentarioVO("Recomiendo este curso, sencillo pero muy importante", LocalDate.now(),
				curso1, usuario2);
		scom.save(c1);
		ComentarioVO c2 = new ComentarioVO(
				"Curso muy interesante sobre la nutrición, deberían seguirlo incluso personas no diabéticas.",
				LocalDate.of(2023, 12, 15), curso3, usuario4);
		scom.save(c2);
		ComentarioVO c3 = new ComentarioVO(
				"Esto es una pérdida de tiempo, las personas diabeticas lo son por comer basura.",
				LocalDate.of(2023, 11, 19), curso2, usuario5);
		assertNotNull(scom.save(c3));
	}

	/**
	 * Método de prueba para verificar la eliminación de comentarios.
	 */
	@Test
	public void test02eliminar() {
		ComentarioVO c = scom.findById(3).get();
		scom.delete(c);
		assertTrue(scom.findById(3).isEmpty());
	}

	/**
	 * Método de prueba para verificar la modificación de comentarios.
	 */
	@Test
	public void test03modificar() {
		ComentarioVO c = scom.findById(2).get();
		c.setFechaPublicacion(LocalDate.of(2023, 12, 10));
		assertEquals(LocalDate.of(2023, 12, 10), scom.save(c).getFechaPublicacion());
	}

	/**
	 * Método de prueba para verificar la búsqueda de todos los comentarios.
	 */
	@Test
	public void test04findbyall() {
		assertEquals(2, scom.findAll().size());
	}

}
