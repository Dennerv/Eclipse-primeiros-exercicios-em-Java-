package heranca;

import java.util.Scanner;

public class absMain {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        abscachorro dog1 = new abscachorro();
        abscavalo cav1 = new abscavalo();

        abstrata animais = null;


        int opc = 0;
        do { 
            System.out.println("Escolha um animal: \n1- Cachorro\n2- Cavalo");
            opc = leia.nextInt();
            switch(opc) { 
            case 1: animais = dog1;
            break;
            case 2: animais = cav1;
            break;
            default: System.out.println("Opção inválida!");
            }
            if(animais != null) 
            { 
                animais.som((Math.random() * 2.0));
            }


        } while (opc > 3 || opc < 1);
    }
}
