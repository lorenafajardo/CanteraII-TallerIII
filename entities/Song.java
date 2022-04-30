package entities;

/** Importacion de clase LocalDate, para trabajar con la fecha de publicacion de la cancion */
import java.time.LocalDate;

/**
 * Clase Song : Clase donde secuentran definidos los atributos de una canción
 * 
 * @author LORENA FAJARDO y DANIELA MONTANO
 * @version 2.0
 * @since 13/04/2022
 */

public class Song {

	/**
	 * Definicion de Atributos 
	 * title       : Titulo de la cancion
	 * id          : Id de la canncion 
	 * date        : Fecha de publicacion
	 * time        : Duracion
	 * gender      : Genero
	 * cover       : Caratula
	 * description : Descripcion de la cancion
	 */
	private String title;
	private int id;
	private LocalDate date;
	private int time;
	private String gender;
	private String cover; 
	private String description;

	/**
	 * Declaracion de constructor con todos los parametros 
	 * @param title       : Titulo de la cancion
	 * @param id          : Id de la canncion 
	 * @param date        : Fecha de publicacion
	 * @param time        : Duracion
	 * @param gender      : Genero
	 * @param cover       : Caratula
	 * @param description : Descripcion de la cancion
	 */
	public Song(String title, int id, LocalDate date, int time, String gender, String cover, String description) {
		super();
		this.title = title;
		this.id = id;
		this.date = date;
		this.time = time;
		this.gender = gender;
		this.cover = cover;
		this.description = description;
		
		
	}

	/**
	 * Metodo getTitle: Metodo utilizado para obtener el valor de title
	 * @return title : Titulo de la canción
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Metodo setTitle: Metodo para modificar el valor del atributo title 
	 * @param title : Titulo de la canción
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Metodo getId: Metodo utilizado para obtener el valor del atributo id
	 * @return id : id de la canción
	 */
	public int getId() {
		return id;
	}

	/**
	 * Metodo setId: Metodo para modificar el valor del atributo  id 
	 * @param id : id de la canción
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Metodo getDate: Metodo utilizado para obtener el valor del atributo date
	 * @return date : Fecha de publicacion de la canción
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * Metodo setDate: Metodo para modificar el valor del atributo date 
	 * @param date : Fecha de publicacion de la canción
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * Metodo setTime: Metodo utilizado para obtener el valor del atributo time
	 * @return time : Duracion de la canción
	 */
	public int getTime() {
		return time;
	}

	/**
	 * Metodo setTime: Metodo para modificar el valor del atributo time 
	 * @param time : Duracion de la canción
	 */
	public void setTime(int time) {
		this.time = time;
	}

	/**
	 * Metodo getGender: Metodo utilizado para obtener el valor del atributo gender
	 * @return gender : Genero de la canción
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Metodo setGender: Metodo para modificar el valor del atributo gender 
	 * @param gender : Genero de la canción
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Metodo getCover: Metodo utilizado para obtener el valor del atributo cover
	 * @return cover : Caratula de la canción
	 */
	public String getCover() {
		return cover;
	}

	/**
	 * Metodo setCover: Metodo para modificar el valor del atributo cover 
	 * @param cover : Caratula de la canción
	 */
	public void setCover(String cover) {
		this.cover = cover;
	}

	/**
	 * Metodo getDescription: Metodo utilizado para obtener el valor del atributo description
	 * @return description : Descripcion de la canción
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Metodo setDescription: Metodo para modificar el valor del atributo description 
	 * @param description : Descripcion de la canción
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	
	/** Sobreescritura del metodo toString para retornar la informacion de un objeto con los atributos respectivos  */
	@Override 
	public String toString() {
		return "Nombre de la cancion=" + title + "   Id=" + id + "   Fecha=" + date + "   Duracion=" + time + "   Genero=" + gender
				+ "   Caratula=" + cover + "   Descripcion=" + description + "]";
	}
}
