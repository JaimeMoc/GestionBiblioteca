# ADR 004 - Separación de lógica de negocio y presentación

## Estado
Propuesta

## Contexto
Actualmente, la lógica de impresión está mezclada con la lógica del dominio (`System.out.println` en clases de negocio).

## Decisión
Separar la lógica de negocio de la lógica de presentación. Mover impresiones al `Main.java` o a clases específicas de vista.

## Alternativas consideradas
- Mantener la impresión directa en las clases de dominio.

## Consecuencias
- Mayor claridad del flujo de datos.
- Preparación para futuras interfaces gráficas o web (MVC).

## Fecha
30/06/2025

## Autor
Jaime Moc