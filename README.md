# SCP Envolturas SAC

## Descripción del Proyecto
SCP Envolturas SAC es una aplicación de gestión desarrollada en Java con MySQL como gestor de base de datos. La aplicación permite la administración de cronogramas, requerimientos y órdenes de trabajo dentro de la empresa. Posee un sistema de autenticación que diferencia los accesos y funcionalidades entre los distintos tipos de usuarios: Empleados, Jefe de Ventas y Jefe de Producción.

## Funcionalidades Principales
### 1. Sistema de Login
- Permite el acceso al sistema con diferentes roles de usuario:
  - **Empleado**
  - **Jefe de Ventas**
  - **Jefe de Producción**

### 2. Menú Principal Según el Rol
- CADA VISUALIZACIÓN DE REGISTROS POSEE Filtros de fecha aplicados en orden ascendente y descendente con algoritmo QuickSort.
- **Empleado:**
  - Puede visualizar los cronogramas asignados.
- **Jefe de Ventas:**
  - Puede visualizar requerimientos.
  - Puede crear, modificar y eliminar órdenes de trabajo.
- **Jefe de Producción:**
  - Puede visualizar y crear requerimientos.
  - Puede crear órdenes de trabajo.
  - Puede crear cronogramas, los cuales se asignan a una órden de trabajo.

### 3. Relación de Datos
- Los cronogramas y las órdenes de trabajo tienen una relación uno a uno.
- Cada cronograma puede tener hasta 10 empleados con roles específicos:
  - Operario de Corte
  - Extrusión
  - Impresión
  - Laminado
  - Sellado

### 4. Operaciones sobre Registros
Cada módulo (Cronogramas, Requerimientos y Órdenes de Trabajo) permite:
- Visualizar registros
- Modificar registros
- Eliminar registros

## Tecnologías Utilizadas
- **Lenguaje de programación:** Java
- **Base de datos:** MySQL
- **Algoritmos:** QuickSort para ordenamiento de fechas
- **Arquitectura:** MVC

## Contacto
Para más información o consultas, puedes comunicarte con el equipo de desarrollo a través de [martin.quinones@unmsm.edu.pe].

