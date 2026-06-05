## Taller 1 - Sistema de Gestión Pokémon

Proyecto desarrollado en Java que modela un sistema básico de gestión de Pokémon, entrenadores, ataques, estadísticas, evoluciones y validaciones personalizadas mediante excepciones.

## 📌 Descripción

Este proyecto tiene como objetivo representar entidades del universo Pokémon aplicando principios de programación orientada a objetos. Incluye modelos para Pokémon, ataques, entrenadores, tipos, estadísticas y evoluciones, además de excepciones personalizadas para controlar errores de validación dentro del sistema.

El sistema permite estructurar información relacionada con Pokémon y sus características principales, facilitando la práctica de conceptos como clases, encapsulamiento, paquetes, enums, manejo de excepciones y organización de proyectos Java.

## 🚀 Tecnologías utilizadas

- Java
- JDK 26
- IntelliJ IDEA
- Programación Orientada a Objetos

## 📁 Estructura del proyecto
```
text
taller1/
├── src/
│   └── com.duoc.pokemon/
│       ├── exception/
│       │   ├── AtaqueInvalidoException
│       │   ├── EvolucionInvalidaException
│       │   ├── ExcepcionPokemon
│       │   ├── NivelInvalidoException
│       │   ├── NombreInvalidoException
│       │   └── TipoInvalidoException
│       │
│       ├── main/
│       │   └── Main
│       │
│       ├── model/
│       │   ├── Ataque
│       │   ├── Entrenador
│       │   ├── Estadistica
│       │   ├── Evolucion
│       │   ├── Pokemon
│       │   └── TipoPokemon
│       │
│       └── pokemon/
│
└── taller1.iml
```
## 🧩 Funcionalidades principales

- Modelado de Pokémon con sus atributos principales.
- Gestión de ataques y sus características.
- Representación de entrenadores Pokémon.
- Manejo de estadísticas asociadas a los Pokémon.
- Definición de evoluciones.
- Clasificación de Pokémon por tipo.
- Validaciones mediante excepciones personalizadas.
- Organización del código en paquetes según responsabilidad.

## 🧠 Conceptos aplicados

Este proyecto permite practicar y reforzar los siguientes conceptos:

- Clases y objetos.
- Constructores.
- Encapsulamiento.
- Métodos sobrescritos como `toString()`.
- Enumeraciones.
- Excepciones personalizadas.
- Separación de responsabilidades por paquetes.
- Buenas prácticas de estructura en proyectos Java.

## ⚙️ Requisitos

Para ejecutar el proyecto necesitas tener instalado:

- Java JDK 26 o superior.
- IntelliJ IDEA u otro IDE compatible con Java.

## ▶️ Ejecución del proyecto

1. Clona o descarga este repositorio.
```
bash
git clone <URL_DEL_REPOSITORIO>
```
2. Abre el proyecto en IntelliJ IDEA.

3. Verifica que el SDK configurado sea Java 26.

4. Ejecuta la clase principal ubicada en:
```
text
src/com.duoc.pokemon/main/Main
```
## 🏗️ Paquetes del proyecto

### `com.duoc.pokemon.model`

Contiene las clases principales del dominio del sistema, como Pokémon, ataques, entrenadores, estadísticas, evoluciones y tipos de Pokémon.

### `com.duoc.pokemon.exception`

Contiene las excepciones personalizadas utilizadas para validar datos y controlar errores específicos del sistema.

### `com.duoc.pokemon.main`

Contiene la clase principal desde donde se puede ejecutar la aplicación.

## 🛡️ Manejo de excepciones

El proyecto incluye excepciones propias para representar errores específicos del dominio Pokémon, tales como:

- Ataques inválidos.
- Evoluciones inválidas.
- Niveles inválidos.
- Nombres inválidos.
- Tipos inválidos.

Esto permite que el sistema sea más claro, mantenible y fácil de depurar.

## 📚 Objetivo académico

Este proyecto fue desarrollado como parte de un taller académico, con el propósito de aplicar conocimientos fundamentales de Java y programación orientada a objetos en un contexto práctico y organizado.

## 👨‍💻 Autor

Proyecto desarrollado por Camilo Hidalgo, estudiante de DUOC UC.

## 📄 Licencia

Este proyecto tiene fines educativos. Puedes utilizarlo, modificarlo y adaptarlo para aprendizaje personal o académico.
```