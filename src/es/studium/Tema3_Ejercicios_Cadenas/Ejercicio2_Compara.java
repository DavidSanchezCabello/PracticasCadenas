package es.studium.Tema3_Ejercicios_Cadenas;

import java.util.Scanner;

public class Ejercicio2_Compara
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);

		String cadena1 = "";
		String cadena2 = "";

		System.out.print("Introduzca una cadena de texto a comparar");
		cadena1 = teclado.nextLine();
		System.out.print("Introduzca otra cadena de texto a comparar");
		cadena2 = teclado.nextLine();

		if (cadena1.length() == cadena2.length())
		{

			System.out.println("Las cadenas introducidas tienen el mismo tamaño");

			if (cadena1.equals(cadena2))
			{

				System.out.println("Las cadenas introducidas son idénticas");

			} else
			{

				System.out.print(", pero aunque tienen el mismo tamaño, no son las mismas");
			}

		} else if (cadena1.length() > cadena2.length())
		{
			System.out.println("Las cadenas introducidas tienen distinto tamaño");
			
			System.out.println("La primera cadena de texto --> [" + cadena1 + "]" + "es mayor que la segunda cadena de texto ["
					+ cadena2 + "]");

		} else if (cadena1.length() < cadena2.length())
		{
			System.out.println("Las cadenas introducidas tienen distinto tamaño");
			
			System.out.println("La primera cadena de texto --> [" + cadena1 + "]" + "es menor que la segunda cadena de texto ["
					+ cadena2 + "]");

		}

		teclado.close();
	}

}
