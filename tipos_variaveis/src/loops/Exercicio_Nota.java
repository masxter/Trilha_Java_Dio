package loops;

import java.util.Scanner;

public class Exercicio_Nota {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota entre 0 - 10");
        nota = scanner.nextInt();

        // laco de repetiçâo
        while (nota < 0 || nota > 10) {
            System.out.println("Nota invalida digite novamente: ");
            nota = scanner.nextInt();
        }
    }
}
