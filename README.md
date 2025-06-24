# Calculadora de Pedidos

Proyecto en Java que calcula el total de un pedido aplicando descuentos y cargos de envío.

Incluye:

- Lógica de negocio en `PedidoService`.
- Pruebas unitarias con JUnit 5.
- Simulación de dependencias con Mockito.
- Automatización de pruebas con GitHub Actions.

## Cómo usar

1. Clona el repositorio:  
   ```bash
   git clone https://github.com/TravailZamilo/calculadora-pedidos.git
   ```
2. Ejecuta pruebas con Maven:  
   ```bash
   mvn test
   ```

## Tecnologías

- Java 17  
- Maven  
- JUnit 5  
- Mockito  
- GitHub Actions  

## Licencia

MIT License

## Preguntas y Respuestas sobre Pruebas Unitarias

**¿Qué te ayudaron a identificar las pruebas unitarias?**  
Las pruebas unitarias ayudaron a detectar errores específicos en la lógica de cálculo, validar distintos escenarios (con y sin descuento, envío normal o express) y asegurar que los cambios futuros no rompan funcionalidades existentes.

**¿Cuál fue el beneficio de usar un mock para simular una dependencia?**  
El mock permitió aislar la lógica del `PedidoService` sin depender de la implementación real del repositorio de descuentos, facilitando pruebas más rápidas, controladas y sin necesidad de una base de datos o sistema externo.

**¿Qué pasaría si se modifica la lógica de descuentos sin actualizar las pruebas?**  
Si la lógica cambia y las pruebas no se actualizan, las pruebas podrían fallar o, peor, pasar sin detectar errores, lo que llevaría a bugs en producción y pérdida de confianza en el software.

**¿Cómo escalamos esta estrategia para un sistema más grande?**  
Se puede dividir el sistema en módulos, creando pruebas unitarias para cada uno, usar mocks para simular integraciones complejas, automatizar pruebas en pipelines CI/CD, y ampliar con pruebas de integración y end-to-end para validar el sistema completo.

---

¡Gracias por revisar el proyecto!
