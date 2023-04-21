package entidades;


public class Vendedor extends Empleado {
	public double porcenComision;
    public double totalVtas;

    public Vendedor(String dni, String nombre, String apellido, double sueldoBase, double porcenComision, double totalVtas) {
        super(dni, nombre, apellido, sueldoBase);
        this.porcenComision = porcenComision;
        this.totalVtas = totalVtas;
    }

    public double getSueldo() {
        return sueldoBase + (porcenComision * totalVtas / 100);
    }
}