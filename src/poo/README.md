# Proyecto POO - Unidad 2: Relaciones entre Clases

Este proyecto amplía el sistema base de contenido audiovisual para aplicar los principios de la Programación Orientada a Objetos (POO), incluyendo herencia, agregación, composición y asociación.

## Autor

- **Sebastián Henao Zagal**
- Ingeniería en Software – Universidad Politécnica Salesiana
- Año lectivo: 2025

## Objetivo

Desarrollar un sistema en Java que modele clases relacionadas entre sí, implementando correctamente los principios de la POO y probando su funcionalidad en consola.

## Clases nuevas agregadas

| Clase            | Relacionada con    | Tipo de relación   |
|------------------|---------------------  |------------------------|
| `Actor`             | `Película`              | Agregación               |
| `Temporada`  | `SerieDeTV`        | Composición           |
| `Investigador`   | `Documental`         | Asociación         |
| `VideoClip`      | `ContenidoAudiovisual` | Herencia    |
| `ClaseVirtual`   | `ContenidoAudiovisual` | Herencia  |

## Estructura del proyecto
src/
├── poo/
│ └── PruebaAudioVisual.java
└── uni1a/
├── Película.java
├── SerieDeTV.java
├── Documental.java
├── Actor.java
├── Temporada.java
├── Investigador.java
├── VideoClip.java
└── ClaseVirtual.java
## Tecnologías usadas

- Java 17  
- Eclipse IDE  
- Git y GitHub  
- UML (diagrama incluido en el repositorio)

## Ejecución

1. Clonar el repositorio:  
   ```bash
   git clone https://github.com/JHST98/poo_unidad2.git
2. Abrir el proyecto en Eclipse

3. Ejecutar la clase:
poo.PruebaAudioVisual

4. Verificar en consola los resultados

## Diagrama UML
Abrir el proyecto en Eclipse

Ejecutar la clase:
poo.PruebaAudioVisual

Verificar en consola los resultados

## Diagrama UML
Disponible en el repositorio como imagen
Diagrama_UML.png