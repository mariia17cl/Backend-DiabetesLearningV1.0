package com.dawes.DiabetesLearning.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dawes.DiabetesLearning.modelo.CursoVO;

/**
 * Repositorio JPA para la entidad CursoVO. Proporciona operaciones CRUD para
 * los cursos.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */
public interface CursoRepository extends JpaRepository<CursoVO, Integer> {

}
