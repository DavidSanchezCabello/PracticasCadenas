package es.studium.Tema3_Ejercicios_Cadenas;

import java.util.Scanner;

public class Ejercicio1_Nombres
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String [] nombres = new String[5];
		
		for (int i = 0; i < nombres.length; i++)
		{
			System.out.print("Introduzca un nombre para los valores de la cadena en la posición ["+(i+1)+"]");
			nombres[i]=teclado.nextLine();
		}
		
		for (int i = 0; i < nombres.length; i++)
		{
			System.out.println("el nombre introducido para ["+(i+1)+"] es ["+nombres[i]+"]");
		}
		
		teclado.close();
	}

}
