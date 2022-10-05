import java.util.Date;

public class Operadores {
    public static void main(String[] args) {
        // operadores de atribuição =, é usado para atribuir um valor a uma variavei

        String meuNome = "Mateus gomes de oliveira";
        int minhaIdade = 27;
        double peso = 72.5;
        // aspas simples para representar um char
        char sexo = 'M';
        boolean doadorDeOrgao = true;
        // instancia da classe Date, chamamos ela de dataNascimento, com parametros de construtores.
        Date dataNascimento = new Date();

        // OPERADORES ARITMETICOS +, / , * , - , %

        // em tipos textos o operador matematico junta as strings...
        String nome = "Mateus";
        String sobreNome = "Gomes de oliveira";
        System.out.println(nome + " " +sobreNome);
        
        double soma = 10.5 + 1.5;
        int subtracao = 10 - 5;
        int multiplicacao = 2 * 10;
        double divisao = 10.3 / 4 ;
        int modulo = 18 % 3;
        
        //mix de operadores 
        double resultado = (10 + 5) * (10 / 3);
        

    }
}
