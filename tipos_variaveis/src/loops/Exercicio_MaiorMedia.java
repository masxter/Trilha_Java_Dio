package loops;

import java.util.Scanner;

public class Exercicio_MaiorMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int contador = 0;
        int soma = 0;
        int media = 0;

        do {

            System.out.println("Digite um numero: ");
            numero = scanner.nextInt();
             
            soma = soma + numero;

            media = soma / 4;

            if(numero > contador) contador = numero;

            contador = contador +1;

            // para pegar todas as vezes que o laco rodar
            //System.out.println("maior numero: " + numero);

        } while (contador < 5 );

        System.out.println("Maior numero: " + numero);
        System.out.println("Soma dos numeros: " + soma );
        System.out.println("Media dos numeros: " + media);

    }
}
