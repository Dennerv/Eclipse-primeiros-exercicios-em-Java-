package Familia44;

import java.util.Scanner;

public class repeticao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
		
		int idade=1,pMenor21=0,pMaior50=0;
		Scanner ler = new Scanner(System.in);
		
		while(idade>0)
		{
			System.out.println("digite o valor da pessoa:");
			idade = ler.nextInt();
			if(idade<21 && idade>0) 
			{
				pMenor21++;
			}
			else if(idade>50)
			{
				pMaior50++;
			}
		}
		System.out.println("Total de pessoas menores de 21 é: "+pMenor21+""
				+ " e as pessoas maiores de 50: é "+pMaior50);
	}

}
