package entities;
import java.util.ArrayList;
public class Mecanico extends Empleado {

	private double valorKm;

	public double getValorKm() {
		return valorKm;
	}

	public void setValorKm(double valorKm) {
		this.valorKm = valorKm;
	}
	
	@Override
    public double getSueldo() {
        double sueldo = super.getSueldo();
        ArrayList<Vehiculo> vehiculosReparados = getVehiculosReparadosDelMes();
        double totalKilometros = calculateTotalKilometros(vehiculosReparados);
        double adicionalKm = totalKilometros * valorKm;
        sueldo += adicionalKm;
        return sueldo;
    }

    private ArrayList<Vehiculo> getVehiculosReparadosDelMes() {
        ArrayList<Vehiculo> vehiculosReparadosDelMes = new ArrayList<>();
        return vehiculosReparadosDelMes;
    }

    private double calculateTotalKilometros(ArrayList<Vehiculo> vehiculos) {
        double totalKilometros = 0;
        for (Vehiculo vehiculo : vehiculos) {
            ArrayList<Viaje> viajesDelMes = vehiculo.getViajesDelMes();
            for (Viaje viaje : viajesDelMes) {
                totalKilometros += viaje.getKms();
            }
        }
        return totalKilometros;
    }
}
