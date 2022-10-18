package loops;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        /*
         * Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.
         */

        Scanner input = new Scanner(System.in);
        int A, N;
        int multiplo = 0 ;
        


        System.out.println("Numero : ");
        A = input.nextInt();
        System.out.println("Numero : ");
        N = input.nextInt();

      
        for(int i = 1; i <= N; i++){

        
            if(i % A == 0)
            multiplo += i;
            System.out.println(multiplo);

        }


    }
}
