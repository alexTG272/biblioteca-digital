
# Biblioteca Digital - Microservicios
Este proyecto consiste en un microservicio desarrollado EN SPRING BOOT para la gestion de libros y prestamos, El objetivo es establecer las bases del flujo de trabajo mediante un repositorio bajo la metodologia devops.

Integrantes: Martina Flores y Alexander torres

# Tecnologias utilizadas
Control de versiones: Git & Github
CI/CD: Github Actions

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


Captura de pantallas mediante un pdf
PDF:[Eva1_ing_devops (1).pdf](https://github.com/user-attachments/files/26731082/Eva1_ing_devops.1.pdf)

# Actualizacion de la segunda evaluacion 

Para esta evaluacion configuramos un pipeline de integracion y diseño continuo CI/CD mediante Github Actions esto permite verificar y compilar el codigo de forma secuencial pasando por la dependencia de seguridad de Snyk que ayuda a verificar la seguridad de las depedencias y vulneravilidades del codigo y por ultimo se implemento el uso de docker que gracias a este se garantiza la portabilidad y orquestación del sistema completo, permitiendo desplegar la aplicación de manera estandarizada, segura y eficiente en cualquier entorno de infraestructura con un solo comando.

Aqui algunas evidencias del trabajo realizado 

Distribucion de los archivos del proyecto 
<img width="169" height="332" alt="image" src="https://github.com/user-attachments/assets/472bb1be-908a-44b4-bfad-303ce2b3ccc1" />

Pruebas realizadas 
<img width="1149" height="304" alt="Captura de pantalla 2026-05-25 165447" src="https://github.com/user-attachments/assets/a761b065-1205-4ecb-893e-164cc9ee6346" />

Levantar Imagenes y contenedores
<img width="1134" height="309" alt="Captura de pantalla 2026-05-25 170240" src="https://github.com/user-attachments/assets/47665a0f-bedd-4fb5-9766-d8514d5cc15d" />

Pipeline funcional 
<img width="1359" height="554" alt="image" src="https://github.com/user-attachments/assets/d164a75b-1c0e-49f1-bfc6-a7ad2b7c27a3" />


