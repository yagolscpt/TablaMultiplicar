package divisionbucle;

import java.util.Scanner;

public class ejercicioclase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		int numero=0;
		int resultado=0;
		Scanner yago = new Scanner(System.in);
		System.out.println("escribe el numero del que quieras la tabla");
		numero= yago.nextInt();
		
		if (( numero >=1)&& (numero<=10)) {
			
		System.out.println("TABLA DE MULTIPLICAR DEL NUMERO :"+" "+numero);
		for (int i = 1; i<=10;++i){
			resultado=numero*i;
								
				System.out.println(numero +"*"+ i +"="+ resultado );
				
		}
			}else {
				System.out.println("no, ese numero no puedes, tiene que ser menor o igual de 10");
				
			}
				
		
		
	}



}