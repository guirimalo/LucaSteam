package model;

import model.Juego.Genero;

public class Juego {

    public enum Genero{
    	Sports
    }

   public enum Plataforma{
	   Wii
    }

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
    public void setFecha(int echa) {
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

    public void setPlataforma(String plataforma) {
        plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Juego [nombre=" + nombre + ", date=" + fecha + ", publisher=" + publisher + ", genero=" + genero
                + ", plataforma=" + plataforma + "]";
    }





}