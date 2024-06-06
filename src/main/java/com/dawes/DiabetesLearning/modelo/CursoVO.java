package com.dawes.DiabetesLearning.modelo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Representa un curso dentro del sistema de aulas virtuales para la educación sobre la diabetes.
 * 
 * @autor María Clemente Luengo
 * @version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "cursos")
public class CursoVO {

    /** Identificador único del curso. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcurso;

    /** Título del curso, debe ser único. */
    @Column(unique = true)
    private String tituloCurso;

    /** Descripción del curso. */
    private String descripcion;

    /** Nivel del curso (e.g., básico, intermedio, avanzado). */
    private String nivel;

    /** Lista de inscripciones asociadas al curso. */
    @OneToMany(mappedBy = "curso")
    @JsonIgnore
    private List<InscripcionVO> users;

    /** Lista de lecciones asociadas al curso. */
    @OneToMany(mappedBy = "curso", cascade = CascadeType.REMOVE)
    @JsonIgnore
    private List<LeccionVO> lecciones;

    /** Lista de comentarios asociados al curso. */
    @OneToMany(mappedBy = "curso", cascade = CascadeType.REMOVE)
    @JsonIgnore
    private List<ComentarioVO> comentarios;

    /**
     * Constructor para inicializar un curso con los parámetros especificados.
     * 
     * @param tituloCurso el título del curso
     * @param descripcion la descripción del curso
     * @param nivel el nivel del curso
     * @param users la lista de inscripciones asociadas al curso
     * @param lecciones la lista de lecciones asociadas al curso
     * @param comentarios la lista de comentarios asociados al curso
     */
    public CursoVO(String tituloCurso, String descripcion, String nivel, List<InscripcionVO> users,
            List<LeccionVO> lecciones, List<ComentarioVO> comentarios) {
        super();
        this.tituloCurso = tituloCurso;
        this.descripcion = descripcion;
        this.nivel = nivel;
        this.users = users;
        this.lecciones = lecciones;
        this.comentarios = comentarios;
    }
}
