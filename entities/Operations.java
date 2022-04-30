package entities;

/**
 * Importacion de librerias
 * Scanner           : Utilizada para capturar los datos que ingrese el usuario 
 * ArrayList y List  : Creacion de listas para almacenar el playlist
 * Collections       : Utilizado para el m�todo sort, que ordena la playlist 
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
 * @version 3.0
 * @since 13/04/2022
 */
public class Operations {
	
	/**Instacia de clases
	 * Scanner  : Utilizada para capturar los datos que digita el usuario
	 * library1 : Utilizada para llamar la lista que contiene la biblioteca de canciones
	 * */
	Scanner sc = new Scanner(System.in);
	static Library library1 = new Library();
	static List<Song> library = library1.addSong();
	
	/**Metodo showLibrary : Metodo para mostrar libreria de canciones, mediante ciclo For */
	public void showLibrary() {
		for (int i = 0; i < library.size(); i++) {
			System.out.println(library.get(i));
		}
	}
	
	/**
	 * Metodo para crear playlist, mediante ciclo For
	 */
	public List<Song> playlistCreate() {

		List<Song> playList = new ArrayList<Song>();
		System.out.println("Cuantas canciones desea ingresar: ");
		int songsNumber = sc.nextInt();
		sc.nextLine();

		for (int j = 1; j <= songsNumber; j++) {

			System.out.println("Escriba el nombre de la canción");
			String tittleSong = sc.nextLine();

			for (int k = 0; k < library.size(); k++) {
				if (library.get(k).getTitle().equals(tittleSong)) {
					playList.add(library.get(k));

				}
			}
		}
		for (int i = 0; i < playList.size(); i++) {
			System.out.println(playList.get(i));

		}
		return playList;
	}
	
	/**
	 * Metodo para filtrar libreria de canciones, con opcion para filtrar por genero o por ano, mediante ciclo for
	 */

	public void filter() {

		int filterOption = sc.nextInt();
		sc.nextLine();

		if (filterOption == 1) {
			System.out.println("Escriba el genero que desea buscar");
			String generFind = sc.nextLine();

			for (int k = 0; k < library.size(); k++) {

				if (library.get(k).getGender().equals(generFind)) {
					System.out.println(library.get(k));
				}
			}

		} else if (filterOption == 2) {
			
			System.out.println("Ingrese el año que sea filtrar");
			int date = sc.nextInt();
			
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
	 * Método para ordenar libreria de canciones, con opción de ordenar por fecha y por duracion de las canciones, utilizado mediante la
	 * sobreescritura del metodo compare.
	 */
	public void order() {

		int optionOrder = sc.nextInt();
		sc.nextLine();

		if (optionOrder == 1) {

			Collections.sort(library, new Comparator<Song>() {

				@Override
				public int compare(Song s1, Song s2) {
					return s1.getDate().compareTo(s2.getDate());
				}
			});

			for (Song s : library) {
				System.out.println(s);
			}
		} else if (optionOrder == 2) {

			Collections.sort(library, new Comparator<Song>() {

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

			for (Song s : library) {
				System.out.println(s);
			}

		} else {
			System.out.println("Opcion invalida");
		}
	}

}
