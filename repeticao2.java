package Familia44;

import java.util.Scanner;

public class repeticao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int num,par=0,impar=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int cont=0;cont<10;cont++)
		{
			System.out.println("Digite um número: ");
		    num = ler.nextInt();
		 
			
			
			if(num%2 ==0)
			{                 // se não tiver resto, é par 
				par++;
			}
			else if(num%2 !=0)
			{
				impar++;  //se tiver resto, é impar
			}	
			
		}
		System.out.println("existem " +par+" número pares e "+impar+" número impares.");
		
	}

}
