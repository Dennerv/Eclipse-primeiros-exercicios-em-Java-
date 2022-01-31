package POOexercicio1;

public class principal {
	
	
	public static void main(String[] args) {
		
		cliente cliente1 = new cliente("Maria Aparecida",5,2524);
		cliente  cliente2 = new cliente("José Carlos", 17,2458);
		cliente cliente3 = new cliente ("Denner vieira",3,4786);
		
		
		
		cliente1.imprimirInfo();
		
		
		cliente2.imprimirInfo();
		
		
		cliente3.imprimirInfo();
	
		
	}

}
