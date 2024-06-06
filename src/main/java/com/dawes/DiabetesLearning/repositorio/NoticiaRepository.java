package com.dawes.DiabetesLearning.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dawes.DiabetesLearning.modelo.NoticiaVO;

/**
 * Repositorio JPA para la entidad NoticiaVO. Proporciona operaciones CRUD para
 * las noticias.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */
public interface NoticiaRepository extends JpaRepository<NoticiaVO, Integer> {

}
