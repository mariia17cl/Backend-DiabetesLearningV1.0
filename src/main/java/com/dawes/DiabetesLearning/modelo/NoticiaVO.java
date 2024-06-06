package com.dawes.DiabetesLearning.modelo;

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
 * Representa una noticia dentro del sistema de aulas virtuales para la educación sobre la diabetes.
 * 
 * @autor María Clemente Luengo
 * @version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "noticias")
public class NoticiaVO {

    /** Identificador único de la noticia. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idnoticia;

    /** Encabezado de la noticia, debe ser único. */
    @Column(unique = true)
    private String encabezado;

    /** Asunto de la noticia. */
    private String asunto;

    /** URL de contenido multimedia asociado a la noticia. */
    private String multimedia;

    /**
     * Constructor para inicializar una noticia con los parámetros especificados.
     * 
     * @param encabezado el encabezado de la noticia
     * @param asunto el asunto de la noticia
     * @param multimedia la URL de contenido multimedia asociado a la noticia
     */
    public NoticiaVO(String encabezado, String asunto, String multimedia) {
        super();
        this.encabezado = encabezado;
        this.asunto = asunto;
        this.multimedia = multimedia;
    }
}
