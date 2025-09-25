# 📘 Proyecto Empleado – Programación Orientada a Objetos (POO)

## 🧠 Descripción

Este proyecto implementa una clase `Empleado` en Java, aplicando los principios fundamentales de la Programación Orientada a Objetos. Incluye atributos encapsulados, constructores sobrecargados, métodos estáticos y sobrecargados, y una clase de prueba `Empleado_Main` que valida su funcionamiento.

- `Empleado.java`: define la clase con atributos, constructores, métodos y lógica de negocio.
- `Empleado_Main.java`: clase de prueba con método `main()` que crea instancias, actualiza salarios y muestra resultados.

---

## 🧱 Características implementadas

1. **Uso de `this`**
   - Se utiliza para distinguir entre parámetros y atributos en los constructores.

2. **Constructores sobrecargados**
   - Uno recibe todos los atributos (`id`, `nombre`, `puesto`, `salario`).
   - Otro recibe solo `nombre` y `puesto`, asignando un `id` automático y un salario por defecto.

3. **Métodos sobrecargados `actualizarSalario()`**
   - Uno recibe un porcentaje de aumento.
   - Otro recibe una cantidad fija a aumentar.

4. **Método `toString()`**
   - Muestra la información del empleado de forma legible: ID, nombre, puesto y salario.

5. **Método estático `mostrarTotalEmpleados()`**
   - Retorna el total de empleados creados hasta el momento.

6. **Encapsulamiento**
   - Todos los atributos son privados.
   - Se incluyen getters y setters para acceder y modificar los datos de forma controlada.

---

## 🧪 Ejecución de prueba (`Empleado_Main`)

La clase `Empleado_Main`:

- Instancia varios objetos usando ambos constructores.
- Aplica los métodos `actualizarSalario()` sobre distintos empleados.
- Imprime la información de cada empleado con `toString()`.
- Muestra el total de empleados creados con `mostrarTotalEmpleados()`.

---

## 🎯 Objetivos pedagógicos

- Comprender el uso de `this` para acceder a atributos de instancia.
- Aplicar constructores sobrecargados para flexibilizar la creación de objetos.
- Implementar métodos con el mismo nombre y distintos parámetros
