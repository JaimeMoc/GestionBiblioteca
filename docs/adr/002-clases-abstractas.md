# ADR 002 - Uso de clases abstractas para entidades base

## Estado
Aceptada

## Contexto
Existen entidades con atributos y métodos comunes, como los usuarios o los materiales bibliográficos.

## Decisión
Crear clases abstractas `Usuario` y `MaterialBibliografico` que serán extendidas por subclases concretas.

## Alternativas consideradas
- Implementar todo desde cero en cada clase hija.
- Usar solo interfaces para definir comportamiento común.

## Consecuencias
- Menor duplicación de código.
- Mayor reutilización y claridad en la jerarquía.

## Fecha
30/06/2025

## Autor
Jaime Moc