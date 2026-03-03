# Spring Boot Thymeleaf Fullstack Demos

[Español](#español) | [English](#english)

---

<a id="español"></a>
# 🇪🇸 Guía del Proyecto (Español)

Este repositorio contiene dos proyectos demostrativos construidos con **Spring Boot 3** y **Thymeleaf**, diseñados para ilustrar desde conceptos básicos de renderizado web hasta integraciones más avanzadas con modelos de datos y colecciones.

## 📑 Índice
1. [Descripción General](#descripción-general)
2. [Estructura del Repositorio](#estructura-del-repositorio)
3. [Requisitos Previos](#requisitos-previos)
4. [Instalación y Ejecución](#instalación-y-ejecución)
5. [Detalle de los Proyectos](#detalle-de-los-proyectos)
    - [Web Dinámica (Básico)](#1-web-dinámica-básico)
    - [Web Avanzada (Intermedio)](#2-web-avanzada-intermedio)

## Descripción General
El objetivo de estos proyectos es proporcionar una base sólida para el desarrollo full-stack utilizando el ecosistema de Spring y motores de plantillas del lado del servidor.

## Estructura del Repositorio
```text
spring-boot-thymeleaf-fullstack-demos/
├── webdinamica/          # Proyecto básico de introducción a Thymeleaf
│   └── webdinamica/      # Código fuente del proyecto básico
└── web-avanzada/         # Proyecto intermedio con modelos y colecciones
```

## Requisitos Previos
Para ejecutar estos proyectos, necesitas tener instalado:
*   **Java 21** o superior.
*   **Maven** (opcional, ya que se incluye el Maven Wrapper `mvnw`).
*   Un IDE compatible con Java (IntelliJ IDEA, Eclipse, VS Code, etc.).

## Instalación y Ejecución

Ambos proyectos se ejecutan de manera independiente. Sigue estos pasos para arrancar cualquiera de ellos:

1.  **Clona el repositorio:**
    ```bash
    git clone <url-del-repositorio>
    cd spring-boot-thymeleaf-fullstack-demos
    ```

2.  **Ejecuta "Web Dinámica" (Básico):**
    ```bash
    cd webdinamica/webdinamica
    ./mvnw spring-boot:run
    ```
    *La aplicación estará disponible en `http://localhost:8080` (endpoint de prueba: `/pruebas`).*

3.  **Ejecuta "Web Avanzada" (Intermedio):**
    ```bash
    cd web-avanzada
    ./mvnw spring-boot:run
    ```
    *La aplicación estará disponible en `http://localhost:8080` (endpoints de prueba: `/producto/ver`, `/producto/lista`).*

---

## Detalle de los Proyectos

### 1. Web Dinámica (Básico)
Ubicación: `webdinamica/webdinamica`

Este proyecto es una introducción guiada a Spring Boot MVC y Thymeleaf.
*   **Objetivo**: Demostrar cómo pasar datos simples (Strings) desde un Controlador de Spring a una vista HTML.
*   **Características clave**:
    *   Uso de `@Controller` y `@GetMapping`.
    *   Inyección de datos mediante la interfaz `Model`.
    *   Renderizado en Thymeleaf con atributos como `th:text`.

### 2. Web Avanzada (Intermedio)
Ubicación: `web-avanzada`

Este proyecto sube el nivel introduciendo conceptos de Programación Orientada a Objetos (POO) en las vistas.
*   **Objetivo**: Mostrar cómo manejar objetos Java complejos y listas de objetos dentro del motor de plantillas.
*   **Características clave**:
    *   Creación de clases de Modelo (ej. `Producto`).
    *   Paso de objetos completos a la vista (`th:text="${objeto.propiedad}"`).
    *   Iteración de listas y colecciones usando `th:each` para generar listados HTML dinámicos (`<ul>`, `<li>`, `<table>`).

---
---

<a id="english"></a>
# 🇬🇧 Project Guide (English)

This repository contains two demonstration projects built with **Spring Boot 3** and **Thymeleaf**, designed to illustrate everything from basic web rendering concepts to more advanced integrations with data models and collections.

## 📑 Table of Contents
1. [General Description](#general-description)
2. [Repository Structure](#repository-structure)
3. [Prerequisites](#prerequisites)
4. [Installation and Execution](#installation-and-execution)
5. [Project Details](#project-details)
    - [Dynamic Web (Basic)](#1-dynamic-web-basic)
    - [Advanced Web (Intermediate)](#2-advanced-web-intermediate)

## General Description
The goal of these projects is to provide a solid foundation for full-stack development using the Spring ecosystem and server-side template engines.

## Repository Structure
```text
spring-boot-thymeleaf-fullstack-demos/
├── webdinamica/          # Basic introductory project to Thymeleaf
│   └── webdinamica/      # Source code for the basic project
└── web-avanzada/         # Intermediate project with models and collections
```

## Prerequisites
To run these projects, you need to have installed:
*   **Java 21** or higher.
*   **Maven** (optional, as the Maven Wrapper `mvnw` is included).
*   A Java-compatible IDE (IntelliJ IDEA, Eclipse, VS Code, etc.).

## Installation and Execution

Both projects run independently. Follow these steps to start either of them:

1.  **Clone the repository:**
    ```bash
    git clone <repository-url>
    cd spring-boot-thymeleaf-fullstack-demos
    ```

2.  **Run "Dynamic Web" (Basic):**
    ```bash
    cd webdinamica/webdinamica
    ./mvnw spring-boot:run
    ```
    *The application will be available at `http://localhost:8080` (test endpoint: `/pruebas`).*

3.  **Run "Advanced Web" (Intermediate):**
    ```bash
    cd web-avanzada
    ./mvnw spring-boot:run
    ```
    *The application will be available at `http://localhost:8080` (test endpoints: `/producto/ver`, `/producto/lista`).*

---

## Project Details

### 1. Dynamic Web (Basic)
Location: `webdinamica/webdinamica`

This project is a guided introduction to Spring Boot MVC and Thymeleaf.
*   **Goal**: Demonstrate how to pass simple data (Strings) from a Spring Controller to an HTML view.
*   **Key Features**:
    *   Use of `@Controller` and `@GetMapping`.
    *   Data injection using the `Model` interface.
    *   Rendering in Thymeleaf with attributes like `th:text`.

### 2. Advanced Web (Intermediate)
Location: `web-avanzada`

This project raises the bar by introducing Object-Oriented Programming (OOP) concepts into the views.
*   **Goal**: Show how to handle complex Java objects and lists of objects within the template engine.
*   **Key Features**:
    *   Creation of Model classes (e.g., `Product`).
    *   Passing entire objects to the view (`th:text="${object.property}"`).
    *   Iterating over lists and collections using `th:each` to generate dynamic HTML lists (`<ul>`, `<li>`, `<table>`).
