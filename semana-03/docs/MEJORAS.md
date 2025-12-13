# Mejoras - Semana 03

## Encapsulación Aplicada

### Clase: Pizza, Client.
- Atributos encapsulados: 
#### PIZZA
- private String name;
- private String ingredients;
- private String codePizza;
- private int price;
- private boolean available;
#### CLIENT
- private String name;
- private String phone;
- private String addres;
- private String code;
- private int codePizza;

##### Validaciones agregadas: 
- Estas validaciones aseguran que los datos sean correctos antes de guardarlos: el precio debe ser positivo, el código y la dirección no pueden ser nulos, la dirección debe tener “Cl”, y los códigos deben tener al menos cuatro caracteres. Esto evita errores y mantiene información válida en los objetos.

## Constructores Sobrecargados

### Clase: Pizza, Client.

#### PIZZA
- El primer constructor de Pizza permite crear una pizza con nombre y código, asignando automáticamente “Sin ingredients” cuando no se especifican.
  El segundo constructor crea una pizza solo con el nombre y genera automáticamente un código basado en ese nombre en minúsculas, agregando “Example001”.
#### CLIENT
- El primer constructor de Client crea un cliente usando nombre y código, y completa automáticamente los datos faltantes asignando “Sin telefono” y “Sin direccion”.
  El segundo constructor permite crear un cliente solo con el código y genera de forma automática un nombre basado en ese código en minúsculas más “Ejemplo001”.

## Beneficios Logrados
- Las validaciones evitan que se construyan objetos con información nula, vacía o incorrecta. Esto previene errores en el sistema desde el primer momento.
- Al validar desde el constructor, todos los objetos siguen el mismo formato y reglas, lo que asegura que la información sea confiable y consistente durante todo el funcionamiento del programa.