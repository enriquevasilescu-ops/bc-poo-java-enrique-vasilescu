# Análisis Orientado a Objetos - Pizzería "Sabor Italiano"

## 1. Identificación del Dominio

- **Nombre del negocio:** Sabor Italiano  
- **Tipo:** Pizzería y Comida Italiana
- **Descripción:** [Descripción breve del dominio asignado]

## 2. Objetos Identificados

### Objeto Principal: Pizza
- **¿Qué es?:** Es un objeto del dominio de una pizzería que representa un producto que puede ser ofrecido, vendido, preparado o incluido en pedidos.
- **Atributos identificados:**
- Nombre: String - descripción
- Ingredientes: String - descripción
- Codigo Pizza: String - descripción
- Precio: Int - descripción
- Disponible: Boolean - descripción

**Métodos identificados:**
- Void (MostrarInformacion): Este metodo se encarga de mostrar los datos de los atributos del objeto pizza
- Int (Calcular Costo Total): Este metodo se encarga de calcular y mostrar el precio del objeto pizza
- String (Get Ingredientes): Este metodo muestra los ingredientes de la pizza
- Void (Set Disponible): Este metodo se encarga de mostrar la disponibilidad dle objeto pizza

### Objeto Secundario: [Nombre]
**¿Qué es?:** [Definición]
**Atributos identificados:**
- atributo1: tipo - descripción
- atributo2: tipo - descripción
- atributo3: tipo - descripción
- atributo4: tipo - descripción

**Métodos identificados:**
- metodo1(): descripción
- metodo2(): descripción
- metodo3(): descripción

## 3. Relación entre Objetos

**Tipo de relación:** [Asociación, composición, etc.]
**Descripción:** Explica cómo se relacionan los dos objetos en el contexto del dominio.

Ejemplo: "Un Cliente puede tener múltiples Reservas. La Reserva necesita conocer el nombre del Cliente para registrar la información."

## 4. Justificación del Diseño

**¿Por qué elegí estos objetos?**
[Explicación]

**¿Por qué estos atributos son importantes?**
[Explicación de cada atributo]

**¿Por qué estos métodos son necesarios?**
[Explicación de la lógica de negocio]

## 5. Comparación: POO vs Programación Estructurada

**Sin POO (Estructurado):**
[Explica cómo resolverías el mismo problema sin clases, solo con funciones y variables]

**Con POO:**
[Explica las ventajas de usar clases en tu solución]

**Ventajas específicas en mi dominio:**
1. [Ventaja 1]
2. [Ventaja 2]
3. [Ventaja 3]

## 6. Diagrama de Clases (Opcional)

