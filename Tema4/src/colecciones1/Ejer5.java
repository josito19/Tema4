package colecciones1;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		// Creamos el escáner
		Scanner sc = new Scanner(System.in);
		// Creamos el conjunto ya que no pueden repetirse datos
		LinkedHashSet<String> conjNombres = new LinkedHashSet<String>();
		// Creamos la variable donde almacenar los nombre momentaneamente
		String nombre = "";

		// Un while que funcionará hasta que introduzca fin
		while (!nombre.equalsIgnoreCase("fin")) {
			conjNombres.add(nombre);
			nombre = sc.next();
		}
		System.out.println(conjNombres);
		sc.close();
	}

}
