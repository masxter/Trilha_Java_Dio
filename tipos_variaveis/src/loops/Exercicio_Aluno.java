package loops;

import java.util.Scanner;

public class Exercicio_Aluno {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        String nomeAluno;
        int idadeAluno;

        while(true){

            System.out.print("Digite seu nome: ");
            nomeAluno = scanner.next();

            if(nomeAluno.equals("0")) break;

            System.out.print("Digite sua idade: ");
            idadeAluno = scanner.nextInt();
            
        }

    }
}
