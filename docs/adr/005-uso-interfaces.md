# ADR 005 - Uso de interfaces para comportamiento común

## Estado
Aceptada

## Contexto
Varias clases comparten comportamientos comunes como ver perfil, gestionar préstamos o manipular materiales.

## Decisión
Definir interfaces como `GestionUsuario`, `GestionPrestamo`, `Manipulable` y `Ver` para abstraer estos comportamientos.

## Alternativas consideradas
- Duplicar los métodos en cada clase sin interfaz común.

## Consecuencias
- Mayor reutilización del código.
- Mejor polimorfismo y acoplamiento débil entre clases.

## Fecha
30/06/2025

## Autor
Jaime Moc