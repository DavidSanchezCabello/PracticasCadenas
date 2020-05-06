package es.studium.Cadenas;

import java.util.Scanner;

public class Concatena2
{

	public static void main(String[] args)
	{
		String cad1, cad2;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca una cadena");
		cad1 = teclado.nextLine();
		System.out.println("Introduzca una segunda cadena");
		cad2 = teclado.nextLine();

		System.out.println("La concatenacion de ambas es: [" + cad1 + "] " + " [" + cad2 + "]");
	}

}
