package parte1;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		//Creamos las variables y el escáner
		Scanner sc = new Scanner(System.in);
		String contraseña;
		
		//Solicitamos la contraseña y la guardamos
		System.out.println("Introduzca la contraseña:");
		contraseña = sc.nextLine();
		//Creamos el bucle para encontrar la palabra
		do {
			sc.nextLine();
			System.out.println("Contraseña incorrecta, intente otra vez");
		} while (contraseña.indexOf (contraseña) != -1);
		
		sc.close();
	}
	
	
}
