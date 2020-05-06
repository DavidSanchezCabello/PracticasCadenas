package PruebasEjercicios;

import java.util.Scanner;

public class PracticaCambiarFormatoHora
{

	public static void main(String[] args)
	{

		Scanner teclado = new Scanner(System.in);
		int horaInicio = 0, horaFin = 0, hora24 = 0, i;

		String horaInicial, aux = "", horaFinal = " ", hora00 = " ";
		char dosPuntos = ':';
		boolean fin = false;
		do
		{
			System.out.println("Introduzca una hora");
			horaInicial = teclado.next();

			for (i = 0; i < horaInicial.length(); i++)
			{

				if (horaInicial.charAt(i) == dosPuntos)
				{
					i++;

				}
				aux += horaInicial.charAt(i);

			}

			horaInicio = Integer.valueOf(aux);
			if ((horaInicio >= 60) && (horaInicio <= 99))
			{
				System.out.println("El formato introducido NO es correcto" +"\n !!!INTENTELO DE NUEVO!!!");
			} else
			{
				if ((horaInicio >= 2400) || (horaInicio <= 0))
				{

					System.out.println("El formato introducido NO es correcto"+"\n !!!INTENTELO DE NUEVO!!!");
				} else
				{
					if ((horaInicio >= 0) && (horaInicio <= 59))
					{
						horaFin = horaInicio + 1200;
					}
					if ((horaInicio >= 100) && (horaInicio <= 159))
					{
						horaFin = horaInicio;
					}

					if ((horaInicio >= 200) && (horaInicio <= 259))
					{
						horaFin = horaInicio;
					}

					if ((horaInicio >= 300) && (horaInicio <= 359))
					{
						horaFin = horaInicio;
					}

					if ((horaInicio >= 400) && (horaInicio <= 459))
					{
						horaFin = horaInicio;
					}

					if ((horaInicio >= 500) && (horaInicio <= 559))
					{
						horaFin = horaInicio + 1200;
					}

					if ((horaInicio >= 600) && (horaInicio <= 659))
					{
						horaFin = horaInicio;
					}

					if ((horaInicio >= 700) && (horaInicio <= 759))
					{
						horaFin = horaInicio;
					}

					if ((horaInicio >= 800) && (horaInicio <= 859))
					{
						horaFin = horaInicio;
					}

					if ((horaInicio >= 900) && (horaInicio <= 959))
					{

						horaFin = horaInicio;
					}

					if ((horaInicio >= 1000) && (horaInicio <= 1059))
					{
						horaFin = horaInicio;
					}

					if ((horaInicio >= 1100) && (horaInicio <= 1159))
					{
						horaFin = horaInicio;
					}

					if ((horaInicio >= 1300) && (horaInicio <= 1359))
					{
						horaFin = horaInicio - 1200;
					}

					if ((horaInicio <= 2359) && (horaInicio >= 1359))
					{
						horaFin = horaInicio - 1200;

					}
					if ((horaInicio >= 1200) && (horaInicio <= 1259))
					{
						horaFin = horaInicio;
					}
					
					{

						horaFinal = Integer.toString(horaFin);

						if (horaFinal.length() != 3)
						{
							horaFinal = horaFinal.substring(0, 2) + ":" + horaFinal.substring(2, horaFinal.length());
						} else
						{
							horaFinal = horaFinal.substring(0, 1) + ":" + horaFinal.substring(1, horaFinal.length());
						}
					}
				}
			}
			System.out.println(horaFinal+" pm");

			horaInicio = 0;
			horaFin = 0;
			hora24 = 0;
			horaInicial = "";
			aux = "";
			horaFinal = " ";
			hora00 = " ";
		} while (fin = true);
		/*
		 * horaFinal=Integer.toString(hora);
		 * 
		 * if (horaFinal.length() != 3) { horaFinal = horaFinal.substring(0, 2) + ":" +
		 * horaFinal.substring(2, horaFinal.length()); } else { horaFinal =
		 * horaFinal.substring(0, 1) + ":" + horaFinal.substring(1, horaFinal.length());
		 * }
		 * 
		 * 
		 * System.out.println(); /* for (i=0;i<horaFinal.length();i++) {
		 * System.out.print(horaFinal.charAt(i)); System.out.println("test1"); for (int
		 * j=0;j<1;j++) { System.out.println("test2"); System.out.println(":"); } }
		 * 
		 * //}while (pregunta==false);
		 * 
		 * /* for (i=0;i<hora00.length();i++) {
		 * 
		 * if ((i==0)||(i<hora00.charAt(2))) {
		 * 
		 * ho=hora00.charAt(i); } if ((i>2)||(i<hora00.charAt(5))) {
		 * mi=hora00.charAt(i); }
		 * 
		 * } System.out.println("La hora introducida es "+ho+":"+mi );
		 * 
		 * /* }
		 * 
		 * for (i=0;i<x;i++) {
		 * 
		 * 
		 * for (j=0;j<y;j++) {
		 * 
		 * System.out.println(am[i][j]); }
		 * 
		 * for (int i=0;i<hora00.length();i++) {
		 * 
		 * if((hora00.charAt(i)>=48)&&(hora00.charAt(i)<=57)){
		 * 
		 * am=hora00.charAt(i);
		 * 
		 * System.out.print(hora);
		 * 
		 * }
		 * 
		 * }
		 */
		teclado.close();
	}
}