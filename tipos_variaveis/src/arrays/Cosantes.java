package arrays;

import java.util.Scanner;

public class Cosantes {
    public static void main(String[] args) {
        /*
         * faça um programa que leia um vetor de 6 caractres 
         * e diga quantas cosoantes foram lidas 
         * imprima as cosoantes
         */

         Scanner scanner = new Scanner(System.in);

         String[] consoantes = new String[6];

         //
         int quantidade = 0;
         int count = 0;

         do{
           System.out.println("digite uma letra: ");
           String letra = scanner.next();

           if(!(letra.equalsIgnoreCase("a")|
           letra.equalsIgnoreCase("e")|
           letra.equalsIgnoreCase("i")|
           letra.equalsIgnoreCase("o")|
           letra.equalsIgnoreCase("u"))){
            consoantes[count] = letra;
            quantidade++;
           }

           count++;

         }

         while(count < consoantes.length);

         for (String string : consoantes) {
            if(string != null)
            System.out.println("Vogais: " + string);
         }

         System.out.println("Quantidade de consoantes: " + quantidade);

    }
}
