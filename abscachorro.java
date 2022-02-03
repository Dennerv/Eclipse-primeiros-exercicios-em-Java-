package heranca;

public class abscachorro extends abstrata {

	public abscachorro() {
		super("cachorro");
		
	}
 @Override
 public void som(double quantidade) {
	 quantidade = Math.random()*5.0;
	 
	 
	 for(int i=0; 1<quantidade;i++) {
		 System.out.println("cachorro latiu");
	 }
 }
	
	
	
	
	
	
	
	
	
}
