package exercicio4;

public class funcionario {
	
	private String funci;
	private String setor;
	private double hora;
	
	
	
	public funcionario(String funci,String setor, double hora) 
	
	{
		this.funci = funci;
		this.setor = setor;
		this.hora = hora;
	}



	public String getFunci() {
		return funci;
	}



	public void setFunci(String funci) {
		this.funci = funci;
	}



	public String getSetor() {
		return setor;
	}



	public void setSetor(String setor) {
		this.setor = setor;
	}



	public double getHora() {
		return hora;
	}



	public void setHora(double hora) {
		this.hora = hora;
	}

	public void imprimirInfo()
	{
		System.out.println("\nO funcionário" +funci+"do setor "+setor+
				"trabalho até esse dia : "+hora);
		
	}
	

}
