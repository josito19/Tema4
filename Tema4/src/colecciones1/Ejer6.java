package colecciones1;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejer6 {

	public static void main(String[] args) {
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Creamos el conjunto ya que no pueden repetirse datos
		TreeSet<String> conjNombres = new TreeSet<String>();
		// Creamos la variable donde almacenar los nombre momentaneamente
		String nombre = "";

		// Un while que funcionará hasta que introduzca fin
		while (!nombre.equalsIgnoreCase("fin")) {
			conjNombres.add(nombre);
			nombre = sc.next();
		}
		// Borramos el primer espacio
		conjNombres.remove("");
		System.out.println(conjNombres);
		sc.close();

	}

}
