package entities;

/**
 * Clase Menu : Se crea la clase Menu donde se muestra al usuario las diferentes opciones a elegir
 * 
 * @author LORENA FAJARDO y DANIELA MONTANO
 * @version 3.0
 * @since 28/04/2022
 */
public class Menu {

	/** Metodo mostrar: Utilizado para mostrar el menu inicial del programa*/
	public void showMenu() {
		System.out.println("-------------WELCOME---------------");
		System.out.println("1.Mostrar biblioteca");
		System.out.println("2.Crear Playlist");
		System.out.println("3.Filtrar canciones");
		System.out.println("4.Ordenar canciones");
		System.out.println("5.EXIT");
	}
	
	/** Metodo filterShow: Metodo utilizado para mostrar las opciones de filtrar las canciones, por genero o por año*/
	public void filterShow() {
		System.out.println(" Como quiere filtrar las canciones:");
		System.out.println("1. Filtrar canciones del mismo genero");
		System.out.println("2. Filtrar canciones en el mismo ano");
	}

	/** Metodo orderShow: Metodo utilizado para mostrar las opciones de ordenar canciones, por genero o por año*/
	public void orderShow() {
		System.out.println(" Como quiere ordenar las canciones:");
		System.out.println("1. Ordenar caciones por fecha");
		System.out.println("2. Ordenar canciones por duracion");
	}
}


