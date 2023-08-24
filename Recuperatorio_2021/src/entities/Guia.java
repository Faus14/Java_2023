package entities;
import java.util.ArrayList; 
public class Guia extends Empleado {

	private String disponibilidad;
	private double valorHora;
	private ArrayList<Viaje> viajes;
	private int totalHorasViajes; 
    private ArrayList<Idioma> idiomass; 
	
	
	public String getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public ArrayList<Viaje> getViajes() {
		return viajes;
	}
	public void setViajes(ArrayList<Viaje> viajes) {
		this.viajes = viajes;
	}
	public int getTotalHorasViajes() {
		return totalHorasViajes;
	}
	public void setTotalHorasViajes(int totalHorasViajes) {
		this.totalHorasViajes = totalHorasViajes;
	}
	
	public ArrayList<Viaje> getViajesDelMes(){
		ArrayList<Viaje> viajesDelMes = new ArrayList<>();
		return viajesDelMes; 
	}
	
    public ArrayList<Idioma> getIdiomass() {
		return idiomass;
	}
	public void setIdiomass(ArrayList<Idioma> idiomass) {
		this.idiomass = idiomass;
	}
	@Override
    public double getSueldo() {
        double sueldo = super.getSueldo();

       
        double horasTrabajadas = calculateTotalHorasTrabajadas(); 
        double adicionalHoras = valorHora * horasTrabajadas;

       
        double adicionalIdiomas = calculateAdicionalPorIdiomas();

       
        sueldo += adicionalHoras + adicionalIdiomas;
        return sueldo;
    }

   
    private double calculateTotalHorasTrabajadas() {
    	 double totalHoras = 0;
         
         if (viajes != null) {
             for (Viaje viaje : viajes) {
                 totalHoras += viaje.getDuracionHs();
             }
         }
         
         return totalHoras;
    }

    private double calculateAdicionalPorIdiomas() {
double adicionalIdiomas = 0;
        
        if (idiomass != null) {
            for (Idioma idioma : idiomass) {
                adicionalIdiomas += idioma.getAdicionalActual();
            }
        }
        
        return adicionalIdiomas;
    }
}

	
	

