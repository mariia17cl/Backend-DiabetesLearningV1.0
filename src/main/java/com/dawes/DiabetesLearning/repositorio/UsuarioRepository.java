package com.dawes.DiabetesLearning.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dawes.DiabetesLearning.modelo.UsuarioVO;

/**
 * Repositorio JPA para la entidad UsuarioVO. Proporciona operaciones CRUD para
 * los usuarios.
 * 
 * @autor Maria Clemente Luengo
 * @version 1.0
 */
public interface UsuarioRepository extends JpaRepository<UsuarioVO, Integer> {

}
