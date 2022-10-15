package loops;

import java.util.Scanner;

public class Exercicio_Fatorial {
    public static void main(String[] args) {
        
        /*
         * Faça um programa que calcule o fatorial de um numero inteiro fornecido pelo o usuario
         * ex: 5 != 120 (5x4x3x2x1)
         */

         Scanner scanner = new Scanner(System.in);

         int fatorial;
         int multiplicacao = 1;

         System.out.println("Fatorial: ");
         fatorial = scanner.nextInt();

         System.out.print(fatorial+"!= ");

         for(int i = fatorial; i >= 1; i-- ){
            multiplicacao = multiplicacao*i;
         }

         System.out.println(multiplicacao);
    }
}
