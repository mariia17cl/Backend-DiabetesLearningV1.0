package com.dawes.DiabetesLearning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dawes.DiabetesLearning.modelo.NoticiaVO;
import com.dawes.DiabetesLearning.servicios.ServicioNoticia;

/**
 * Clase de prueba para verificar el funcionamiento de las operaciones CRUD en
 * la entidad NoticiaVO.
 * 
 * <p>
 * Esta clase realiza pruebas de inserción, eliminación, modificación y
 * recuperación de noticias.
 * </p>
 * 
 * @author María Clemente Luengo
 * @version 1.0
 */

@TestMethodOrder(MethodOrderer.MethodName.class)

@SpringBootTest
public class TestNoticia {

	@Autowired
	private ServicioNoticia sn;

	/**
	 * Método de prueba para verificar la inserción de noticias.
	 */
	@Test
	void test01Insertar() {
		NoticiaVO n1 = new NoticiaVO("Enfoque 'antidieta': cuando la alimentación intuitiva está contraindicada.",
				"Asunto de la noticia 1", "https://ejemplo.com/multimedia1");
		sn.save(n1);

		NoticiaVO n2 = new NoticiaVO(
				"Una terapia aparcada durante un siglo se convierte en alternativa para la obesidad o la diabetes.",
				"Asunto de la noticia 2", "https://ejemplo.com/multimedia2");
		sn.save(n2);

		NoticiaVO n3 = new NoticiaVO(
				"Un estudio constata que mejorar el estilo de vida puede frenar el desarrollo de diabetes.",
				"El número de personas con diabetes en España se ha incrementado en un 42% desde el 2019,según advierte la Sociedad...",
				"https://ejemplo.com/multimedia3");
		assertNotNull(sn.save(n3));

	}

	/**
	 * Método de prueba para verificar la eliminación de una noticia.
	 */
	@Test
	public void test02eliminar() {
		NoticiaVO n = sn.findById(2).get();
		sn.delete(n);
		assertTrue(sn.findById(2).isEmpty());
	}

	
	/**
	 * Método de prueba para verificar la modificación de una noticia.
	 */
	@Test
	public void test03modificar() {
		NoticiaVO n = sn.findById(1).get();
		n.setAsunto("Este tipo de planteamiento nutricional tiene sentido solo cuando no existen trastornos...");
		assertEquals("Este tipo de planteamiento nutricional tiene sentido solo cuando no existen trastornos...",
				sn.save(n).getAsunto());
	}

	/**
	 * Método de prueba para verificar la recuperación de todas las noticias.
	 */
	@Test
	public void test04findbyall() {
		assertEquals(2, sn.findAll().size());
	}

}
