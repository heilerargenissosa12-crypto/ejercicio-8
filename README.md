# Ejercicio 8: Elon's Toys (Jedlik's Toy Car)

- **Concepto:** Classes & Constructors (Clases, atributos de instancia y estado)
- **Plataforma:** Exercism (Java Track)

## Descripción del Problema
Simular el funcionamiento de un auto de juguete a control remoto:
- Comienza con 100% de batería y 0 metros recorridos.
- Cada vez que se llama a `drive()`, avanza 20 metros y consume 1% de batería.
- Si la batería llega a 0%, no puede seguir avanzando.

## Tareas a Implementar en `ElonsToyCar.java`:
1. `buy()`: Método estático que instancia un auto nuevo.
2. `distanceDisplay()`: Muestra `"Driven <METROS> meters"`.
3. `batteryDisplay()`: Muestra `"Battery at <PORCENTAJE>%"` o `"Battery empty"` si la batería es 0.
4. `drive()`: Incrementa 20 metros y descuenta 1% si la batería > 0.

## Cómo ejecutar en Visual Studio / VS Code:
Abre `Main.java` y haz clic en **Run** o presiona `F5`.
