
# Semana [05] - POLIMORFISMO

## 📝 Descripción

Esta semana se aplico sobrecarga y sobrescritura de metodos para implementar polimorfismo 

## 🎯 Objetivos Cumplidos

- [x] Sobrecarga: Mínimo 2 métodos con mismo nombre, diferentes parámetros
- [x] @Override: Correctamente usado en métodos sobrescritos
- [x] Métodos polimórficos: Que acepten clase padre
- [x] ArrayList polimórfico: ArrayList<ClasePadre>
- [x] Main completo: Demuestra sobrecarga y polimorfismo
- [x] POLIMORFISMO.md: Documento con análisis completo
- [x] Compila: Sin errores (javac *.java)
- [x] Ejecuta: Salida clara y coherente (java Main)
## 📂 Archivos Entregados

- `src/[Empleado].java` - La clase Empleado representa a cualquier trabajador de la pizzería y reúne las características generales que comparten todos los empleados
- `src/[Mesero].java` - La clase Mesero hereda de Empleado y representa a los trabajadores encargados de atender a los clientes, tomar pedidos y entregar productos.
- `src/[Cocinero].java` - La clase Cocinero también hereda de Empleado y representa al trabajador responsable de preparar las pizzas y demás alimentos.
- `src/[Restaurant].java` - La clase Restaurant gestiona la clase padre y las clases hijas
- `docs/ANALISIS.md` - Análisis del dominio

## 🚀 Instrucciones de Ejecución

```bash
cd src
javac *.java
java Main