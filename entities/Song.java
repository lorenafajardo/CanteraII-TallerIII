package entities;

import java.time.LocalDate;

/**
 * 
 * @author Daniela y Lorena
 * Esta claase se crea para definir la cancion y los atributos que debe llevar la misma, mencionados mas adelante.
 *
 */
public class Song {

	private String title;
	private int id;
	private LocalDate date;
	private int time;
	private String gender;
	private String cover; // Caratula
	private String description;

	/**
	 * 
	 * @param title
	 * @param id
	 * @param date
	 * @param time
	 * @param gender
	 * @param cover
	 * @param description
	 */
	// Se crea el contructor con todos los parametros que recibe el metodo
	public Song(String title, int id, LocalDate date, int time, String gender, String cover, String description) {
		super();
		this.title = title;
		this.id = id;
		this.date = date;
		this.time = time;
		this.gender = gender;
		this.cover = cover;
		this.description = description;
		
		// Getter and Setter
	}

	public String getTitle() {

		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override // Sobreescribimos el metodo toString para crear nuestros objetos con los mismos
				// parametos
	public String toString() {
		return "Song [title=" + title + ", id=" + id + ", date=" + date + ", time=" + time + ", gender=" + gender
				+ ", cover=" + cover + ", description=" + description + "]";
	}

}
