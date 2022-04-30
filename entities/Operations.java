package entities;

/**
 * Importacion de librerias
 * Scanner           : Utilizada para capturar los datos que ingrese el usuario 
 * ArrayList y List  : Creacion de listas para almacenar el playlist
 * Collections       : Utilizado para el método sort, que ordena la playlist 
 * Comparator        : Uilizado para comparar las canciones y ordenar la lista
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

/**
 * Clase Operations: En esta clase se encuetran los metodos a implementar en el main,
 * segun las opciones del menu
 * 
 * @author LORENA FAJARDO y DANIELA MONTANO
 * @version 2.0
 * @since 13/04/2022
 */
public class Operations {
	
	/**Instacia de clases
	 * Scanner  : Utilizada para capturar los datos que digita el usuario
	 * library1 : Utilizada para llamar la lista que contiene la biblioteca de canciones
	 * */
	Scanner sc = new Scanner(System.in);
	static Library library1 = new Library();
	
	/**
	 * Se llama el metodo addSong, el cual retorna la lista de canciones que
	 * sera almacenada en las lista library
	 */
	static List<Song> library = library1.addSong();
	
	 /**Metodo showLibrary : Metodo para mostrar la biblioteca de canciones,
	 * recorriendo e imprimiendo los elementos mediante un ciclo For 
	 */
	public void showLibrary() {
		for (int i = 0; i < library.size(); i++) {
			System.out.println(library.get(i));
		}
	}
	
	/** Metodo playlistCreate: Metodo utilizado para crear playlist */
	public List<Song> playlistCreate() {

		/** playList : Lista para almacenar las canciones seleccionadas por el usuario */
		List<Song> playList = new ArrayList<Song>();
		
		System.out.println("Cuantas canciones desea ingresar: ");
		
		/** songsNumber : Valor del tamaño de la lista */
		int songsNumber = sc.nextInt();
		sc.nextLine();

		/**
		 * Ciclo For, utilizado para recorrer toda la lista y filtrar las canciones que
		 * digito el usuario
		 */
		for (int j = 1; j <= songsNumber; j++) {

			System.out.println("Escriba el nombre de la cancion");
			String tittleSong = sc.nextLine();
			tittleSong.toLowerCase();
			
			for (int k = 0; k < library.size(); k++) {
				
				/** Condicional para reconocer cual cancion de la biblioeca es
				 igual a la digitada por el usuario, y añadirla en la playList */
				
				if (library.get(k).getTitle().toLowerCase().equals(tittleSong)) {
					playList.add(library.get(k));
				}
			}
		}
		
		/** Impresion de la playList */
		for (int i = 0; i < playList.size(); i++) {
			System.out.println(playList.get(i));
		}
		return playList;
	}
	
	/**
	 * Metodo filter: Metodo utilizado para filtrar canciones por genero o por
	 * ano
	 */
	public void filter() {

		/**Captura de la opcion de metodo para filtrar, escogida por el usuario*/
		int filterOption = sc.nextInt();
		sc.nextLine();

		/** Condicional if: redirecciona a filtrar por genero */
		if (filterOption == 1) {
			
			/** Captura de genero a buscar */
			System.out.println("Escriba el genero que desea buscar");
			String generFind = sc.nextLine();
			generFind.toLowerCase();

			/** Recorre la lisa y busca el genero escrito por el usuario */
			for (int k = 0; k < library.size(); k++) {

				if (library.get(k).getGender().toLowerCase().equals(generFind)) {
					System.out.println(library.get(k));
				}
			}

		/** Condicional else-if: Redirecciona a filtrar por año */
		} else if (filterOption == 2) {
			
			/** Captura el ano a buscar */
			System.out.println("Ingrese el ano que sea filtrar");
			int date = sc.nextInt();
			
			/**Recorre la lista y busca el ano igual al ingresado por el usuario*/
			for (int k = 0; k < library.size(); k++) {

				if (library.get(k).getDate().getYear()==date) {
					System.out.println(library.get(k));
				}
			}
		} else {
			System.out.println("Opcion incorrecta");
		}
	}

	/**
	 * Metodo order: Metodo uilizado para ordenar libreria de canciones por
	 * fecha o por duracion de las canciones, utilizado mediante la
	 * sobreescritura del metodo compare.
	 */
	public void order() {

		/** Capura de la opcion de ordear elegida por el usuario */
		int optionOrder = sc.nextInt();
		sc.nextLine();

		/**Condicional if: Redirecciona al usuario a ordenar la biblioteca por fecha de publicacion */
		if (optionOrder == 1) {

			/**Llamado de la clase collectios para ordenar los elemenos de la
			 * lista library que corresponden al biblioteca de canciones*/
			Collections.sort(library, new Comparator<Song>() {

				/** Sobreescriura del metodo compare para comparar las canciones
				 * de la lista sefu la fecha de publicacion y usando compareTo
				 */
				@Override
				public int compare(Song s1, Song s2) {
					return s1.getDate().compareTo(s2.getDate());
				}
			});

			/** Impresion de la lista */
			for (Song s : library) {
				System.out.println(s);
			}
		/**
	 	* Codicional else-if: Redireccioa al usuario al meodo de ordenar
	 	* por duracion
		*/
		} else if (optionOrder == 2) {
			
			/**
			 * Llamado de la clase collections para ordenar los elementos de la
			 * lista library
			 */
			Collections.sort(library, new Comparator<Song>() {

				/**
				 * Sobreescritura del metodo compare para comparar la duracio de
				 * las canciones de la lista
				 */
				@Override
				public int compare(Song s1, Song s2) {

					if (s1.getTime() > s2.getTime()) {
						return 1;
					} else if (s1.getTime() < s2.getTime()) {
						return -1;
					} else {
						return 0;
					}
				}
			});

			/** Impresion de la lista */
			for (Song s : library) {
				System.out.println(s);
			}

		} else {
			System.out.println("Opcion invalida");
		}
	}
}
