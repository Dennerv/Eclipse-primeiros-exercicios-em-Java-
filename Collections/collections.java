package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class collections {

	public static void main(String[] args) {

		int roda;
		Scanner ler = new Scanner(System.in);
		
		ArrayList <String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n\n1- Para adicionar um produto no estoque?\n2- para remover um produto do estoque?"
			+"\n3- Para atualizar um produto no estoque?\n4- Para mostrar todos os produtos do estoque"
			+"\n0- Para encerrar o programa?\n Digite sua opção: ");
			
			roda = ler.nextInt();
			
			switch(roda)
			{
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = ler.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				ler.nextLine();
				System.out.println("\nDigite o nome do item para ser removido: ");
				String item = ler.nextLine();
				if(estoque.contains(item))
				{
					estoque.remove(item);
				}
				else
				{
					System.out.println("\nItem não existe");
				}
				System.out.println(estoque);
				break;
				
			case 3: 
				ler.nextLine();
				System.out.println("\nDigite o produto que vai ser atualizado: ");
				String verifica = ler.nextLine();
				System.out.println("\nDigite o produto que entrará no lugar do(a) "+verifica+ " : ");
				String novo = ler.nextLine();
				
				if(estoque.contains(verifica))
				{
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else
				{
					System.out.println("\nProduto não existe!!!");
				}
				System.out.println(estoque);
				break;
				
			case 4:
				System.out.println("\nOs produtos que temos no estoque são: ");
				System.out.println(estoque);
				break;
				
			default:
					if(roda==0)
					{
						System.out.println("\nFinalizado, obrigado!");
					}
					else
					{
						System.out.println("\nOpção inexistente, confira um item que existe no estoque");
					}
			}
			
		}
		while(roda!=0);
	}




	
}