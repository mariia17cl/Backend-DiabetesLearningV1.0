package com.dawes.DiabetesLearning;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

/**
 * Suite de pruebas que ejecuta todas las pruebas unitarias definidas en la
 * aplicación.
 * 
 * @author María Clemente Luengo
 * @version 1.0
 */
@Suite
@SelectClasses({ TestRol.class, TestUsuario.class, TestCurso.class, TestLeccion.class, TestRecurso.class,
		TestComentario.class, TestInscripcion.class, TestNoticia.class })
public class AllTests {

}
