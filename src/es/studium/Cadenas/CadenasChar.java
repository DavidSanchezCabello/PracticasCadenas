package es.studium.Cadenas;

public class CadenasChar
{

	public static void main(String[] args)
	{
		/*
		char tablaCaracteres[]=new char[5];
				tablaCaracteres[0]='a';
				tablaCaracteres[1]='b';
				tablaCaracteres[2]='c';
				tablaCaracteres[3]='d';
				tablaCaracteres[4]='e';
*//*	char caracteres[]= {'a','b','c','d','e'};
		String cadena = new String (caracteres,2,3);
		System.out.println(cadena);*/
		String texto="Esto no es un texto simple";
		char caracteres[]=new char[11];
		texto.getChars(8, 17, caracteres, 0);
		System.out.println(caracteres);
		int num=27;
		texto=String.valueOf(num);
		System.out.println(String.valueOf(num));
	}

}
