package entidades;

public abstract class Empleado {
    public String dni;
    public String nombre;
    public String apellido;
    public double sueldoBase;

    public Empleado(String dni, String nombre, String apellido, double sueldoBase) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBase = sueldoBase;
    }

    public abstract double getSueldo();
}