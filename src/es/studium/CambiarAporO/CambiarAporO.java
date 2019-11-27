package es.studium.CambiarAporO;

import java.util.Scanner;

public class CambiarAporO {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Variables
		String cad1;
		
		
		//Inicio
		System.out.println("Escribe una cadena:");
		cad1 = teclado.next();
		cad1 = cad1.replace('a', 'o');
		System.out.println(cad1);
		teclado.close();
	}
}
