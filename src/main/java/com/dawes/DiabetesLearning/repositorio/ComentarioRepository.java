package com.dawes.DiabetesLearning.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dawes.DiabetesLearning.modelo.ComentarioVO;

/**
 * Repositorio JPA para la entidad ComentarioVO.
 * Proporciona operaciones CRUD para los comentarios.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */
public interface ComentarioRepository extends JpaRepository<ComentarioVO, Integer> {

}
