package PruebasEjercicios;

import java.util.Scanner;

public class pruebaHora24h
{

	public static void main(String[] args)
	{
		String hora24[]= {"12","01","02","03","04","05","06","07","08","09","10","11","12","01","02","03","04","05","06","07","08","09","10","11"};
		String horaInicial="",h="",m="";
		
		int horaInicio,horaAM=0,horaPM=0;
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca una hora en formato 24:00");
		horaInicial=teclado.next();
		
		m=horaInicial.substring(3, 5);
		h= horaInicial.substring(0, 2);
		
		
		horaInicio=Integer.valueOf(h);
		if (horaInicio==0) {
			
			horaInicio=0;
			System.out.println("0"+horaInicio+":"+m+ " am");
			
		}
		if ((horaInicio>12)&&horaInicio!=0) {
			
			horaAM=horaInicio;
			
		}	
		if ((horaInicio<12)&&horaInicio!=0) {
			
			
			horaPM=horaInicio;
		}
		
		
		if ((horaInicio>=12)&&(horaInicio!=0)) {
			
			System.out.print(hora24[horaAM]+":"+m+" pm");
			
		}	
		if ((horaInicio<12)&&horaInicio!=0) {
			
			
			System.out.print(hora24[horaPM]+":"+m+" am");
		}
		
				
		
		System.out.println();	
		teclado.close();

	}

}
