import java.util.Scanner;
import java.util.Locale;


public class AboutMe {
    public static void main(String[] args) {
        
        // instacia da nossa classe Scanner 
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

         // utilizando o scanner

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("ola " + nome + " sua idade e: " + idade + " seu peso e : " + peso+"kg   ");

        


      
    }
}
