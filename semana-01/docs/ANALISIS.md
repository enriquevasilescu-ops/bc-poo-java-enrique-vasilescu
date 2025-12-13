# Análisis Orientado a Objetos - Pizzeria Sabor Italiano

## 1. Identificación del Dominio

**Nombre del negocio:** Sabor Italiano
**Tipo:** Pizzería y Comida Italiana
**Descripción:** Sabor Italiano es una pizzería que ofrece pizzas artesanales al horno de leña, pastas frescas y platos típicos italianos. Cuenta con 10 empleados y atiende aproximadamente 120 clientes diarios entre servicio en local y domicilios

## 2. Objetos Identificados

### Objeto Principal: Pizza
**¿Qué es?:** La clase Pizza es un modelo u objeto dentro de un sistema orientado a objetos que representa una pizza real dentro del negocio de una pizzería.
**Atributos identificados:**
- Name: String - Permite distinguirla de otras pizzas y representa su denominación comercial
- Ingredients: String - Permite definir su composición, personalizarla y calcular costos adicionales según los extras agregados.
- Code Pizza: String - Es un identificador único que permite distinguir cada pizza dentro del sistema. Sirve para registrar, buscar y gestionar pizzas sin confusiones
- Price: int - Representa el valor monetario de la pizza dentro del sistema. Indica cuánto cuesta al cliente y se utiliza para calcular el total del pedido
- Available: boolean - Indica si la pizza está habilitada para la venta en el sistema. Permite saber si puede ser preparada o pedida por el cliente

**Métodos identificados:**
- Mostrar Informacion(): Muestra por consola todos los datos principales de la pizza
- Calcular Costo Total(): Calcula un valor total basado en el precio de la pizza multiplicado por 8800
- Get Ingredients(): Retorna el valor del atributo ingredients
- Set Disponible(): Actualiza el estado de disponibilidad de la pizza, indicando si puede ser vendida o no.

### Objeto Secundario: Client
**¿Qué es?:** La clase Cliente representa a la persona que realiza pedidos en la pizzería.
**Atributos identificados:**
- Nombre: String - Representa el nombre del cliente y permite identificarlo dentro del sistema.
- Celular: String - Almacena el número de teléfono del cliente, utilizado para contactarlo o confirmar pedidos.
- Correo: String - Guarda la dirección del cliente, necesaria para realizar entregas a domicilio.
- Codigo: String - Es un identificador único que distingue a cada cliente dentro del sistema y facilita la gestión de sus pedidos.

**Métodos identificados:**
- Mostrar datos(): Muestra en pantalla todos los datos del cliente
- getAddres(): Devuelve la dirección del cliente almacenada en el atributo addres.
- getPhone(): Retorna el número de teléfono del cliente.
- getCodePizza(): Devuelve el código de la pizza que el cliente seleccionó o tiene asociado.
- getCode(): Retorna el código único del cliente registrado.

## 3. Relación entre Objetos

**Tipo de relación:** Asociacion
**Descripción:** Un Cliente puede pedir varias pizzas y la pizza debe tener el codigo  

## 4. Justificación del Diseño

**¿Por qué elegí estos objetos?**
Porque son los objetos principales en una pizzeria porque tiene que tener una pizza que va a ser pedida por los clientes, y estos clientes van a ayudar a la sostenibilidad del negocio
- **¿Por qué estos atributos son importantes?**
### Pizza
- **Nombre:** Es fundamental porque permite identificar la pizza dentro del menú.
- **Ingredientes:** Permite describir qué contiene la pizza, lo cual es útil para la información del cliente
- **CodePizza:** Es un identificador único que permite registrar y distinguir cada pizza dentro del sistema sin confusión.
- **Precio:** Representa el valor económico de la pizza y permite calcular el costo de los pedidos.
- **Disponible:** Indica si la pizza está disponible para la venta, ayudando a controlar inventarios y evitar pedidos de productos agotados.
### Cliente
- **Nombre:** Identifica al cliente dentro del sistema y permite registrar quién realiza el pedido.
- **Telefono:** Es importante para contactar al cliente, confirmar pedidos o resolver problemas durante la entrega.
- **Direccion:** Es necesario para realizar entregas a domicilio y registrar el destino de los pedidos.
- **Codigo:** Es un identificador único que permite diferenciar clientes, buscar su información rápidamente y evitar duplicados.
- **CodePizza** Indica qué pizza pidió el cliente, aunque idealmente debería estar en la clase Pedido y no en Cliente.
**¿Por qué estos métodos son necesarios?**
- En el sistema de pizzería, los métodos ayudan a ejecutar tareas reales del negocio, como mostrar los datos de una pizza, obtener el precio, mostrar los datos de un cliente, confirmar una dirección, o calcular costos.


## 5. Comparación: POO vs Programación Estructurada

**Sin POO (Estructurado):**
Al no tener clases se debe usar variables simples, remplazando los atributos, los metodos serian funciones sueltas que reciben las variables como parametros, es decir , todo el comportamiento del sistema se consigue llamando las funciones que procesan variables independientes 
**Con POO:**
El usar clases me permite generar una mayor organizacion del codigo, encapsular datos, que me brinda una mayor proteccion de los datos, permite crear multiples objetos, mayor facilidad al gestionar metodos de negocio y tienen una mayor modelaicon del mundo real

**Ventajas específicas en mi dominio:**
1. El negocio de una pizzeria se compone de entidades reales y las clases me permiten representarlas de una manera ordenada y clara
2. Cada clase me permite realizar acciones reales del negocio, generando una mayor funcionalidad del sistema
3. Me permite representar relaciones del mundo real y asi modelar exactamente como funciona la pizzeria
