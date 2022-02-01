package heranca;

public class principal {

	public static  void main(String[] args) {

		
		
		cachorro dog1 = new cachorro("Apollo",4, true, true);
		cavalo cav1 = new cavalo("Unicornio,15", 15, 15);
		preguica preg1 = new preguica("Cansada", 20, true);
		
		
		dog1.correr();
		dog1.isBravo();
		cav1.pularBarra();
		preg1.setVer(true);
		
		
	}

}
