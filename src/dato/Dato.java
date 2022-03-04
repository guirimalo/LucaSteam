package dato;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import model.Juego;
import model.Juego.Genero;
import model.Juego.Plataforma;
public class Dato {
	
	public static void main(String[] args) {
		recogerDatos();
		for (Juego juego : listaJuegos) {
			if(isExiste(juego)) System.out.println("El juego existe");
		}
		Dato.generarInforme();
		
	}
    private static String file = "vgsales.csv";
    private static BufferedReader reader = null;
    private static String line = "";
    private static List<Juego> listaJuegos = new ArrayList<>();
    
    public static void recogerDatos(){
        try {
            reader = new BufferedReader(new FileReader (file));
            
            reader.readLine();
            while((line = reader.readLine()) != null){
                String[] row = line.split(",");
                
                int fecha = Integer.parseInt(row[3].replace("-", ""));
                Genero genero = Genero.valueOf(row[4].replace("-", ""));
                Plataforma plataforma = Plataforma.valueOf(row[2]);
                
                Juego juego = new Juego(row[1],plataforma,fecha,genero,row[5]);
                listaJuegos.add(juego);

               System.out.println(listaJuegos);
           }
            System.out.println();
        }
        catch (Exception e){
            System.out.println("Parece que ha dado error");
        }
    }
    
    public static boolean isExiste(Juego juego) {
    	boolean existe = false;
    	
    	for(Juego item:listaJuegos) {
    		if(item.equals(juego)) {
    			existe = true;
    			break;
    		}
    	}
    	return existe;
    }
    
    public static void generarInforme() {
		System.out.println("Informe juegos: ");
    	for(Juego item: listaJuegos) {
    		System.out.println(item.toString());
    	}
    }
    
}
