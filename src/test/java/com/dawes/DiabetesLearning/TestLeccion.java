package com.dawes.DiabetesLearning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dawes.DiabetesLearning.modelo.CursoVO;
import com.dawes.DiabetesLearning.modelo.LeccionVO;
import com.dawes.DiabetesLearning.servicios.ServicioCurso;
import com.dawes.DiabetesLearning.servicios.ServicioLeccion;

/**
 * Clase de prueba para verificar el funcionamiento de las operaciones CRUD en
 * la entidad LeccionVO.
 * 
 * @author María Clemente Luengo
 * @version 1.0
 */

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
public class TestLeccion {

	@Autowired
	private ServicioLeccion sl;

	@Autowired
	private ServicioCurso sc;

	/**
	 * Método de prueba para verificar la inserción de lecciones.
	 */
	@Test
	void test01Insertar() {
		// Curso 0
		CursoVO curso0 = sc.findById(1).orElseThrow();
		insertarLeccion(curso0, "Lección 1: ¿Qué es la Diabetes?",
				"La diabetes es una enfermedad crónica que se caracteriza por niveles elevados de glucosa en sangre, debido a la incapacidad del cuerpo para producir o utilizar adecuadamente la insulina. Existen varios tipos de diabetes, siendo los más comunes el tipo 1, el tipo 2 y la diabetes gestacional. En esta lección, exploraremos los síntomas, causas y factores de riesgo asociados con la diabetes, así como las diferencias entre los diferentes tipos. También discutiremos las complicaciones a largo plazo de la diabetes no controlada y las estrategias de manejo para vivir bien con esta enfermedad.");
		insertarLeccion(curso0, "Lección 2: Síntomas y Diagnóstico",
				"Los síntomas de la diabetes pueden variar según el tipo y la gravedad de la enfermedad, pero algunos de los más comunes incluyen aumento de la sed, micción frecuente, fatiga, visión borrosa y heridas que tardan en sanar. El diagnóstico de la diabetes generalmente se realiza mediante pruebas de glucosa en sangre en ayunas y pruebas de tolerancia a la glucosa. En esta lección, profundizaremos en los síntomas característicos de la diabetes, cómo se realiza el diagnóstico y la importancia de la detección temprana para prevenir complicaciones graves.");
		insertarLeccion(curso0, "Lección 3: Tratamiento y Manejo",
				"El tratamiento de la diabetes se centra en mantener niveles de glucosa en sangre dentro del rango normal y prevenir complicaciones. Esto generalmente implica una combinación de cambios en el estilo de vida, medicamentos, y monitoreo regular de la glucosa en sangre. En esta lección, discutiremos las diferentes opciones de tratamiento disponibles, desde la dieta y el ejercicio hasta la terapia con insulina y otros medicamentos. También exploraremos estrategias de manejo para abordar los desafíos diarios de vivir con diabetes.");
		insertarLeccion(curso0, "Lección 4: Viviendo con Diabetes",
				"Vivir con diabetes puede presentar desafíos únicos, pero también hay muchas estrategias y recursos disponibles para ayudar a las personas a manejar su enfermedad y llevar una vida plena y activa. En esta lección, exploraremos los aspectos prácticos de vivir con diabetes, incluidos los cambios en la dieta y el ejercicio, el manejo de la medicación, el monitoreo regular de la glucosa en sangre y la prevención de complicaciones a largo plazo. También discutiremos el apoyo emocional y las comunidades de apoyo disponibles para las personas con diabetes.");

		// Curso 1
		CursoVO curso1 = sc.findById(2).orElseThrow();
		insertarLeccion(curso1, "Lección 1: Introducción a los Tipos de Diabetes",
				"En esta lección aprenderás sobre los diferentes tipos de diabetes, incluyendo la diabetes tipo 1, tipo 2 y otros tipos menos comunes. Exploraremos las características distintivas de cada tipo y cómo afectan al organismo.");
		insertarLeccion(curso1, "Lección 2: Tratamiento de la Diabetes",
				"Descubre las opciones de tratamiento disponibles para cada tipo de diabetes, desde cambios en el estilo de vida hasta medicamentos y terapias avanzadas. Aprenderás cómo manejar eficazmente tu diabetes con la ayuda de profesionales de la salud.");
		insertarLeccion(curso1, "Lección 3: Causas y Factores de Riesgo",
				"Profundizaremos en las causas subyacentes de la diabetes, incluyendo factores genéticos, ambientales y de estilo de vida. También analizaremos los factores de riesgo que pueden aumentar la probabilidad de desarrollar diabetes y cómo mitigarlos.");
		insertarLeccion(curso1, "Lección 4: Estrategias de Prevención",
				"En esta lección, aprenderás estrategias prácticas para prevenir la diabetes y reducir el riesgo de complicaciones asociadas. Desde hábitos saludables hasta programas de detección temprana, descubrirás cómo tomar medidas proactivas para proteger tu salud.");

		// Curso 2
		CursoVO curso2 = sc.findById(3).orElseThrow();
		insertarLeccion(curso2, "Lección 1: Fundamentos de la Diabetes",
				"En esta lección, exploraremos los conceptos básicos de la diabetes, incluyendo qué es la diabetes, cómo afecta al cuerpo y cuáles son sus principales características. También discutiremos las diferencias entre los tipos de diabetes y cómo se diagnostica la enfermedad.");
		insertarLeccion(curso2, "Lección 2: Diabetes vs Vida",
				"Vivir con diabetes puede presentar desafíos únicos, pero también hay muchas estrategias y recursos disponibles para ayudar a las personas a manejar su enfermedad y llevar una vida plena y activa. En esta lección, exploraremos los aspectos prácticos de vivir con diabetes, incluidos los cambios en la dieta y el ejercicio, el manejo de la medicación, el monitoreo regular de la glucosa en sangre y la prevención de complicaciones a largo plazo.");

		// Curso 3
		CursoVO curso3 = sc.findById(4).orElseThrow();
		insertarLeccion(curso3, "Lección 1: Introducción a la Diabetes Tipo 1",
				"En esta lección, aprenderás los conceptos básicos sobre la diabetes tipo 1. Descubrirás cómo se desarrolla esta enfermedad, sus características distintivas y cómo afecta al cuerpo. También exploraremos las diferencias entre la diabetes tipo 1 y otros tipos de diabetes.");
		insertarLeccion(curso3, "Lección 2: Complicaciones de la Diabetes Tipo 1",
				"En esta lección, profundizaremos en las complicaciones que pueden surgir debido a la diabetes tipo 1. Desde problemas de salud a corto plazo hasta complicaciones a largo plazo, entenderás cómo la diabetes tipo 1 puede afectar diferentes aspectos de tu vida. También aprenderás estrategias para prevenir y controlar estas complicaciones.");
		insertarLeccion(curso3, "Lección 3: Manejo y Consejos Prácticos",
				"Descubre estrategias prácticas para manejar la diabetes tipo 1 en tu vida diaria. Desde la administración de insulina hasta la planificación de comidas y el manejo de situaciones de emergencia, aprenderás cómo llevar un estilo de vida saludable y activo a pesar de la diabetes. También exploraremos consejos para sobrellevar los desafíos emocionales asociados con esta enfermedad.");

		// Curso 4
		CursoVO curso4 = sc.findById(5).orElseThrow();
		insertarLeccion(curso4, "Lección 1: Complicaciones de la Diabetes",
				"En esta lección, exploraremos las posibles complicaciones que pueden surgir debido a una diabetes mal gestionada. Desde problemas en los pies hasta problemas de visión y enfermedades del corazón, entenderemos cómo la diabetes puede afectar diferentes partes del cuerpo.");
		insertarLeccion(curso4, "Lección 2: Estrategias de Prevención y Control",
				"Descubre las estrategias y medidas preventivas que pueden ayudar a controlar y prevenir las complicaciones asociadas con la diabetes. Desde llevar un estilo de vida saludable hasta realizar exámenes médicos regulares, aprenderás cómo reducir el riesgo de complicaciones y mantener una buena calidad de vida.");

		// Curso 5
		CursoVO curso5 = sc.findById(6).orElseThrow();
		insertarLeccion(curso5, "Lección 1: Funcionamiento de la Insulina y la Glucosa",
				"En esta lección, profundizaremos en los procesos de la insulina y la glucosa en el cuerpo humano. Aprenderás cómo la insulina regula los niveles de glucosa en sangre, cómo se produce y se libera en el cuerpo, y qué sucede cuando este proceso no funciona correctamente. También exploraremos de dónde proviene la glucosa en el cuerpo y cómo se utiliza como fuente de energía para las células.");

		// Curso 6
		CursoVO curso6 = sc.findById(7).orElseThrow();
		insertarLeccion(curso6, "Lección 1: Impacto Emocional de la Diabetes",
				"En esta lección, exploraremos el impacto emocional que puede tener vivir con diabetes. Discutiremos cómo las emociones pueden afectar el manejo de la diabetes, cómo el estrés y la ansiedad pueden influir en los niveles de glucosa en sangre, y estrategias para mejorar la estabilidad emocional y el bienestar mental.");
		insertarLeccion(curso6, "Lección 2: Estrategias de Manejo Emocional",
				"En esta lección, aprenderemos diferentes estrategias para manejar las emociones asociadas con la diabetes. Exploraremos técnicas de afrontamiento, cómo establecer metas realistas y el papel del apoyo social en el bienestar emocional de las personas con diabetes.");

		// Curso 7
		CursoVO curso7 = sc.findById(8).orElseThrow();
		insertarLeccion(curso7, "Lección 1: Monitorización de la Glucosa",
				"En esta lección, exploraremos las diferentes herramientas de monitorización de la glucosa disponibles para las personas recién diagnosticadas con diabetes. Aprenderás sobre los medidores de glucosa en sangre, los sistemas de monitoreo continuo de glucosa (CGM) y cómo utilizar esta información para tomar decisiones informadas sobre el manejo de la diabetes.");
		insertarLeccion(curso7, "Lección 2: Planificación de Comidas y Ejercicio",
				"Aprenderás cómo planificar comidas saludables y establecer rutinas de ejercicio beneficiosas para el control de la diabetes. Exploraremos estrategias de planificación de comidas, cómo contar carbohidratos y ajustar la medicación según las actividades físicas planificadas.");

		// Curso 8
		CursoVO curso8 = sc.findById(9).orElseThrow();
		insertarLeccion(curso8, "Lección 1: Introducción a la Fotografía",
				"En esta lección, profundizaremos en el conteo de carbohidratos y su importancia en el manejo de la diabetes. Aprenderás cómo identificar y calcular la cantidad de carbohidratos en los alimentos, y cómo usar esta información para planificar comidas saludables y controlar los niveles de glucosa en sangre.");

		// Curso 9
		CursoVO curso9 = sc.findById(10).orElseThrow();
		insertarLeccion(curso9, "Lección 1: Monitoreo Continuo de Glucosa (CGM)",
				"En esta lección, aprenderás sobre el monitoreo continuo de glucosa (CGM) y cómo esta tecnología revolucionaria puede ayudar a las personas con diabetes a controlar sus niveles de glucosa en tiempo real. Exploraremos cómo funciona el CGM, cómo interpretar los datos proporcionados y cómo utilizar esta información para tomar decisiones informadas sobre el manejo de la diabetes.");
	}

	/**
	 * Método privado para insertar una lección en un curso específico.
	 * 
	 * @param curso     El curso en el que se insertará la lección.
	 * @param titulo    El título de la lección.
	 * @param contenido El contenido de la lección.
	 */
	private void insertarLeccion(CursoVO curso, String titulo, String contenido) {
		LeccionVO leccion = new LeccionVO(titulo, contenido, 1, curso, new ArrayList<>());
		LeccionVO savedLeccion = sl.save(leccion);
		assertNotNull(savedLeccion);
	}

	/**
	 * Método de prueba para verificar la eliminación de una lección.
	 */
	@Test
	public void test02Eliminar() {
		LeccionVO l = sl.findById(5).orElseThrow();
		sl.delete(l);
		assertTrue(sl.findById(5).isEmpty());
	}

	/**
	 * Método de prueba para verificar la modificación de una lección.
	 */
	@Test
	public void test03Modificar() {
		LeccionVO l = sl.findById(4).orElseThrow();
		l.setTituloLeccion("ALIMENTACIÓN SALUDABLE");
		assertEquals("ALIMENTACIÓN SALUDABLE", sl.save(l).getTituloLeccion());
	}

	/**
	 * Método de prueba para verificar la recuperación de todos los cursos.
	 */
	@Test
	public void test04FindByAll() {
		assertEquals(10, sc.findAll().size()); // Verificar el número total de cursos
	}
}
