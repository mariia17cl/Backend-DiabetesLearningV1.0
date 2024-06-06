package com.dawes.DiabetesLearning.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dawes.DiabetesLearning.modelo.RecursoVO;

/**
 * Repositorio JPA para la entidad RecursoVO. Proporciona operaciones CRUD para
 * los recursos.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */
public interface RecursoRepository extends JpaRepository<RecursoVO, Integer> {

}
