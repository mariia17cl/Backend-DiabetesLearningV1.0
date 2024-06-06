package com.dawes.DiabetesLearning.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dawes.DiabetesLearning.modelo.InscripcionVO;

/**
 * Repositorio JPA para la entidad InscripcionVO. Proporciona operaciones CRUD
 * para las inscripciones.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */
public interface InscripcionRepository extends JpaRepository<InscripcionVO, Integer> {

}
