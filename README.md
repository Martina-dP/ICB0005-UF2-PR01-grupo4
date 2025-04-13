# UF2-PR01-GRUPO-4

🚗 Proyecto Vehículo en Java
Este proyecto consiste en la creación de una clase Vehiculo en Java, que representa un vehículo con múltiples atributos y funcionalidades para simular su comportamiento básico.

🛠️ Funcionalidades implementadas
La clase Vehiculo cuenta con los siguientes atributos:

marca (String), modelo (String), velocidadMaxima (int), velocidadMinima (int), velocidadActual (int),encendido o apagado (boolean), necesitaRepostar (boolean).

Métodos :

necesitaRepostar(): Devuelve si el vehículo requiere repostaje.  Responsable : Sandra 

encender() / apagar(): Enciende o apaga el motor. Responsable : Martina  

acelerar(int incremento): Aumenta la velocidad si está encendido.  Responsable : Martina 

frenar(int decremento): Reduce la velocidad actual.  Responsable : Eva 

parar(): Reduce la velocidad a cero.  Responsable : Sandra 

marchaAtras(): Activa la marcha atrás si el vehículo está detenido.  Responsable : Eva 

✅ Requisitos del repositorio
1. Repositorio en GitHub
Repositorio creado y accesible por todos los miembros del equipo.

Este README.md ha sido añadido y mantenido desde el principio del proyecto.

2. Protección de rama
Se ha protegido la rama main para:

Requerir Pull Request para hacer merge.

Exigir al menos una aprobación en cada revisión.

Validar que los tests pasen correctamente vía GitHub Actions.

3. Primeras ramas creadas
feature/añadir-gitignore: Añadido .gitignore con exclusión de archivos como .class, /target, .idea, etc.

Pull Request creado, revisado por un compañero y mergeado a main.

4. Estructura del proyecto Java
feature/project-structure: Rama con la estructura básica del proyecto.

Uso de Maven como gestor de dependencias.

Añadido JUnit 5 para pruebas unitarias (pom.xml configurado).

Pull Request creado, revisado y fusionado tras aprobación.

🧪 Testing
Se utilizan JUnit 5 para testear los métodos principales del vehículo. Todos los tests se ejecutan automáticamente en cada Pull Request mediante GitHub Actions.

👥 Colaboradores

sgarciagra - Sandra Garcia

EvaFioen - Eva Fioen

Martina-dP - Martina del Pino
