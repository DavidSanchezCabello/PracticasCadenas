package es.studium.Cadenas;

import java.util.Scanner;

public class Mayor
{

	public static void main(String[] args)
	{
		
		String cadena[]=new String[5];
		String mayor;
		int i;
		Scanner teclado = new Scanner(System.in);

		for (i=0;i<cadena.length;i++) {
			System.out.println("Introduzca la cadena de texto número: "+ (i+1));
			cadena[i]=teclado.nextLine();
		}
		mayor=cadena[0];
		for (i=1;i<cadena.length;i++) {
			if (mayor.compareTo(cadena[i])<0) {
				mayor=cadena[i];
			}
		}
		System.out.println(mayor);
		teclado.close();
	}

}
