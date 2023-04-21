package entidades;


public class Administrativo extends Empleado {
	public int hsExtra;
 public int hsMes;

 public Administrativo(String dni, String nombre, String apellido, double sueldoBase, int hsExtra, int hsMes) {
     super(dni, nombre, apellido, sueldoBase);
     this.hsExtra = hsExtra;
     this.hsMes = hsMes;
 }

 public double getSueldo() {
     return sueldoBase * ((hsExtra * 1.5) + hsMes) / hsMes;
 }
}