package entities;
import java.util.Date; 


public class Viaje {
	private int id; 
	private Date fecha; 
	private double duracionHs ; 
	private double kms;
	private int capacidad ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getDuracionHs() {
		return duracionHs;
	}
	public void setDuracionHs(double duracionHs) {
		this.duracionHs = duracionHs;
	}
	public double getKms() {
		return kms;
	}
	public void setKms(double kms) {
		this.kms = kms;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	
	
	
}
