
# Biblioteca Digital - Microservicios
Este proyecto consiste en un microservicio desarrollado EN SPRING BOOT para la gestion de libros y prestamos, El objetivo es establecer las bases del flujo de trabajo mediante un repositorio bajo la metodologia devops.

Integrantes: Martina Flores y Alexander torres

# Tecnologias utilizadas
Control de versiones: Git & Github
CI/CD: Github Actions
Backend: Java & Spring Boot  
Orquestación y Contenedores: Docker & Kubernetes (vía Minikube)  
Monitoreo y Observabilidad: Prometheus & Grafana  

# GitFlow
Hemos implementado GitFlow como estrategia de ramificacion, organizando las ramas de cierta forma:
- Main: Rama de produccion.
- Develop: Rama de integracion, se fucionan las caracterisiticas terminadads.
- Feature: Ramas temporales para el desarrollo de las nuevas funcionalidades.
- Hotfix: rama para corregir los errores detectados en produccion.

# Flujo de trabajo
1. Crear una rama feature desde develop
2. hacer cambios
3. pull request hacia develop
4. hotfix hacia develop

# Convencion de commit 
Feat: Una nueva funcionalidad
fix: Correcion de errrires
Docs: Documentacion
Chore: Tareas de mantenimiento

# Arquitectura de Despliegue y Orquestación (Kubernetes)
El microservicio se despliega de manera automatizada dentro de un entorno local orquestado con Kubernetes, utilizando Minikube con el driver de Docker bajo entornos Windows (Docker Desktop).

# Monitoreo, Métricas y Dashboards (Prometheus & Grafana)
Para cumplir con las demandas de observabilidad y toma de decisiones operacionales, se integró una infraestructura con Prometheus (recolector de métricas/logs) y Grafana (visualización).


pdf de evidencias de evaluacion numero 3: [evidencias_ingeneriadevops.docx](https://github.com/user-attachments/files/29529717/evidencias_ingeneriadevops.docx)
