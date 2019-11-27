package es.studium.Cadenas;

import java.util.Scanner;

public class Nombres
{

	public static void main(String[] args)
	{
		String nombres[]=new String[5];
		Scanner teclado=new Scanner(System.in);
		
		for (int i=0;i<5;i++) {
			System.out.println("Introduzca cadenas para los valores de ["+(i+1)+"]=");
			nombres[i]=teclado.nextLine();
		}
		for (int i=0;i<5;i++) {
			System.out.println("Los valores introducidos son: "+nombres[i]);
		}
		System.out.println(nombres[5].toCharArray());
		teclado.close();

	}

}
