package entities;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Fausto");
        listaNombres.add("Juan");
        listaNombres.add("Mariela");
        listaNombres.add("Cristian");
        listaNombres.add("Flor");

        int tamanio = 6;
        int resultado = cantLargas(listaNombres, tamanio);
        System.out.println("Cantidad de palabras con mas de " + tamanio + " letras: " + resultado);
    }

    public static int cantLargas(ArrayList<String> listaNombres, int tamanio) {
        int count = 0;

        for (String nombre : listaNombres) {
            if (nombre.length() > tamanio) {
                count++;
            }
        }

        return count;
    }
}
