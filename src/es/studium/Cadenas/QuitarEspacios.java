package es.studium.Cadenas;

import java.util.Scanner;

public class QuitarEspacios
{

	public static void main(String[] args)
	{
		String cadena,cadena2="";
		char espacio=' ';
		Scanner teclado=new Scanner(System.in);
		
		
		System.out.println("Introduzca una cadena de texto");
		cadena=teclado.nextLine();
		
		for (int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i)!=espacio) {
				
			
		
				cadena2+=cadena.charAt(i);
			}
		}
		
		System.out.println(cadena2);
		teclado.close();
		
		

	}

}
