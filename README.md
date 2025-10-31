# Procesador de Texto Básico en Java.

El objetivo de esta actividad es desarrollar un pequeño procesador de texto que
trabaje sobre una única frase de entrada. Se debe aplicar los principios de la
Programación Orientada a Objetos para estructurar la solución en tres clases distintas:

## ProcesadorTexto, MenuProcesador y TestProcesador.

### 1. Clase ProcesadorTexto.

**Esta** clase debe encapsular la frase con la que se trabaja y proveer todos los méto-
dos para manipular y analizar dicho texto.

#### Atributos:

- Un atributo de tipo `String` para almacenar la frase con la que trabajará el procesador.
  Se recomienda inicializar la frase mediante el constructor de la clase.

#### Métodos a Desarrollar:

| Método                                                                                                              | Descripción                                         | Requisitos                                                                                              |
| ------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| `contarPalabras()`                                                                                                  | Devuelve el número total de palabras en la frase.   | Debe manejar correctamente múltiples espacios entre palabras y posibles espacios al inicio/final.       |
| `contarCaracteres()`                                                                                                | Devuelve el número total de caracteres de la frase. | Debe incluir todos los caracteres (letras, espacios, signos de puntuación, etc.).                       |
| `buscarPalabra(String palabra)`                                                                                     | Busca la palabra indicada y devuelve su posición.   | Si la palabra existe, devuelve el índice de inicio de la primera ocurrencia. Si no existe, devuelve -1. |
| ` ponerEnMayusculas()`                                                                                              | Convierte toda la frase a mayúsculas.               | El método debe modificar el atributo frase y no solo devolver una versión en mayúsculas.                |
| `ponerEnMinusculas()`                                                                                               | Convierte toda la frase a minúsculas.               | El método debe modificar el atributo frase y no solo devolver una versión en minúsculas.                |
| `anyadirCaracter(char caracter, int posicion)`                                                                      | Añade un carácter en la posición especificada.      | Debe validar que la posición sea válida (entre 0 y la longitud de la frase). Si no es válida, no modifica la frase. |
| `obtenerFrase()`                                                                                                    | Devuelve la frase actual del procesador.            | Método `getter` esencial para mostrar el estado actual en el menú.                                      |

### 2. Clase MenuProcesador (Interfaz de Usuario)

Esta clase será la encargada de interactuar con el usuario, mostrar las opciones disponibles y llamar a los métodos de la clase ProcesadorTexto.

#### Atributos:

- Un objeto de tipo `ProcesadorTexto` para acceder a su funcionalidad.

- Un objeto `Scanner` para la entrada de datos por consola.

#### Métodos a Desarrollar:

| Método                | Descripción                                                                                                                                                                                                                                                                                                                                   |
| --------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `mostrarMenu()`       | Muestra por consola las opciones disponibles al usuario.                                                                                                                                                                                                                                                                                      |
| `gestionarOpciones()` | Implementa un bucle `do-while` o `while` y una estructura switch que permite al usuario seleccionar repetidamente una opción del menú hasta que decida salir. Cada opción debe solicitar al usuario los datos necesarios (p. ej., la palabra a buscar, el carácter a añadir, la posición, etc.) y mostrar el resultado claro de la operación. |

#### Opciones del Menú:

1. Contar palabras.

2. Contar caracteres.

3. Buscar palabra.

4. Poner frase en mayúsculas.

5. Poner frase en minúsculas.

6. Añadir carácter en posición.

7. Mostrar frase actual.

8. Salir.

### 3. Clase TestProcesador (Clase Principal)

Esta clase debe contener el método main para iniciar la aplicación.

#### Tareas:

1. Solicitar al usuario que introduzca la frase inicial con la que trabajará el procesador.

2. Instanciar un objeto de la clase ProcesadorTexto con la frase introducida.

3. Instanciar un objeto de la clase MenuProcesador, pasándole el objeto ProcesadorTexto creado en el paso anterior (mediante el constructor).

4. Llamar al método que inicia la gestión del menú.

5. Probar el uso de los métodos del menú.

## Autor
> [!NOTE]
> La autoría de este ejercicio no me pertenece, solo su respuesta.

[![GaysperVT](https://github.com/Gaysper-Coder/.github/blob/main/Gayspear_Logo.png?raw=true)](https://www.twitch.tv/gayspervt)


