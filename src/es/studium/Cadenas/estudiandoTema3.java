package es.studium.Cadenas;



public class estudiandoTema3
{

	public static void main(String[] args)
	{
		double tabla[]=new double[5];
		int i=0;
		

		for (i=0;i<5;i++) {
			
			tabla[i]=(Math.random()*10);
			System.out.println("test1");
			
		}
		for(i=0;i<5;i++) {
			
			tabla[i]=tabla[i]*100;
			System.out.println("test2");
		}
		
		for(i=0;i<5;i++) {
			System.out.println("test3");
			System.out.println(tabla[i]);
		}
	}

}
