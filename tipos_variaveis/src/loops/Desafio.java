package loops;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int a;
        int b;

        System.out.print("Digite um numero: ");
        a = scann.nextInt();
        System.out.print("Digite mais um numero: 2");
        b = scann.nextInt();

        if(a == b){
            System.out.println("São numeros iguais");

        }

        else{
            System.out.println("Não sao numeros iguais");
        }
    }
}
