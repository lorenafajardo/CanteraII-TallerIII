package main;

 /**Importacion de libreria Scanner, para capturar los datos que envia el usuario */
import java.util.Scanner;

/**Importacion de InputMismatchException, para geerar excepxion*/
import java.util.InputMismatchException;

 /**Importacion de las clases Menu, Operations del paquete entities */
import entities.Menu;
import entities.Operations;

 /**
 * Clase Main : Es el controlador del programa, aqui se define el metodo main, donde se invoca los metodos implementados 
 * en la clase Operaciones y el menu de opciones.
 * 
 * @author LORENA FAJARDO y DANIELA MONTANO
 * @version 2.0
 * @since 13/04/2022
 */
public class Main {

	/**
	 * Metodo main: Metodo desde donde se ejecutara el programa
	 * @param args: Argumeto del metodo main
	 */
	public static void main(String[] args) {

		/**Instacia de clases 
		 * Scanner:     Para capturar los datos ingresados por el usuario
		 * Menu:        Para mostrar los encabezados del menu 
		 * Operations : Para llamar los metodos necesarios para la ejecucion del programa*/
		Scanner sc = new Scanner(System.in);
		Menu menu = new Menu();
		Operations operations = new Operations();
		
		/** Inicializacion de la variable option*/
		int option = 0;
		
		/** Try -Catch: Utilizado para generar la excepcion InputMismatchException, que permita ingresar solamente las opciones numericas */
		try{
			
		/** Ciclo do-while: Utilizado para la repeticion del menu hasta que se cumpla la condicion de salir, 
		 * que corresponde a option =5
		 */
			do {
				/** Llamado del metodo showMenu, para que el usuario visualice la biblioteca de canciones */
			menu.showMenu(); 
			option = sc.nextInt();

			switch (option) {

			case 1:
				/**llamado del metodo showLibrary, desde la clase Operations, para mostrar la biblioteca de canciones */
				operations.showLibrary(); 
				break;

				/**llamado del metodo playlistCreate, desde la clase Operations, para crear playlist */
			case 2:
				operations.playlistCreate(); 
				break;

				/**llamado de los metodos filterShow y filter, para filtrar canciones segun el genero o ano */
			case 3:
				menu.filterShow();
				operations.filter();
				break;

				/** Llamado de los metodos orderShow y order, para ordenar las canciones segun fecha o duracion*/
			case 4:
				menu.orderShow(); 
				operations.order();
				break;
			}
			
			/**Condicional que genera error al ingresar una opcion de numero incorrecta   */
			if(option !=1 && option !=2 && option !=3 && option !=4 && option !=5 ){
				System.out.println("Opción incorrecta");
			}
			
		} while (option != 5);
		System.out.println("El programa ha finalizado");
			
		}catch(InputMismatchException ex) {
            	System.out.println("Debe ingresar un número, no se aceptan caracteres diferentes");	
	}
    }
}

