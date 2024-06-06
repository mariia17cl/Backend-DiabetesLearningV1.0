package com.dawes.DiabetesLearning.modelo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Representa un recurso dentro del sistema de aulas virtuales para la educación
 * sobre la diabetes.
 * 
 * 
 * @autor María Clemente Luengo
 * @version 1.0
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "recursos")
public class RecursoVO {

	/** Identificador único del recurso. */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idrecurso;

	/** Nombre del recurso, debe ser único. */
	@Column(unique = true)
	private String nombreRecurso;

	/** URL del recurso. */
	private String url;

	/**
	 * Curso al que pertenece el recurso, representado por una entidad
	 * {@link CursoVO}.
	 */
	@ManyToOne
	@JoinColumn(name = "idleccion")
	@JsonIgnore
	private LeccionVO leccion;

	/**
	 * Constructor para inicializar un recurso con los parámetros especificados.
	 * 
	 * @param nombreRecurso el nombre del recurso
	 * @param url           la URL del recurso
	 * @param curso         el curso al que pertenece el recurso
	 * @param leccion       la lección a la que pertenece el recurso
	 */
	public RecursoVO(String nombreRecurso, String url, LeccionVO leccion) {
		super();
		this.nombreRecurso = nombreRecurso;
		this.url = url;
		this.leccion = leccion;
	}

}
