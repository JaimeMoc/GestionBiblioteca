# 📚 Gestión Biblioteca

Proyecto en Java orientado a objetos para la gestión de materiales bibliográficos en una biblioteca. Desarrollado con principios SOLID, buenas prácticas de POO y documentación mediante ADRs.

---

## 🛠️ Tecnologías utilizadas

- java 23.0.2 2025-01-21
- IntelliJ IDEA (IDE recomendado)
- Programación Orientada a Objetos (POO)
- Principios SOLID
- Estructura modular (por paquetes)
- ADRs para decisiones arquitectónicas

## Diseño de los requerimientos

![Captura de pantalla del sistema](diseñoRequerimientos.jpg)


## 📂 Estructura del proyecto

```plaintext
src/
└── modules/
    ├── Main.java
    ├── Biblioteca.java
    ├── materiales/
    │   ├── MaterialBibliografico.java
    │   ├── Libro.java
    │   ├── Revista.java
    │   └── Periodico.java
    ├── usuarios/
    │   ├── Usuario.java
    │   ├── Estudiante.java
    │   └── Bibliotecario.java
    └── interfaces/
        ├── Manipulable.java
        ├── GestionPrestamo.java
        ├── GestionUsuario.java
        └── Ver.java
docs/
└── adr/
    ├── 001-estructura-paquetes.md
    ├── 002-clases-abstractas.md
    ├── 003-principios-solid.md
    ├── 004-separacion-logica-ui.md
    ├── 005-uso-interfaces.md
    └── 006-lista-materiales.md
```
## 🚀 Cómo ejecutar el proyecto

1. Clona el repositorio:

git clone https://github.com/tu-usuario/gestion-biblioteca.git
Abre el proyecto en IntelliJ IDEA.

Ejecuta la clase Main.java.

## Funcionalidades principales
- Agregar, mostrar, buscar y eliminar materiales (libros, revistas, periódicos).
- Separación de usuarios (Estudiante, Bibliotecario).
- Interfaces para manejar acciones de préstamo, usuario, y visualización.
- Aplicación de principios SOLID y buenas prácticas de diseño.

## Objetivos de aprendizaje
Este proyecto fue creado con el objetivo de:

- Aplicar programación orientada a objetos desde cero.
- Comprender y aplicar los principios SOLID.
- Documentar decisiones técnicas usando ADRs.
- Estructurar código de manera profesional y mantenible.

## Decisiones arquitectónicas
Consulta el directorio /docs/adr para ver las decisiones técnicas tomadas durante el desarrollo.

## Demo

📽️ Mira la demo del proyecto en YouTube:  
🔗 [https://youtu.be/eH3GdHYvIIk](https://youtu.be/eH3GdHYvIIk)

## Autor
Jaime Alberto Suárez Moctezuma
Estudiante de Ingeniería en Sistemas Computacionales
LinkedIn: www.linkedin.com/in/jaime-alberto-suarez-moctezuma-410128269
