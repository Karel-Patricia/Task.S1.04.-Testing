# Tarea S1.04 - Testing

**Objetivos**: 
Organizar correctamente un proyecto Java con Maven o Gradle , incluyendo las dependencias necesarias para realizar tests.
Escribir y ejecutar pruebas unitarias con JUnit 5 para verificar el comportamiento de clases y métodos.
Utilizar AssertJ para realizar aserciones claras, precisas y expresivas.
Aplicar el ciclo de TDD (test, implementación, refactorización) en el desarrollo de funcionalidades básicas.
Escribir código modular y testeable , separando claramente la lógica de negocio de los detalles de entrada/salida.

## 📌 Nivel 1

### Ejercicio 1 – JUnit
Crea una clase Java que gestione una colección de libros de una biblioteca. Esta clase debe ofrecer las siguientes funcionalidades:

Añadir libros a la colección.
Recuperar la lista completa de libros (siguiendo el comando de inserción).
Obtener el título de un libro a partir de su posición.
Añadir un libro en una posición específica en la colección.
Eliminar un libro por su título.
Devolver una copia de la lista ordenada alfabéticamente .
Implementa test unitarios con JUnit 5 para validar el comportamiento de la clase. Asegúrate de cubrir, como mínimo, los siguientes casos:

La colección no debe ser nula después de instanciar la clase.
El tamaño de la colección es correcto después de añadir varios libros.
Los libros se encuentran en la posición esperada una vez añadidos.
El método para obtener un libro por posición devuelve el título correcto.
Añadir un libro en una posición concreta modifica correctamente la colección.
Eliminar un libro por el título reduce el tamaño de la colección.
La lista ordenada devuelve los libros en orden alfabético (sin modificar la colección original).
No deben permitirse libros con títulos duplicados.

### Ejercicio 2 – Test parametrizado
Crea una clase llamada CalculoDnique contenga un método público para calcular la letra correspondiente de un DNI, dado el número (sin letra).

Crea una clase de test con JUnit 5 que parametrice una serie de pruebas para validar el correcto comportamiento del cálculo.

El test debe comprobar como mínimo 10 casos de números de DNI distintos con su letra correspondiente, validando que el resultado del método coincide con el valor esperado.

También se deben validar valores inválidos , como números negativos o demasiado grandes, para comprobar que el método gestiona correctamente estas situaciones (por ejemplo, lanzando una excepción).

### Ejercicio 3 – Control de Excepciones
Crea una clase Java que contenga un método público que provoque una excepción del tipo ArrayIndexOutOfBoundsException. Este método puede, por ejemplo, intentar acceder a una posición inexistente de un array.

A continuación, implementa una clase de test con JUnit 5 que verifique que el método arroja la excepción esperada cuando se dan las condiciones correspondientes.


## 🛠️Tecnologías
- IntelliJ IDEA Java 21
- JUnit 5 & Maven 
- Git & GitHub 