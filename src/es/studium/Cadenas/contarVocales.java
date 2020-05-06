package es.studium.Cadenas;

import java.util.Scanner;

public class contarVocales
{

	public static void main(String[] args)
	{
		String cadenaInicio;
		

		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca un texto");
		cadenaInicio=teclado.nextLine();
		System.out.println("El texto tiene: "+ funConteo(cadenaInicio)+" vocales");
		teclado.close();
	}
public static int funConteo(String x) {
	int contador=0;
	
	for (int i=0;i<x.length();i++) {
		if((x.charAt(i)=='a')||(x.charAt(i)=='e')||(x.charAt(i)=='i')||(x.charAt(i)=='o')||(x.charAt(i)=='u')) {
			contador++;
		}
	}
		return contador;
	
	
	
}

}
