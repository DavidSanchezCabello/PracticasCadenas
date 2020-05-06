package es.studium.Cadenas;

import java.util.Scanner;

public class CambiarAporO
{

	public static void main(String[] args)
	{
		String cadena,aux;
		int i;
		char a='a', o='o';
		
		Scanner teclado=new Scanner(System.in);
		  
		System.out.println("Introduzca una cadena de texto");
		cadena=teclado.nextLine();
		
		System.out.println("Modificado ---> "+cadena.replace(a, o));
		
		System.out.println("Sin modificar ---> "+cadena);
		
		cadena=cadena.replace(a, o);
		System.out.println("modificado ----> "+cadena);
			
	}
	}


