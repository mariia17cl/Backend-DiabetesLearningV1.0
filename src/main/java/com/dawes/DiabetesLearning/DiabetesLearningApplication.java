package com.dawes.DiabetesLearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * La clase principal que inicia la aplicación DiabetesLearning. Esta clase
 * utiliza la anotación @SpringBootApplication para habilitar la configuración
 * automática de Spring Boot.
 * 
 * @author Maria Clemente
 * @version 1.0
 */
@SpringBootApplication
public class DiabetesLearningApplication {

	/**
	 * El método principal que inicia la aplicación DiabetesLearning. Este método
	 * inicia la aplicación Spring Boot utilizando SpringApplication.run(), pasando
	 * la clase DiabetesLearningApplication como argumento junto con los argumentos
	 * de línea de comandos.
	 * 
	 * @param args Los argumentos de línea de comandos pasados al iniciar la
	 *             aplicación.
	 */
	public static void main(String[] args) {
		SpringApplication.run(DiabetesLearningApplication.class, args);
	}

}
