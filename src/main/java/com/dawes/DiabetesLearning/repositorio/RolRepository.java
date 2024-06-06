package com.dawes.DiabetesLearning.repositorio;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dawes.DiabetesLearning.modelo.RolVO;

/**
 * Repositorio JPA para la entidad RolVO. Proporciona operaciones CRUD para los
 * roles y métodos de búsqueda personalizados.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */
public interface RolRepository extends JpaRepository<RolVO, Integer> {

	/**
	 * Encuentra un rol por su nombre.
	 * 
	 * @param nombreRol el nombre del rol
	 * @return un Optional que contiene el rol si se encuentra, o vacío si no
	 */
	Optional<RolVO> findByNombreRol(String nombreRol);
}
