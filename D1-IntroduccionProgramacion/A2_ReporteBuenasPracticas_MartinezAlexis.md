# Actividad 2 — Reporte de Buenas Prácticas y Documentación de Código

**Alumno:** Alexis Daniel Martinez Mendoza  
**Grupo:** 2DSM-G3   
**Fecha:** 14/01/2026  
**Unidad:** 1

## 1. Objetivo del reporte
- Tener mayor s kills sobre estos lenguajes los cuales nos ayudaran en el ambitolaboral
- Documentar el trabajo para asi tenerlo de apoyo en un futuro

## 2. Buenas prácticas de codificación
### 2.1 Nombres de variables

- Descriptivas: Son nombres que explican claramente qué almacena la variable.

Ejemplo: edadUsuario, totalVentas
- Constantes: Se escriben en MAYÚSCULAS_CON_GUIONES.

Ejemplo: MAX_INTENTOS, PI, VELOCIDAD_LUZ.
- Booleanos: Normalmente empiezan con palabras como: is, has, can, should.

Ejemplos:
isActive,
hasPermission,
canLogin.

- Arreglos: Sus nombres suelen estar en plural.

Ejemplos:
usuarios,
numeros,
productos.

- Contadores e Indices: Son cortos, pero entendibles.

Ejemplos:
i, j, k (para ciclos simples),
contador,
indice.

- Objetos: Representan entidades del sistema.

Ejemplos:
usuario,
producto
cliente.

- Variables Temporales: Cuando solo viven unos segundos en el código.

Ejemplos:
temp,
aux,
buffer.

### 2.2 Comentarios
- Cuándo comentar: 

-Cuando el código es complejo o no se entiende fácilmente.

-Cuando se toma una decisión técnica importante.

-Para advertencias o comportamientos especiales.

-Para explicar el propósito de una función, clase o módulo.
- Qué evitar:

-Evitar comentar cosas obvias.

-No repetir lo que ya dice el nombre de la variable o función.

-Evitar comentarios desactualizados.

### 2.3 Estructura del código
- Indentación: La identación es la forma de ordenar el código usando espacios para mostrar qué instrucciones pertenecen a qué bloque.
- Modularidad:
La modularidad consiste en dividir el programa en partes pequeñas, ordenadas y reutilizables (funciones, clases o módulos).

- Evitar duplicidad: Consiste en evitar escribir el mismo código varias veces.

## 3. Documentación del código
### 3.1 Estándares
- Estándar elegido: Markdown
- Elementos recomendados: 

-Descripción del proyecto

-Requisitos / dependencias

-Guía de instalación

-Ejemplos de uso

-Explicación de cada módulo o componente

-Comentarios en el código usando formato estándar

-Ejemplo estilo Javadoc:


```java
/**
 * Calcula el área de un círculo.*
 * @param radio - Radio del círculo.
 * @return Área calculada.
 */
public double calcularArea(double radio) { ... }
```


Licencia (si aplica)

Changelog:
Registro de cambios entre versiones.

### 3.2 Herramientas / enfoque
- README: Documento principal del proyecto, normalmente en README.md. 
- Generadores de documentacion: Crean documentación automáticamente a partir de comentarios en el código:

Java: Javadoc

Python: Sphinx, pdoc

JavaScript: JSDoc, TypeDoc

C/C++: Doxygen

C#: XML Documentation + Sandcastle

- Extensiones:
VS Code, IntelliJ / Eclipse, GitHub.

- Ventajas:

-Ayuda a encontrar errores más rápido

-Estandariza el proyecto

-Reduce el tiempo de aprendizaje

-Aumenta la calidad del software

## 4. Ejemplos prácticos
### 4.1 Antes / Después (Ejemplo 1)
**Antes:**
```java
String n = "Verstappen";
double t = 1.23;
System.out.println(n + t);
```

**Después**
```java
// Nombre del piloto de F1
String nombrePiloto = "Verstappen";

// Tiempo de vuelta en minutos
double tiempoDeVuelta = 1.23;

// Mostrar información de forma clara
System.out.println("Piloto: " + nombrePiloto + " | Tiempo: " + tiempoDeVuelta + " min");
```

### 4.2 Antes / Después (Ejemplo 2)

**Antes:**
```java
double v1 = 320;
double v2 = 315;
if(v1>v2){
System.out.println("a");
} else {
System.out.println("b");
}
```

**Después**
```java
// Velocidades máximas de los autos de F1 en km/h
double velocidadFerrari = 320;
double velocidadMercedes = 315;

// Comparar velocidades de forma clara
if (velocidadFerrari > velocidadMercedes) {
    System.out.println("Ferrari es más rápido");
} else {
    System.out.println("Mercedes es más rápido");
}
```

### 4.3 Ejemplo de documentación
Registro de Parada en Pits (F1)

Este programa registra el nombre del piloto de Fórmula 1 y el tiempo que tardó en realizar su parada en pits. Después, muestra la información de forma clara en la consola. Este tipo de registro se usa para analizar el rendimiento del equipo durante una carrera.

- Requisitos

Lenguaje: Java

Editor de código (VS Code, IntelliJ, NetBeans)

- Funcionamiento

Se ingresa el nombre del piloto.

Se registra el tiempo de la parada en pits.

El programa muestra los datos formateados.

Ejemplo de uso

```java
String piloto = "Charles Leclerc";
double tiempoPitStop = 2.45;

System.out.println("Piloto: " + piloto + " | Pit Stop: " + tiempoPitStop + " segundos");
```
- Documentación interna

El código incluye comentarios que describen el propósito de la función y sus parámetros, siguiendo buenas prácticas.

- Autor

Alumno: Alexis Daniel Martinez Mndoza

Proyecto escolar sobre F1

- Ejemplo javadoc
```java
/**
 * Muestra el nombre del piloto y el tiempo de su parada en pits.
 *
 * @param nombrePiloto Nombre del piloto de Fórmula 1.
 * @param tiempoParada Tiempo registrado del pit stop en segundos.
 */
public void mostrarPitStop(String nombrePiloto, double tiempoParada) {
    // Imprime la información del pit stop en un formato claro
    System.out.println("Piloto: " + nombrePiloto + " | Pit Stop: " + tiempoParada + " s");
}

```
## 5. Recomendaciones finales

- Usa nombres descriptivos
- Usa siempre la misma cantidad de espacios
- Comenta lo necesario, no lo obvio
- Evita duplicar código
- Documenta con estándares
- Incluye un README en cada proyecto
- Piensa en quien leerá tu código

## 6. Fuentes consultadas

1. Oracle. “Java Code Conventions.”
https://www.oracle.com


2. Oracle. “How to Write Doc Comments for the Javadoc Tool.”
https://www.oracle.com


3. GitHub Guides. “Mastering Markdown.”
https://guides.github.com


4. Google. “Google Java Style Guide.” https://google.github.io/styleguide