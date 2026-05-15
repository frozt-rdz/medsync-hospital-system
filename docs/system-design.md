# MedSync Hospital System

## 1. Descripción General

MedSync es un sistema hospitalario concurrente desarrollado en Java con arquitectura modular. El sistema permite gestionar pacientes, doctores, citas médicas, asignación de salas y visualización de información en tiempo real mediante una interfaz gráfica moderna.

El proyecto busca integrar:
- interfaces gráficas,
- programación concurrente,
- acceso a bases de datos,
- arquitectura de software,
- y desarrollo móvil.

---

## 2. Objetivos del Sistema

### Objetivo General
Desarrollar un sistema hospitalario modular y concurrente que permita administrar procesos clínicos y demostrar buenas prácticas de ingeniería de software.

### Objetivos Técnicos
- Implementar arquitectura MVC.
- Aplicar programación concurrente con hilos.
- Gestionar datos mediante PostgreSQL.
- Construir una interfaz gráfica profesional con JavaFX.
- Integrar autenticación y control de roles.
- Desarrollar una aplicación móvil complementaria.

---

## 3. Tecnologías Utilizadas

| Tecnología | Uso |
|---|---|
| Java 21 | Backend y lógica |
| JavaFX | Interfaz gráfica |
| PostgreSQL | Base de datos |
| JDBC | Conexión a BD |
| Maven | Gestión de dependencias |
| Git/GitHub | Control de versiones |

---

## 4. Arquitectura del Sistema

El proyecto seguirá una arquitectura MVC (Model-View-Controller) y una estructura en capas.

### Capas principales:
- Models
- Repositories
- Services
- Controllers
- Views

---

## 5. Módulos del Sistema

### Desktop Application
- Login
- Dashboard
- Gestión de pacientes
- Gestión de doctores
- Gestión de citas
- Gestión de salas

### Backend
- Lógica de negocio
- Persistencia de datos
- Concurrencia
- Seguridad

### Mobile App
- Consulta de citas
- Visualización de turnos
- Notificaciones

---

## 6. Características de Concurrencia

El sistema implementará programación concurrente para:
- asignación segura de salas,
- actualización en tiempo real,
- procesamiento simultáneo de usuarios,
- manejo de múltiples operaciones.

Se utilizarán:
- Threads
- synchronized
- ExecutorService
- ReentrantLock

---

## 7. Base de Datos

Entidades principales:
- usuarios
- roles
- pacientes
- doctores
- citas
- salas
- historial_medico

---

## 8. Estado Actual del Proyecto

Fase actual:
- Diseño inicial del sistema
- Planeación de arquitectura
- Configuración del entorno
