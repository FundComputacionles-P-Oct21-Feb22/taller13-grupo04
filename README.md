# taller13

## Análisis de problemática

### Problema

Dado un número positivo, genere una miniespecificación que permita descomponer el número dado en unidades, decenas, centenas, etc.

**Ejemplo**: si el número es 1920 el resultado deberá ser similar a:
>
0 (0 unidades)
20 (2 decenas)
900 (9 centenas)
1000 (una unidad de millar)

Tomar en consideración lo siguiente:

- Se ingresa el número en una variale **k**
- Se guarda el número k en una variable temporal **k1**
- Se empieza un ciclo repetitivo mientras **k1** sea mayor a cero
	- Se calcula el residuo a través de: **k1** MOD 10
 	- Se presenta en pantalla lo siguiente en cada iteración: residuo * 10 elevado a la potencia **j**
 	- **j** es un contador que debe empezar inicializado en cero antes del iniciar el ciclo funcionará el exponente de posicionamiento de la descomposición
 	- **k1** toma un nuevo valor, realizado una división mediante la operación: **k1**/10 (dara el resultado entero de la división)
 	- Se incrementa el valor de **j** en uno.

Cuando se ejecuta una prueba de escritorio manual se debera obtener la siguiente salida: tomando como ejemplo 1920

```
0 * 10 elevado a la potencia  0
2 * 10 elevado a la potencia  1
9 * 10 elevado a la potencia  2
1 * 10 elevado a la potencia  3
```

* **Finalmente, debe usar de manera obligatoria dos funciones a parte de la función principal.** Ejemplo, se puede crear un función que calcule el residulo para MOD 10.

### Presentación

* Usar un archivo denominado **problematica.txt**
* Subir una imagen o archivo de la ejecución de la **prueba de escritorio** de la problemática.

### Bibliografía

* El ejemplo fue tomado y personalizado del libro:** [1] Mancilla, A., Ebratt, R. y Capacho, J. (2014)**. Diseño y construcción de
algoritmos. Barranquilla Universidad del Norte.