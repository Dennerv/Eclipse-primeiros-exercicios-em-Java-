package heranca;

import java.util.Scanner;

public class cachorro extends animal {

	

	private boolean querer = true;
	private boolean bravo;
	
	Scanner ler = new Scanner(System.in);
	
	public cachorro(String nome, int idade,boolean querer, boolean bravo) {
		super(nome, idade);
		
		this.querer = querer;
		this.bravo = bravo;
	}
	
	public boolean isQuerer() {
		return querer;
	}

	public void setQuerer(boolean querer) {
		this.querer = querer;
	}

	public boolean isBravo() {
		return bravo;
	}

	public void setBravo(boolean bravo) {
		this.bravo = bravo;
	}

	public void brincar() {
		
		if(querer== true) {
			System.out.println("O cachorro está afim de brincar!");
		}
		else {
			System.out.println("O Cachorro quer dormir .. ");
		}
	}
	
	public void correr() {
		if(querer == true) {
			System.out.println("O cachorro está com muita energia!");
		}
		System.out.println("O cachorro precisa descansar .. ");
	}
	
	public void morder(){
		System.out.println("O cachorro está bravo? ");
		bravo = ler.hasNext();
		
		if(bravo==true) {
			System.out.println("Ele pode te morder, deixe ele em paz! ");
		}
		else if(bravo==false) {
			System.out.println("Ele é bonzinho, gosta de todos os amigos de seu dono!!");
		}
	}
	
	
}
