package es.studium.Cadenas;

import java.util.Scanner;

public class Concatena
{

	public static void main(String[] args)
	{

		String cadena1= new String();
		String cadena2="";
		String cadena3=new String();
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduzca una palabra");
		cadena1=teclado.next();
		System.out.println("Introduzca una segunda palabra");
		cadena2=teclado.next();
		
		cadena3=cadena1+" "+cadena2;
		System.out.println("La concatenacion de las dos palabras introducidas es: "+cadena3);
		
		
		teclado.close();
		

	}

}
