package Familia44;

import java.util.Scanner;

public class Decisao1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int pri,seg,ter,maior=0;

        Scanner leia = new Scanner(System.in);

        System.out.print("Entre com o Primeiro valor: ");
        pri = leia.nextInt();
        System.out.print("Entre com o Segundo valor: ");
        seg = leia.nextInt();
        System.out.print("Entre com o Terceiro valor: ");
        ter = leia.nextInt();

        if(maior < pri) {//2
            maior = pri;

        } if (maior < seg) {//4
            maior = seg;

            if (maior < ter) {//3
                maior = ter;
            }
        }

        System.out.print("O maior número é: "+maior);

    }

}
