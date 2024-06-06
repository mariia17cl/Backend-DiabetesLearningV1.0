package com.dawes.DiabetesLearning.modelo;

import java.time.LocalDate;

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
 * Representa un comentario dentro del sistema de aulas virtuales para la educación sobre la diabetes.
 * 
 * @autor María Clemente Luengo
 * @version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "comentarios", uniqueConstraints = { @UniqueConstraint(columnNames = { "idcurso", "iduser" }) })
public class ComentarioVO {

    /** Identificador único del comentario. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcomentario;

    /** Contenido del comentario. */
    private String contenido;

    /** Fecha de publicación del comentario. */
    private LocalDate fechaPublicacion;

    /** Curso al que pertenece el comentario, representado por una entidad {@link CursoVO}. */
    @ManyToOne
    @JoinColumn(name = "idcurso")
    private CursoVO curso;

    /** Usuario que realiza el comentario, representado por una entidad {@link UsuarioVO}. */
    @ManyToOne
    @JoinColumn(name = "iduser")
    private UsuarioVO user;

    /**
     * Constructor para inicializar un comentario con los parámetros especificados.
     * 
     * @param contenido el contenido del comentario
     * @param fechaPublicacion la fecha de publicación del comentario
     * @param curso el curso al que pertenece el comentario
     * @param user el usuario que realiza el comentario
     */
    public ComentarioVO(String contenido, LocalDate fechaPublicacion, CursoVO curso, UsuarioVO user) {
        super();
        this.contenido = contenido;
        this.fechaPublicacion = fechaPublicacion;
        this.curso = curso;
        this.user = user;
    }
}
