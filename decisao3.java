package Familia44;

import java.util.Scanner;

public class decisao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto
*?
*/
		int num;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe uma idade: ");

		num = ler.nextInt();
		
		if(num>=10 && num<=14)
		{
			System.out.println("Essa idade é da Categoria infantil."+num+" anos");
		}
		
		else if(num>=15 && num<=17)
		{
			System.out.println("Essa idade é da Categoria Juvenil."+num+" anos");
		}
		else if (num>=18 && num<=25)
		{
			System.out.println("Essa idade é da Categoria Adulto."+num+" anos");
		}
		
	}

}
