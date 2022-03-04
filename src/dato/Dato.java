package dato;
import java.io.*;
import model.Juego;
import servicio.Gestor;

public class Dato {
    public static void main(String[] args) {
        recogerDatos();
    }
    static String file = "src\\vgsales.csv";
    static BufferedReader reader = null;
    static String line = "";
    
    
    public static void recogerDatos(){
        try {
            reader = new BufferedReader(new FileReader (file));
            while((line = reader.readLine()) != null){
                String[] row = line.split(",");
                for(String index : row)
                    System.out.println(index);
            }
            System.out.println();
        }
        catch (Exception e){
            System.out.println("Parece que ha dado error");
        }
    }
    public void divisorDatos(){

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
