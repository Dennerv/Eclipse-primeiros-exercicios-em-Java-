package exercicio4;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		funcionario funcionario1 = new funcionario("Fernando Lopes","Compras", 82.24);
		funcionario funcionario2 = new funcionario("Larissa Souza","Financeiro",100);
		funcionario funcionario3 = new funcionario("Mario Mendes", "Estoque",65);
		
		
		
		funcionario1.imprimirInfo();
		
		
		funcionario2.imprimirInfo();
		
		
		funcionario3.imprimirInfo();
	

		
	}

}
