package heranca;

import java.util.Scanner;

public class cavalo extends animal {

	private int pontuacao=0;

	
	public cavalo(String nome,int idade,int pontuacao) {
	
        super(nome,idade);
        
        this.pontuacao = pontuacao;
        
	}
	Scanner ler = new Scanner(System.in);
	
	public int getPontuacao() {
		return pontuacao;
	}



	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}



	public void pularBarra () {
		
	System.out.println("Qual a pontuação do cavalo ? ");
	
	}
	
	
	
	
	
}
