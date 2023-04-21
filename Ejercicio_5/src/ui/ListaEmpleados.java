package ui;

import entidades.Empleado;

public class ListaEmpleados {
    private Empleado[] empleados;

    public ListaEmpleados(int maxEmpleados) {
        this.empleados = new Empleado[maxEmpleados];
    }

    public void agregarEmpleado(Empleado empleado) {
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] == null) {
                empleados[i] = empleado;
                break;
            }
        }
    }

    public void listarEmpleados() {
        System.out.println("Lista de empleados:");
        System.out.println();
        for (Empleado empleado : empleados) {
            if (empleado != null) {
                System.out.println("DNI: " + empleado.dni);
                System.out.println("Nombre: " + empleado.nombre);
                System.out.println("Apellido: " + empleado.apellido);
                System.out.println("Sueldo: " + empleado.getSueldo());
                System.out.println();
            }
        }
    }
}
