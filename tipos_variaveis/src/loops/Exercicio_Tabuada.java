package loops;

import java.util.Scanner;

public class Exercicio_Tabuada {
    public static void main(String[] args) {
        /*
         * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer numero
         * inteiro de 1 - 10, o usuario deve informar de qual numero ele deseja ver a tabuada
         * a saida deve ser conforme o exemplo abaixo:
         * 
         * tabuada de 5: 
         * 5 x 1 = 5
         * 5 x 2 = 10
         * 
         * ...
         * 
         */

         Scanner scanner = new Scanner(System.in);

         int numero;
         System.out.println("Digite a tabuada de um numero: ");
         numero = scanner.nextInt();

         for(int i = 1; i <=10 ; i++){
            System.out.println(numero +" X " + i + " = " + (numero * i));
         }
    }
}
