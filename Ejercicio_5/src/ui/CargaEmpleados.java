package ui;
import entidades.Administrativo;
import entidades.Empleado;
import entidades.Vendedor;
import java.util.Scanner;

class CargaEmpleados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
           
            System.out.print("Ingrese cantidad de empleados (máximo 20): ");
            int cantEmpleados = scanner.nextInt();
            scanner.nextLine(); 
    
           
            ListaEmpleados listaEmpleados = new ListaEmpleados (cantEmpleados);



for (int i = 0; i < cantEmpleados; i++) {
    System.out.println("Empleado #" + (i+1));
    System.out.print("Ingrese DNI: ");
    String dni = scanner.nextLine();
    System.out.print("Ingrese nombre: ");
    String nombre = scanner.nextLine();
    System.out.print("Ingrese apellido: ");
    String apellido = scanner.nextLine();
    System.out.print("Ingrese sueldo base: ");
    double sueldoBase = scanner.nextDouble();
    scanner.nextLine(); 

    System.out.print("¿Es administrativo? (s/n): ");
        String esAdministrativoStr = scanner.nextLine();
        if (esAdministrativoStr.equalsIgnoreCase("s")) {
            System.out.print("Ingrese horas extra: ");
            int hsExtra = scanner.nextInt();
            System.out.print("Ingrese horas mensuales: ");
            int hsMes = scanner.nextInt();
            scanner.nextLine(); // 

            Empleado empleado = new Administrativo(dni, nombre, apellido, sueldoBase, hsExtra, hsMes);
            listaEmpleados.agregarEmpleado(empleado);
        } else {
            System.out.print("Ingrese porcentaje de comisión: ");
            double porcenComision = scanner.nextDouble();
            System.out.print("Ingrese total de ventas: ");
            double totalVtas = scanner.nextDouble();
            scanner.nextLine(); 

            Empleado empleado = new Vendedor(dni, nombre, apellido, sueldoBase, porcenComision, totalVtas);
            listaEmpleados.agregarEmpleado(empleado);
        }
    }

  
    listaEmpleados.listarEmpleados();
    scanner.close();
}

    
}