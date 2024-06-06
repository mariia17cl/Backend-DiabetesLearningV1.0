package com.dawes.DiabetesLearning.ws;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuración para permitir solicitudes CORS (Cross-Origin Resource Sharing).
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOriginPatterns("*") // Permitir todas las IPs
				.allowedMethods("GET", "POST", "PUT", "DELETE") // Métodos permitidos
				.allowCredentials(true).maxAge(3600);
	}
}