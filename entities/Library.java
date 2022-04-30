package entities;

/**Importacion de librerias
 * LocalDate: Para definir la fecha de la cancion
 * ArrayList y List : Utilizadas para almacenar las canciones en una lista 
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Library : Esta clase contiene una lista de canciones con todos los atributos recibidos de la clase Song
 * 
 * @author LORENA FAJARDO y DANIELA MONTANO
 * @version 3.0
 * @since 28/04/2022
 */
public class Library {

	/** Metodo addSong : Metodo que permite almacenar las canciones de tipo Song en una lista y retornarla*/
	public List<Song> addSong() {

		/** Creación de lista, llamada library */
		List<Song> library = new ArrayList<Song>();
		
		/** Creación de objeto song1, para la cual se define la fecha date1 y se añade el objeto a la lista library*/
		LocalDate date1 = LocalDate.parse("1993-07-06");
		Song song1 = new Song("La Herida", 1, date1, 5, "Rock", "Album1", " Es una canción del grupo español de rock and roll Héroes del Silencio, perteneciente a su álbum El Espíritu del Vino, publicado en 1993.");
		library.add(song1);
		
		/** Creación de objeto song2, para la cual se define la fecha date1 y se añade el objeto a la lista library*/
		LocalDate date2 = LocalDate.parse("2017-07-06");
		Song song2 = new Song("Me Rehuso", 2, date2, 3, "Regaeton", "Album2", " Canción del cantante venezolano Danny Ocean. Fue lanzada el 16 de septiembre de 2016, y relanzada en 2017 a través de Atlantic Records");
		library.add(song2);

		/** Creación de objeto song3, para la cual se define la fecha date3 y se añade el objeto a la lista library*/
		LocalDate date3 = LocalDate.parse("2002-07-06");
		Song song3 = new Song("Lady Blue", 3, date3, 2, "Rock", "Album3"," es una canción del artista español Enrique Bunbury, el primero de sus singles en solitario.");
		library.add(song3);

		/** Creación de objeto song4, para la cual se define la fecha date4 y se añade el objeto a la lista library*/
		LocalDate date4 = LocalDate.parse("2018-07-06");
		Song song4 = new Song("Yours", 4, date4, 2, "Regaeton", "Album Ultimo Tour"," Es la primera canción de Jason Mraz de su tercer álbum de estudio We Sing. We Dance. We Steal Things. (2008). ");
		library.add(song4);

		/** Creación de objeto song5, para la cual se define la fecha date5 y se añade el objeto a la lista library*/
		LocalDate date5 = LocalDate.parse("2009-07-06");
		Song song5 = new Song("Nada", 5, date5, 6, "Rock", "Album Zoe", "es el segundo sencillo de la banda de rock alternativo Zoé desprendido de su disco Reptilectric.");
		library.add(song5);

		/** Creación de objeto song6, para la cual se define la fecha date6 y se añade el objeto a la lista library*/
		LocalDate date6 = LocalDate.parse("2021-07-06");
		Song song6 = new Song("Gasolina", 6, date6, 2, "Regaeton", "Album Daddy", " Es una canción de reguetón escrita por Daddy Yankee y Eddie Dee. Fue lanzada bajo su disco Barrio fino en el año 2004, fue grabada en 2002 y no se publicó hasta 2004");
		library.add(song6);

		/** Creación de objeto song7, para la cual se define la fecha date7 y se añade el objeto a la lista library*/
		LocalDate date7 = LocalDate.parse("2017-07-06");
		Song song7 = new Song("Sorry", 7, date7, 9, "Pop", "Album Justin Bieber", " Es una canción grabada por el cantante canadiense Justin Bieber para su cuarto álbum de estudio Purpose.");
		library.add(song7);

		return library;
	}

}

