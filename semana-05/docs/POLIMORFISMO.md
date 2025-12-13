# Análisis de Polimorfismo - PIZZERIA SABOR ITALIANO

## 1. Sobrecarga (Overloading)

### Métodos Sobrecargados
- `calcularSalario(salarioBase)`
- `calcularSalario(salarioBase + bono)`
- `calcularSalario(salarioBase + propinas)`
- `getInfo(Documneto, Salario Base)`
- `getInfo(Nombre, Documento, Salario Base, Años Antiguedad, Salario Total)`
- `getInfo(Nombre, Documento, Salario Base, Porpinas, Salario Total)`
### Justificación
Esto tiene sentido ya que al cocinero se le puede agregar un bono por llevar mas tiempo y los mesero se les da la propina en vez del bono y, conocer la informaicon de los empleados ayuda a obtener una mayor organizacion pra poder entregar nominas etc.

---

## 2. Sobrescritura (Overriding)

### Tabla Comparativa

| Método | Clase Padre | Subclase 1    | Subclase 2        |
|--------|-------------|---------------|-------------------|
| `calcularCosto()` | abstract | precio + bono | precio + propinas |

### Código Ejemplo
@Override
public String obtenerDescripcion() {
return "Cocinero:" + name + " (" + añosAntiguedad + "años)";
}

public int getAñosAntiguedad() { return añosAntiguedad; }

---

## 3. Polimorfismo Dinámico

### Ejemplo de Dynamic Binding
System.out.println("\n=== DEMOSTRACION POLIMORFISMO ===");
for (Empleado e : empleados) {
System.out.println(e.obtenerDescripcion());
System.out.println("Salario: $" + e.calcularSalario());
System.out.println("Tipo real: " + e.getClass().getSimpleName());
System.out.println("---");

### Explicación
El ciclo demuestra que trata a todos como Empleados y uqe cada objeto ejecuta su propia version de los metodos,por ultimo java decide cual metodo ejecutar segun el tipo real del objeto

---

## 4. Beneficios

- **Flexibilidad**: Permite que el codigo se pueda adapatar a diferentes tipos de empleados como pueden ser Mesero y Cocinero
- **Extensibilidad**: Permite agregar nuevos tipos de empleados como cajero, repartidor o personal de aseo, sin necesidad de modificar el codigo
- **Mantenibilidad**: Permite que el sistema sea mas facil de actualizar sobrescribiendo lo necesario en las clases hijas, como a cocinero se le agrego a su salrio base un bono y a mesero se le agrego propinas a su salario base