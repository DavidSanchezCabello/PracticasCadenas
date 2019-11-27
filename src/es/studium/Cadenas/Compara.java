package es.studium.Cadenas;

import java.util.Scanner;

public class Compara
{

	public static void main(String[] args)
	{
		String cadena1 = "";
		String cadena2 = "";

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca una cadena");
		cadena1 = teclado.next();
		System.out.println("Introduzca una segunda cadena");
		cadena2 = teclado.next();

		if (cadena1.length() == cadena2.length())
		{

			System.out.println("Las cadenas son iguales");

		} else if (cadena1.length() > cadena2.length())
		{
			System.out.println("La primera cadena es mayor que la segunda");

		} else
		{
			System.out.println("La segunda cadena es mayor que la primera");
		}
		teclado.close();

	}

}
