package Familia44;

import java.util.Scanner;

public class repeticao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int num,par=0,impar=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int cont=0;cont<10;cont++)
		{
			System.out.println("Digite um n�mero: ");
		    num = ler.nextInt();
		 
			
			
			if(num%2 ==0)
			{                 // se n�o tiver resto, � par 
				par++;
			}
			else if(num%2 !=0)
			{
				impar++;  //se tiver resto, � impar
			}	
			
		}
		System.out.println("existem " +par+" n�mero pares e "+impar+" n�mero impares.");
		
	}

}
