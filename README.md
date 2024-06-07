# DiabetesLearning Backend
<aside>
💻 María Clemente Luengo
</aside>


[JavaDoc de DiabetesLearning Desplegado](https://javadoc-diabeteslearning.netlify.app/)

[Diabetes Learning - Vista Usuario Anónimo Desplegada](https://diabetes-learning.netlify.app/)

## Descripción General del Proyecto

DiabetesLearning es una plataforma en línea diseñada para proporcionar educación y recursos para el manejo efectivo de la diabetes. Su objetivo es empoderar a las personas recién diagnosticadas con diabetes tipo 1 o tipo 2, así como a sus familias y profesionales de la salud, brindándoles conocimientos y habilidades necesarias para llevar un estilo de vida saludable y controlar su enfermedad de manera efectiva.

## Características Principales

- **Autenticación y Autorización:** Manejo de usuarios, roles y permisos.
- **Gestión de Cursos:** Creación, actualización, eliminación y visualización de cursos.
- **Gestión de Lecciones:** Administración de lecciones dentro de los cursos.
- **Gestión de Recursos:** Administración de recursos (videos, documentos) asociados a las lecciones.
- **Gestión de Noticias:** Creación, actualización, eliminación y visualización de noticias relacionadas con la diabetes.
- **Gestión de Comentarios:** Los usuarios pueden dejar comentarios en cursos y lecciones.

## Tecnologías Utilizadas

- **Spring Boot:** Framework para el desarrollo de aplicaciones backend.
- **JPA/Hibernate:** Para la gestión de la persistencia de datos.
- **MySQL:** Base de datos relacional para almacenar los datos de la aplicación.
- **Maven:** Herramienta de gestión de dependencias y construcción del proyecto.

## Instalación y Ejecución

### Prerrequisitos

- **Java 11** o superior.
- **Maven**.
- **MySQL**.

### Configuración de la Base de Datos

1. Crear una base de datos MySQL llamada `diabeteslearning`.
2. Configurar las credenciales de acceso en el archivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/diabeteslearning
spring.datasource.username=root
#(aquí iría la tuya propia)
spring.datasource.password=temporal
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Construcción y Ejecución del Proyecto

1. Clonar el repositorio:

```bash
git clone https://github.com/tuUsuario/diabeteslearning-backend.git
cd diabeteslearning-backend
```

2. Construir el proyecto con Maven:

```bash
mvn clean install
```

3. Ejecutar la aplicación:

```bash
mvn spring-boot:run
```

La aplicación estará disponible en `http://localhost:8080`.

## Endpoints Principales

- **/usuarios/**: Gestión de usuarios.
- **/cursos/**: Gestión de cursos.
- **/lecciones/**: Gestión de lecciones.
- **/recursos/**: Gestión de recursos.
- **/noticias/**: Gestión de noticias.
- **/comentarios/**: Gestión de comentarios.

## Contribución

1. Hacer un fork del proyecto.
2. Crear una nueva rama para tu funcionalidad (`git checkout -b feature/nueva-funcionalidad`).
3. Hacer commit de tus cambios (`git commit -m 'Añadir nueva funcionalidad'`).
4. Hacer push a la rama (`git push origin feature/nueva-funcionalidad`).
5. Abrir un Pull Request.


