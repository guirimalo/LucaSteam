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
                int fecha = Integer.parseInt(row[3]);
                Genero genero = Genero.valueOf(row[4]);
                Plataforma plataforma = Plataforma.valueOf(row[2]);
                Juego juego = new Juego(row[1],plataforma,fecha,genero,row[5]);
                listaJuegos.add(juego);
               // for(String index : row)
                //    System.out.println(index);
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
    
    public Juego altaJuego(Juego juego) {
    	/*if(revisarJuego(juego)) {
    	
    	}*/
    	g.altaJuego(juego);
		return juego;
    	
    }
    
    //Pendiente de completar
    
    public boolean revisarJuego(Juego juego) {
		return true;
    	

    }
}
