package model;

import java.util.Objects;

public class Juego {

    private String nombre;
    private int fecha;
    private String publisher;
    private Genero genero;
    private Plataforma plataforma;

    public Juego() {

    }

    public Juego(String nombre,Plataforma plataforma, int fecha,Genero genero, String publisher ) {
        this.nombre=nombre;
        this.fecha = fecha;
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
    public int getFecha() {
        return fecha;
    }
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Juego [nombre=" + nombre + ", date=" + fecha + ", publisher=" + publisher + ", genero=" + genero
                + ", plataforma=" + plataforma + "]";
    }

	@Override
	public int hashCode() {
		return Objects.hash(fecha, genero, nombre, plataforma, publisher);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Juego other = (Juego) obj;
		return fecha == other.fecha && genero == other.genero && Objects.equals(nombre, other.nombre)
				&& plataforma == other.plataforma && Objects.equals(publisher, other.publisher);
	}

    



}