package POOexercicio1;

public class cliente {
	
	private String nomeCliente;
	private int quantProduto;
	private int nCadastro;
	
	//metocdo construtor 
	
	public cliente(String nomeCliente, int quantProduto, int nCadastro ) 
	{
		this.nomeCliente = nomeCliente;
		this.nCadastro = nCadastro;
		this.quantProduto = quantProduto;
	}
	//declara��o dos demais m�todos da classe
	
	public void imprimirInfo()
	{
		System.out.println("\n"+nomeCliente+" possui um "+quantProduto+
				" produtos comprados, seu n�mero de cadastro �: "+nCadastro);
		
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public int getQuantProduto() {
		return quantProduto;
	}

	public void setQuantProduto(int quantProduto) {
		this.quantProduto = quantProduto;
	}

	public int getnCadastro() {
		return nCadastro;
	}

	public void setnCadastro(int nCadastro) {
		this.nCadastro = nCadastro;
	}
	
	
}
