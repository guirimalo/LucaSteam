package model;


public class Juego {
	
	enum Genero{
		
	}

	enum Plataforma{
		
	}

	private String nombre;
	private int date;
	private String publisher;
	private String genero;
	private String plataforma;
	
	public Juego() {
		
	}
	
	public Juego(String nombre, int date, String publisher, String genero, String plataforma) {
		this.nombre=nombre;
		this.date = date;
		this.publisher = publisher;
		this.genero=genero;
		this.plataforma = plataforma;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		plataforma = plataforma;
	}

	@Override
	public String toString() {
		return "Juego [nombre=" + nombre + ", date=" + date + ", publisher=" + publisher + "]";
	}
	

	
}
