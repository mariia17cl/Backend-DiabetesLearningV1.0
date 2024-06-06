package com.dawes.DiabetesLearning.modelo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Representa una inscripción a un curso dentro del sistema de aulas virtuales para la educación sobre la diabetes.
 * 
 * @autor María Clemente Luengo
 * @version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "inscripciones", uniqueConstraints = { @UniqueConstraint(columnNames = { "iduser", "idcurso" }) })
public class InscripcionVO {

    /** Identificador único de la inscripción. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idinscripcion;

    /** Fecha de la inscripción. */
    private LocalDate fechaInscripcion;

    /** Usuario que realiza la inscripción, representado por una entidad {@link UsuarioVO}. */
    @ManyToOne
    @JoinColumn(name = "iduser")
    @JsonIgnore
    private UsuarioVO user;

    /** Curso al que se inscribe el usuario, representado por una entidad {@link CursoVO}. */
    @ManyToOne
    @JoinColumn(name = "idcurso")
    @JsonIgnore
    private CursoVO curso;

    /** Indica si el usuario ha obtenido un diploma al completar el curso. */
    private boolean tieneDiploma;

    /**
     * Constructor para inicializar una inscripción con los parámetros especificados.
     * 
     * @param fechaInscripcion la fecha de la inscripción
     * @param user el usuario que realiza la inscripción
     * @param curso el curso al que se inscribe el usuario
     * @param tieneDiploma indica si el usuario ha obtenido un diploma al completar el curso
     */
    public InscripcionVO(LocalDate fechaInscripcion, UsuarioVO user, CursoVO curso, boolean tieneDiploma) {
        super();
        this.fechaInscripcion = fechaInscripcion;
        this.user = user;
        this.curso = curso;
        this.tieneDiploma = tieneDiploma;
    }
}
