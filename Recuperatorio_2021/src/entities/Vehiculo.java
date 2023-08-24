package entities;
import java.util.ArrayList; 

public class Vehiculo {

	private String patente;
	private String marca;
	private String modelo; 
	private ArrayList<Viaje> viajes;
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public ArrayList<Viaje> getViajes() {
		return viajes;
	}
	public void setViajes(ArrayList<Viaje> viajes) {
		this.viajes = viajes;
	} 
	
	public ArrayList<Viaje> getViajesDelMes(){
		ArrayList<Viaje> viajesDelMes = new ArrayList<>();
		return viajesDelMes; 
	}
	
	

}
