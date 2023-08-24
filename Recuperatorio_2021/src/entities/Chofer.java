package entities;
import java.util.Date;
import java.util.ArrayList; 
public class Chofer extends Empleado {


	private String carnet; 
	private Date proximoVencimiento; 
	private double cantViajesPremio;
	private double premio;
	
	public String getCarnet() {
		return carnet;
	}
	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	public Date getProximoVencimiento() {
		return proximoVencimiento;
	}
	public void setProximoVencimiento(Date proximoVencimiento) {
		this.proximoVencimiento = proximoVencimiento;
	}
	public double getCantViajesPremio() {
		return cantViajesPremio;
	}
	public void setCantViajesPremio(double cantViajesPremio) {
		this.cantViajesPremio = cantViajesPremio;
	}
	public double getPremio() {
		return premio;
	}
	public void setPremio(double premio) {
		this.premio = premio;
	}
	
	public ArrayList<Viaje> getViajesDelMes(){
		ArrayList<Viaje> viajesDelMes = new ArrayList<>();
		return viajesDelMes; 
	}
	
	@Override
    public double getSueldo() {
		 double sueldo = super.getSueldo();
	        
	        ArrayList<Viaje> viajesMes = getViajesDelMes();
	        double viajesMesCount = viajesMes.size();
	        
	        if (viajesMesCount > getCantViajesPremio()) {
	            sueldo += premio;
	        }

	        return sueldo;
	   }
}
