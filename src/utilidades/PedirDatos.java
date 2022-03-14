package utilidades;

import java.util.Scanner;

public class PedirDatos {

	@SuppressWarnings("resource")
	public static String pedirString() {
		return new Scanner(System.in).nextLine();
	}

	public static String pedirString(String msg) {
		System.out.println(msg);
		return pedirString();
	}

	@SuppressWarnings("resource")
	public static int pedirEnteros() {
		return new Scanner(System.in).nextInt();
	}

	public static int pedirEnteros(String msg) {
		System.out.println(msg);
		return pedirEnteros();
	}
}
