package es.studium.Cadenas;

public class Format
{

	public static void main(String[] args)
	{
		int hora=15;
		int minutos=5;
		String cadenaFormateada="Son las %02d:%02d horas";
		System.out.println(String.format(cadenaFormateada, hora, minutos));

	}

}
