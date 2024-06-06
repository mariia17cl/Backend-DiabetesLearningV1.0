package com.dawes.DiabetesLearning.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Representa una lección dentro del sistema de aulas virtuales para la educación sobre la diabetes.
 * 
 * @autor María Clemente Luengo
 * @version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "lecciones")
public class LeccionVO {

    /** Identificador único de la lección. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idleccion;

    /** Título de la lección, debe ser único. */
    @Column(unique = true)
    private String tituloLeccion;

    /** Contenido de la lección. */
    private String contenido;

    /** Orden de la lección dentro del curso. */
    private int orden;

    /** Curso al que pertenece la lección, representado por una entidad {@link CursoVO}. */
    @ManyToOne
    @JoinColumn(name = "idcurso")
    private CursoVO curso;

    /** Lista de recursos asociados a la lección. */
    @OneToMany(mappedBy = "leccion", cascade = CascadeType.REMOVE)
    private List<RecursoVO> recursos;

    /**
     * Constructor para inicializar una lección con los parámetros especificados.
     * 
     * @param tituloLeccion el título de la lección
     * @param contenido el contenido de la lección
     * @param orden el orden de la lección dentro del curso
     * @param curso el curso al que pertenece la lección
     * @param recursos la lista de recursos asociados a la lección
     */
    public LeccionVO(String tituloLeccion, String contenido, int orden, CursoVO curso, List<RecursoVO> recursos) {
        super();
        this.tituloLeccion = tituloLeccion;
        this.contenido = contenido;
        this.orden = orden;
        this.curso = curso;
        this.recursos = recursos;
    }
}
