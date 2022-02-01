package heranca;

public class preguica extends animal {



	private static boolean ver=true;
	
	public preguica(String nome, int idade, boolean ver ) {
		super(nome, idade);
		
		this.ver = ver;
	}	
	
	
	
	public  boolean isVer() {
		return ver;
	}





	public void setVer(boolean ver) {
		this.ver = ver;
	}





	public void subirArvore() {
	
		if(ver==true) {
			System.out.println("Vi algo se movendo e logo subi na arvore. ");
		}
		

	}
	
}
