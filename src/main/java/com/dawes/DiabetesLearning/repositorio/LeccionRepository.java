package com.dawes.DiabetesLearning.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dawes.DiabetesLearning.modelo.LeccionVO;

/**
 * Repositorio JPA para la entidad LeccionVO. Proporciona operaciones CRUD para
 * las lecciones.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */
public interface LeccionRepository extends JpaRepository<LeccionVO, Integer> {

}
