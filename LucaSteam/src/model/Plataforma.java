package model;

public enum Plataforma {

	WII("WII"),
	NES("NES"),
	GB("GB"),
	DS("DS"),
	X360("X360"),
	PS3("PS3"),
	PS2("PS2"),
	SNES("SNES"),
	GBA("GBA"),
	PS("PS"),
	NG4("NG4"),
	PSP("PSP"),
	XONE("XONE"),
	GC("GC"),
	WIIU("WIIU"),
	XB("XB"),
	PC("PC"),
	GEN("GEN"),
	DOSSEIS("2600"),
	TRESDS("3DS");
	
	private String nombre;
	Plataforma(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
