package colecciones1;

import java.util.HashMap;
import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		// Creamos el HashMap para almacenar los datos del login
		HashMap<String, String> baseDatos = new HashMap<String, String>();
		// Creamos el escáner y la variable para el mismo
		Scanner sc = new Scanner(System.in);
		int opcion = 3;
		int cont = 0;
		String usuario = "";
		String contra = "";
		String contraUsuario = "";
		String usuarioUsuario = "";
		// Creamos un while para el menú
		while (opcion != 0) {
			// Si escribe 1, solicitamos los datos y los almacenamos en el mapa
			if (opcion == 1) {
				System.out.println("Usuario:");
				usuario = sc.next();
				System.out.println("Contraseña:");
				contra = sc.next();
				baseDatos.put(usuario, contra);
			}
			// Si introduce 2, solicitamos usuario y contraseña, si falla 3 veces no accede
			if (opcion == 2) {
				while (cont <= 3 && !baseDatos.containsValue(contraUsuario) && !baseDatos.containsKey(usuarioUsuario)) {

					System.out.println("Si falla 3 veces se le denegará el acceso");
					System.out.println("Usuario:");
					usuarioUsuario = sc.next();
					System.out.println("Contraseña:");
					contraUsuario = sc.next();
					cont++;
				}
				if (cont == 3) {
					System.out.println("Lo siento, no tiene acceso al área restringida");
				} else {
					System.out.println("Ha accedido correctamente");
				}

			}

			// Mostramos las opciones y solicitamos al usuario la que desee
			System.out.println("1.Registro");
			System.out.println("2.Login");
			System.out.println("0.Salir");
			opcion = sc.nextInt();
		}

		sc.close();
	}

}
