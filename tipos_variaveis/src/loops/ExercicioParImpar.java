package loops;

import java.util.Scanner;

public class ExercicioParImpar {
    public static void main(String[] args) {
        /*
         * fazer um programa que peça N numeros inteiros,
         * calcule e mostre a quantidade de numeros pares e 
         * a quantidade de numeros impares 
         */

         Scanner scanner = new Scanner(System.in);

         int quantidadeNumeros;
         int contadorNumeros = 0;
         int numero;

         int quantidadePar = 0;
         int quantidadeImpar = 0;


         System.out.println("Quantidade de numeros: ");
         quantidadeNumeros = scanner.nextInt();

         do {
            System.out.println("Digite os numeros: ");
            numero = scanner.nextInt();
            
            if(numero %  2 == 0) quantidadePar++;
            else quantidadeImpar++;

            contadorNumeros++;
         } while (contadorNumeros < quantidadeNumeros);

         System.out.println("Quantidade de par: " + quantidadePar);
         System.out.println("Quantidade de impar: " + quantidadeImpar);
         
         
    }
}
