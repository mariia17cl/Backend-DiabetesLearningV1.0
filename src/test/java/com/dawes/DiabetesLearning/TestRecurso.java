package com.dawes.DiabetesLearning;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dawes.DiabetesLearning.modelo.LeccionVO;
import com.dawes.DiabetesLearning.modelo.RecursoVO;
import com.dawes.DiabetesLearning.servicios.ServicioLeccion;
import com.dawes.DiabetesLearning.servicios.ServicioRecurso;

/**
 * Clase de prueba para verificar el funcionamiento de las operaciones CRUD en
 * la entidad RecursoVO.
 * 
 * <p>
 * Esta clase realiza pruebas de inserción, eliminación, modificación y
 * recuperación de recursos asociados a lecciones.
 * </p>
 * 
 * @author María Clemente Luengo
 * @version 1.0
 */

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest
public class TestRecurso {

	@Autowired
	private ServicioRecurso sr;

	@Autowired
	private ServicioLeccion sl;

	/**
	 * Método de prueba para verificar la inserción de recursos.
	 */
	@Test
	void test01Insertar() {
		LeccionVO l1 = sl.findById(1).get();
		LeccionVO l2 = sl.findById(2).get();
		LeccionVO l3 = sl.findById(3).get();
		LeccionVO l4 = sl.findById(4).get();
		LeccionVO l5 = sl.findById(5).get();
		LeccionVO l9 = sl.findById(9).get();
		LeccionVO l10 = sl.findById(10).get();
		LeccionVO l11 = sl.findById(11).get();
		LeccionVO l12 = sl.findById(12).get();
		LeccionVO l13 = sl.findById(13).get();
		LeccionVO l14 = sl.findById(14).get();
		LeccionVO l15 = sl.findById(15).get();
		LeccionVO l17 = sl.findById(17).get();
		LeccionVO l18 = sl.findById(18).get();
		LeccionVO l21 = sl.findById(21).get();

		RecursoVO r1 = new RecursoVO("Introducción Diabetes Learning",
				"https://www.youtube.com/embed/-4vFe09hvrk?si=UUQzzVWVln0gIW-_", l1);
		sr.save(r1);
		RecursoVO r2 = new RecursoVO("pdf; Diagnostico diabetes",
				"https://www.redgdps.org/gestor/upload/colecciones/11_guiadm2_capGuia%20DM2_web.pdf", l2);
		sr.save(r2);
		RecursoVO r3 = new RecursoVO("Tratamiento de la diabetes mellitus",
				"https://www.sanidad.gob.es/eu/biblioPublic/publicaciones/docs/mellitus.pdf", l3);
		sr.save(r3);
		RecursoVO r4 = new RecursoVO("Vivir con diabetes",
				"https://ibero.mx/sites/all/themes/ibero/descargables/publicaciones/aprender-a-vivir-con-diabetes.pdf",
				l4);
		sr.save(r4);
		RecursoVO r5 = new RecursoVO("Tipo 1", "https://dtc.ucsf.edu/images-spanish/charts/1.d.jpg", l11);
		assertNotNull(sr.save(r5));
		RecursoVO r6 = new RecursoVO("Estabilidad Emocional",
				"https://www.youtube.com/embed/tHSNVhszxgI?si=qB-AEcR9jtgoWCCb", l17);
		assertNotNull(sr.save(r6));
		RecursoVO r7 = new RecursoVO("Diabetes: Desafíos para el siglo XXI",
				"https://www.revistaalad.com/pdfs/0702desafios.pdf", l10);
		assertNotNull(sr.save(r7));
		RecursoVO r8 = new RecursoVO("COMPLICACIONES AGUDAS",
				"https://www.samfyc.es/wp-content/uploads/2023/12/2023_guiaDMsamfyc_cap12.pdf", l13);
		assertNotNull(sr.save(r8));
		RecursoVO r9 = new RecursoVO("Entendiendo la Diabetes: Causas y Síntomas",
				"https://www.youtube.com/embed/oM54edkIt5Q?si=a7rMBJ8qVAgTpgJx", l9);
		assertNotNull(sr.save(r9));
		RecursoVO r10 = new RecursoVO("El Proceso de Insulina y Glucosa en el Cuerpo",
				"https://www.youtube.com/embed/7vYh1-lWI7I?si=_WFIfnHoFmSw082e", l14);
		assertNotNull(sr.save(r10));
		RecursoVO r11 = new RecursoVO("prevención de DIABETES",
				"https://www.cruzroja.es/prevencion/descargas/publicaciones/CRE-Plan-Salud-Folleto-diabetes.pdf", l15);
		assertNotNull(sr.save(r11));
		RecursoVO r12 = new RecursoVO("Complicaciones de la Diabetes: Prevención y Manejo",
				"https://www.youtube.com/embed/2ynZbUFK6ds?si=mmFnaM6psz4h0dcu", l12);
		assertNotNull(sr.save(r12));
		RecursoVO r13 = new RecursoVO("Consejos para el Debut Diabético",
				"https://www.youtube.com/embed/yqQIcb3cgfE?si=hfAE7WvFVy4oWbNw", l18);
		assertNotNull(sr.save(r13));
		RecursoVO r14 = new RecursoVO("Menús y Planificación de Comidas para Diabéticos",
				"https://www.youtube.com/embed/HcdrCCeXtyU?si=djSs6GQilZkJ0i_w", l21);
		assertNotNull(sr.save(r14));
		RecursoVO r15 = new RecursoVO("Conociendo los Tipos de Diabetes",
				"https://www.youtube.com/embed/lWBDb37hyf4?si=Pqf6uwxl161U9Ozw", l5);
		sr.save(r15);
		RecursoVO r16 = new RecursoVO("PRUEBA", "https://www.youtube.com/lWBDb37hyf4?si=Pqf6uwxl161U9Ozw", l5);
		sr.save(r16);
		RecursoVO r17 = new RecursoVO("PRUEBA-2", "https://www.youtube.com/lWBDb37hyf4?si=Pqf6uwxl161U9Ozw", l5);
		sr.save(r17);
	}

	/**
	 * Método de prueba para verificar la eliminación de un recurso.
	 */
	@Test
	public void test02eliminar() {
		RecursoVO r = sr.findById(16).get();
		sr.delete(r);
		assertTrue(sr.findById(16).isEmpty());
	}

	/**
	 * Método de prueba para verificar la modificación de un recurso.
	 */
	@Test
	public void test03modificar() {
		RecursoVO r = sr.findById(17).get();
		r.setNombreRecurso("Alimentación Saludable Video");
		assertEquals("Alimentación Saludable Video", sr.save(r).getNombreRecurso());
	}

	/**
	 * Método de prueba para verificar la recuperación de todos los recursos.
	 */
	@Test
	public void test04findbyall() {
		assertEquals(17, sr.findAll().size());
	}

}
