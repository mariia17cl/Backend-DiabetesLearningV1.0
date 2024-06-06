package com.dawes.DiabetesLearning.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Representa un rol dentro del sistema de aulas virtuales para la educación
 * sobre la diabetes.
 * 
 * 
 * 
 * @autor María Clemente Luengo
 * @version 1.0
 * 
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "roles")
public class RolVO {

	/** Identificador único del rol. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idrol;
	
	/** Nombre del rol, debe ser único. */
	@Column(unique = true)
	private String nombreRol;

	/**
	 * Constructor para inicializar un rol con el nombre especificado.
	 * 
	 * @param nombreRol el nombre del rol
	 */
	public RolVO(String nombreRol, List<UsuarioVO> usuarios) {
		super();
		this.nombreRol = nombreRol;
	}

}
