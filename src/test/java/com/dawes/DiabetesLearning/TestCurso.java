package com.dawes.DiabetesLearning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dawes.DiabetesLearning.modelo.CursoVO;
import com.dawes.DiabetesLearning.servicios.ServicioCurso;

/**
 * Clase de prueba para verificar el funcionamiento de las operaciones CRUD en
 * la entidad CursoVO.
 * 
 * @author María Clemente Luengo
 * @version 1.0
 */

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
public class TestCurso {

	@Autowired
	private ServicioCurso sc;

	/**
	 * Método de prueba para verificar la inserción de cursos.
	 */

	@Test
	void test01InsertarCursos() {
		CursoVO c1 = new CursoVO("0 - Diabetes: Introducción",
				"Este curso aborda los conceptos básicos de la Diabetes, como enfrentarse a ella, que debes saber y recomendaciones de estilo de vida.",
				"Básico", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
		sc.save(c1);

		CursoVO c2 = new CursoVO("1 - Tipos de Diabetes",
				"Aprende a diferenciarlas, como tratar con cada una de ellas, cuales son sus principales causas. Tips para enfrentarte a ellas.",
				"Básico", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
		sc.save(c2);

		CursoVO c3 = new CursoVO("2 - Entendiendo la Diabetes",
				"Este curso se centrará en las bases de la diabetes, no todo son reglas estrictas hay saber como abordar ciertos casos...",
				"Medio", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
		sc.save(c3);

		CursoVO c4 = new CursoVO("Diabetes Tipo 1",
				"Profundizaremos en la diabetes tipo 1, sus complicaciones por mala gestión, consejos para sobrellevarla, ideas de menús...",
				"Medio", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
		sc.save(c4);

		CursoVO c5 = new CursoVO("4 - Diabetes mal gestionada: Complicaciones",
				"Aprende estrategias para prevenir y controlar las posibles complicaciones asociadas con la diabetes, desde cuidados de los pies hasta la salud ocular.",
				"Alta dificultad", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
		sc.save(c5);

		CursoVO c6 = new CursoVO("5 - Procesos de la insulina y glucosa",
				"Tratamos temas más específicos, aprenderemos sobre cómo funciona la insulina en nuestro cuerpo, de donde sacamos la glucosa...",
				"Alta dificultad", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
		sc.save(c6);

		CursoVO c7 = new CursoVO("6 - Psicología y Diabetes",
				"Tocaremos temas como la estabilidad emocional, como afecta el control continuo tanto a niños como a adultos, y como mejorar para no sentirnos abrumados.",
				"Medio", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
		sc.save(c7);

		CursoVO c8 = new CursoVO("7 - Herramientas para Debut Diabetico",
				"Descubre diversas herramientas y técnicas que pueden ayudarte en tu inicio en la diabetes.", "Básico",
				new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
		sc.save(c8);

		CursoVO c9 = new CursoVO("8 - Nutrición y Carbohidratos",
				"Aprende sobre la nutrición específica para personas con diabetes, cómo contar carbohidratos y planificar comidas saludables.",
				"Medio", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
		sc.save(c9);

		CursoVO c10 = new CursoVO("Tecnología: CGM y Asa Cerrado",
				"Explora la tecnología moderna para el monitoreo continuo de glucosa (CGM) y sistemas de lazo cerrado (Asa Cerrado) para el control avanzado de la diabetes.",
				"Alta dificultad", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
		sc.save(c10);

		assertNotNull(c1);
		assertNotNull(c2);
		assertNotNull(c3);
		assertNotNull(c4);
		assertNotNull(c5);
		assertNotNull(c6);
		assertNotNull(c7);
		assertNotNull(c8);
		assertNotNull(c9);
		assertNotNull(c10);
	}

	/**
	 * Método de prueba para verificar la eliminación de cursos.
	 */
	@Test
	public void test02eliminar() {
		CursoVO c = sc.findById(5).get();
		sc.delete(c);
		assertTrue(sc.findById(5).isEmpty());
	}

	/**
	 * Método de prueba para verificar la modificación de cursos.
	 */
	@Test
	public void test03modificar() {
		CursoVO c = sc.findById(4).get();
		c.setTituloCurso("3 - Diabetes Tipo 1");
		assertEquals("3 - Diabetes Tipo 1", sc.save(c).getTituloCurso());
	}

	/**
	 * Método de prueba para verificar la búsqueda de todos los cursos.
	 */
	@Test
	public void test04findbyall() {
		assertEquals(9, sc.findAll().size());
	}

}
