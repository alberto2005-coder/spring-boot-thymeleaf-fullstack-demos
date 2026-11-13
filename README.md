# Spring Boot + Thymeleaf — demos full-stack

[![Java](https://img.shields.io/badge/Java-21%2B-ED8B00?logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Thymeleaf](https://img.shields.io/badge/Thymeleaf-SSR-005F0F)](https://www.thymeleaf.org/)
[![MIT](https://img.shields.io/badge/Licencia-MIT-green)](LICENSE)

[Español](#español) · [English](#english)

---

## Español

### Índice

- [Descripción](#descripción)
- [Los dos proyectos](#los-dos-proyectos)
- [Estructura del repositorio](#estructura-del-repositorio)
- [Requisitos](#requisitos)
- [Ejecución](#ejecución)
- [Rutas de prueba](#rutas-de-prueba)
- [Licencia](#licencia)

### Descripción

Repositorio con **dos proyectos didácticos** de **Spring Boot 3** y **Thymeleaf** que van de lo más básico a algo más elaborado: pasar cadenas a una plantilla y, después, objetos completos y listas con `th:each`. Sirven como punto de partida para renderizado del lado del servidor (SSR).

### Los dos proyectos

**1. Web dinámica (básico)** — `webdinamica/webdinamica`

- Demuestra cómo un `@Controller` pasa datos simples a una vista HTML.
- Usa `@GetMapping`, la interfaz `Model` y `th:text`.
- Una sola ruta de prueba: `/pruebas`.

**2. Web avanzada (intermedio)** — `web-avanzada`

- Introduce el modelo `Producto` y listas de objetos.
- Renderiza objetos con `th:text="${objeto.propiedad}"` e itera con `th:each`.
- Combina un controlador MVC (`UserController`) con un controlador REST (`ProductController` bajo `/api`).

### Estructura del repositorio

```text
spring-boot-thymeleaf-fullstack-demos/
├── webdinamica/
│   └── webdinamica/          # Proyecto básico
│       ├── src/main/java/com/example/webdinamica/
│       └── src/main/resources/templates/
├── web-avanzada/             # Proyecto intermedio
│   ├── src/main/java/com/example/web/avanzada/
│   │   ├── controller/ProductController.java  # /api (JSON)
│   │   ├── controller/UserController.java     # vistas HTML
│   │   └── model/Producto.java
│   └── src/main/resources/templates/
│       ├── pruebas.html
│       ├── contacto.html
│       └── productos/ver_productos.html
├── LICENSE
└── README.md
```

### Requisitos

- **Java 21** o superior.
- **Maven** (opcional: ambos proyectos incluyen `mvnw`).
- Un IDE compatible con Java (IntelliJ IDEA, Eclipse, VS Code).

### Ejecución

Los proyectos se ejecutan por separado y comparten el puerto 8080, así que arranca uno cada vez.

**Web dinámica**

```bash
cd webdinamica/webdinamica
./mvnw spring-boot:run        # Windows: mvnw.cmd spring-boot:run
```

**Web avanzada**

```bash
cd web-avanzada
./mvnw spring-boot:run        # Windows: mvnw.cmd spring-boot:run
```

### Rutas de prueba

| Proyecto | Ruta | Qué muestra |
|---|---|---|
| Web dinámica | `/pruebas` | Cadena pasada desde el controlador |
| Web avanzada | `/pruebas` | Texto y datos simples en plantilla |
| Web avanzada | `/contacto` | Un objeto `Producto` en la vista |
| Web avanzada | `/productos` | Lista de productos con `th:each` |
| Web avanzada | `/api/users` | JSON de ejemplo |
| Web avanzada | `/api/create` | `POST` que devuelve el cuerpo modificado |

> [!NOTE]
> El README original mencionaba `/producto/ver` y `/producto/lista`; las rutas reales del código son `/productos`, `/contacto` y `/pruebas`.

### Licencia

**MIT** — consulta [LICENSE](LICENSE).

---

## English

### Table of contents

- [Overview](#overview)
- [The two projects](#the-two-projects)
- [Repository structure](#repository-structure)
- [Requirements](#requirements)
- [Running](#running)
- [Test routes](#test-routes)
- [License](#license)

### Overview

A repository with **two teaching projects** built on **Spring Boot 3** and **Thymeleaf**, moving from the basics to something more elaborate: passing strings to a template, then whole objects and lists with `th:each`. They work as a starting point for server-side rendering (SSR).

### The two projects

**1. Dynamic web (basic)** — `webdinamica/webdinamica`

- Shows how a `@Controller` passes simple data to an HTML view.
- Uses `@GetMapping`, the `Model` interface and `th:text`.
- A single test route: `/pruebas`.

**2. Advanced web (intermediate)** — `web-avanzada`

- Introduces the `Producto` model and lists of objects.
- Renders objects with `th:text="${object.property}"` and iterates with `th:each`.
- Combines an MVC controller (`UserController`) with a REST controller (`ProductController` under `/api`).

### Repository structure

```text
spring-boot-thymeleaf-fullstack-demos/
├── webdinamica/
│   └── webdinamica/          # Basic project
│       ├── src/main/java/com/example/webdinamica/
│       └── src/main/resources/templates/
├── web-avanzada/             # Intermediate project
│   ├── src/main/java/com/example/web/avanzada/
│   │   ├── controller/ProductController.java  # /api (JSON)
│   │   ├── controller/UserController.java     # HTML views
│   │   └── model/Producto.java
│   └── src/main/resources/templates/
│       ├── pruebas.html
│       ├── contacto.html
│       └── productos/ver_productos.html
├── LICENSE
└── README.md
```

### Requirements

- **Java 21** or later.
- **Maven** (optional: both projects include `mvnw`).
- A Java-compatible IDE (IntelliJ IDEA, Eclipse, VS Code).

### Running

The projects run independently and share port 8080, so start one at a time.

**Dynamic web**

```bash
cd webdinamica/webdinamica
./mvnw spring-boot:run        # Windows: mvnw.cmd spring-boot:run
```

**Advanced web**

```bash
cd web-avanzada
./mvnw spring-boot:run        # Windows: mvnw.cmd spring-boot:run
```

### Test routes

| Project | Route | What it shows |
|---|---|---|
| Dynamic web | `/pruebas` | A string passed from the controller |
| Advanced web | `/pruebas` | Simple text and data in a template |
| Advanced web | `/contacto` | A `Producto` object in the view |
| Advanced web | `/productos` | A product list rendered with `th:each` |
| Advanced web | `/api/users` | Sample JSON |
| Advanced web | `/api/create` | A `POST` that echoes the body back modified |

> [!NOTE]
> The original README mentioned `/producto/ver` and `/producto/lista`; the routes actually implemented are `/productos`, `/contacto` and `/pruebas`.

### License

**MIT** — see [LICENSE](LICENSE).
