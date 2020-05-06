package es.studium.Cadenas;

import java.util.Scanner;

public class Inversa
{
	public static String invertirCadena(String x)
	{

		String inverso = "";

		for (int i = x.length() - 1; i >= 0; i--)
		{

			inverso += x.charAt(i);

		}
		return inverso;

	}

	public static void main(String[] args)
	{
		String cad1 = "";
		String invertido;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca una cadena de texto");
		cad1 = teclado.nextLine();
		invertido = invertirCadena(cad1);

		System.out.println("la cadena invertida es: " + invertido);
		teclado.close();

	}

}
