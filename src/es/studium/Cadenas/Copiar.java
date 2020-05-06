package es.studium.Cadenas;

import java.util.Scanner;

public class Copiar
{

	public static void main(String[] args)
	{
		String cad1, copia;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca un texto");
		cad1=teclado.nextLine();
		
		copia = cad1;
		
		System.out.println(copia);

		teclado.close();
	}

}
