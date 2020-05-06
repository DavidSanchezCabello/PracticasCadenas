package es.studium.Cadenas;

import java.util.Scanner;

public class CambiarAporHA
{

	public static void main(String[] args)
	{
		String cadena ;
		char a='a',h='h';
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduzca un texto");
		cadena=teclado.nextLine();
		
		cadena=cadena.replaceAll("a", "ha");
		
		System.out.println(cadena);
				
					
			
		
		
		
		teclado.close();
	}

}
