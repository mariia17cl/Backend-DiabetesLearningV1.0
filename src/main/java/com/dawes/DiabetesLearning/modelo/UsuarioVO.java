package com.dawes.DiabetesLearning.modelo;

import java.util.List;

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
 * Representa a un usuario dentro del sistema de aulas virtuales para la educación sobre la diabetes.
 * 
 * <p>Descripción General: El proyecto de aulas virtuales se centrará en proporcionar 
 * educación y recursos para el manejo efectivo de la diabetes. Está diseñado para personas 
 * que han debutado recientemente con diabetes tipo 1 o tipo 2, así como para sus familias 
 * y profesionales de la salud. El objetivo es empoderar a los participantes con el 
 * conocimiento y las habilidades necesarias para llevar un estilo de vida saludable y 
 * controlar su diabetes de manera efectiva. Se usarán herramientas de inteligencia artificial 
 * para la creación de contenidos y tutoriales.
 * 
 * <p>PROPÓSITOS Y OBJETIVOS:
 * <ul>
 *   <li>Proporcionar educación integral sobre la diabetes y sus aspectos clave.</li>
 *   <li>Capacitar a las personas con diabetes y sus familias para tomar decisiones informadas sobre la alimentación, el ejercicio y la medicación.</li>
 *   <li>Enseñar estrategias prácticas para el control de la glucosa en sangre y la prevención de complicaciones.</li>
 * </ul>
 * 
 * <p>Este proyecto de aulas virtuales sería una gran herramienta para las personas que enfrentan la diabetes,
 * ya que les proporcionaría información esencial, habilidades prácticas y un lugar para conectarse con otros que
 * comparten sus experiencias. El enfoque en el autocuidado y la educación puede ayudar a mejorar la calidad de vida
 * de las personas con diabetes.
 * 
 * @autor María Clemente Luengo
 * @version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "users")
public class UsuarioVO {

    /** Identificador único del usuario. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iduser;

    /** Nombre del usuario. */
    private String nombreUser;

    /** Documento Nacional de Identidad del usuario, debe ser único. */
    @Column(unique = true)
    private String dniUser;

    /** Correo electrónico del usuario. */
    private String correo;

    /** Contraseña del usuario. */
    private String password;

    /** Rol del usuario, representado por una entidad {@link RolVO}. */
    @ManyToOne
    @JoinColumn(name = "idrol")
    private RolVO rol;

    /**
     * Constructor adicional para inicializar un usuario con los parámetros especificados.
     * 
     * @param nombreUser el nombre del usuario
     * @param dniUser el DNI del usuario
     * @param correo el correo electrónico del usuario
     * @param password la contraseña del usuario
     * @param rol el rol del usuario
     * @param cursos la lista de cursos a los que está inscrito el usuario
     * @param comentarios la lista de comentarios hechos por el usuario
     */
    public UsuarioVO(String nombreUser, String dniUser, String correo, String password, RolVO rol,
            List<InscripcionVO> cursos, List<ComentarioVO> comentarios) {
        super();
        this.nombreUser = nombreUser;
        this.dniUser = dniUser;
        this.correo = correo;
        this.password = password;
        this.rol = rol;
    }

    /**
     * Constructor adicional para inicializar un usuario con los parámetros especificados.
     * 
     * @param rol el rol del usuario
     * @param correo el correo electrónico del usuario
     * @param dniUser el DNI del usuario
     * @param nombreUser el nombre del usuario
     * @param iduser el identificador único del usuario
     */
    public UsuarioVO(RolVO rol, String correo, String dniUser, String nombreUser, int iduser) {
        this.rol = rol;
        this.correo = correo;
        this.dniUser = dniUser;
        this.nombreUser = nombreUser;
        this.iduser = iduser;
    }
}
