# DAA PRÁCTICA 1 - Análisis de Algoritmos de Multiplicación de Matrices

Este proyecto implementa el **Patrón de Diseño Estrategia (Strategy Pattern)** para comparar el rendimiento de diferentes algoritmos de multiplicación de matrices en Java. El objetivo principal es analizar empíricamente la complejidad temporal $O(n^3)$ variando el tamaño de las instancias.

## 📋 Requisitos Previos

* **Java JDK 21** (Se recomienda Eclipse Adoptium o OpenJDK).
* **Terminal Bash** (Linux/macOS) o PowerShell (Windows).
* El proyecto incluye **Gradle Wrapper**, por lo que no necesitas instalar Gradle globalmente.

## 🚀 Instalación y Ejecución

Sigue estos pasos para poner en marcha el benchmark:

### 1. Clonar o descargar el proyecto
Asegúrate de estar en la carpeta raíz del proyecto (donde se encuentra el archivo `build.gradle`).

### 2. Configurar permisos (Solo Linux/macOS)
Antes de ejecutar por primera vez, otorga permisos de ejecución al script de Gradle:

```bash
chmod +x gradlew
```
Para ejecutar el benchmark:
```bash
./gradlew run
```
Salida sin mensajes de gradle:
```bash
./gradlew run -q --console=plain
```
Para limpieza del proyecto
```bash
./gradlew clean build
```
