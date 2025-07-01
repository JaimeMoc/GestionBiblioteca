# 📚 Gestión Biblioteca

Proyecto en Java orientado a objetos para la gestión de materiales bibliográficos en una biblioteca. Desarrollado con principios SOLID, buenas prácticas de POO y documentación mediante ADRs.

---

## 🛠️ Tecnologías utilizadas

- Java 8+
- IntelliJ IDEA (IDE recomendado)
- Programación Orientada a Objetos (POO)
- Principios SOLID
- Estructura modular (por paquetes)
- ADRs para decisiones arquitectónicas

---

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
