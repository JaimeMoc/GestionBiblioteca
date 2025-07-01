# ADR 006 - Uso de lista para almacenar materiales

## Estado
Aceptada

## Contexto
Se necesita almacenar múltiples materiales bibliográficos en la clase `Biblioteca`.

## Decisión
Usar una `List<MaterialBibliografico>` para agregar, buscar y eliminar materiales.

## Alternativas consideradas
- Usar un `Map<Integer, MaterialBibliografico>` para acceso más rápido por ID.
- Usar una base de datos desde el inicio.

## Consecuencias
- Implementación sencilla y efectiva para el alcance actual.
- En el futuro podría ser reemplazada por una estructura más eficiente.

## Fecha
30/06/2025

## Autor
Jaime Moc