package es.studium.Cadenas;

public class Cadena
{

	public static void main(String[] args)
	{
		String s= "Esto es una cancion";
		char buf[]=new char[2];
		s.getChars(5, 7, buf, 0);

	}

}
