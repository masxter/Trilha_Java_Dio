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

        //operadores unarios +, -, ++, --, !
        int numero = 5;

        //para torna-lo negativo atribuimos o valor da seguinte forma
        numero = - numero;

        // assim podemos dizer que esse numero vai si tornar negativo
        System.out.println(numero);
        //para torna positivo fazemos 

        numero = numero * -1;
        System.out.println(numero);

        //incremento de numeros
        int valor = 5;
         
        // e a mesma coisa de valor = valor + 1; entao abreviamos da seguinte forma
        // podemos fazer isso para o decremento
        System.out.println(++ valor); // prefixo

        // valores booleanos 

        boolean verdadeiro = true;
        
        // transformando em valor negativo
        verdadeiro = !verdadeiro;
        
        System.out.println(!verdadeiro);

        System.out.println(verdadeiro);

        //operador ternario
        // <expressao condiciona> ? <caso a condicao seja verdadeira> : <caso a condicao seja falsa>

        int a, b;

        a = 5;
        b = 6;
       
        // operador ternario
        String  Resultado =   a==b ? "verdadeiro" : "falso";

        System.out.println("o resultado e: " + Resultado);

        // operadores relacionais 
        // equals e usado para comparar objetos...

        String nomeUm = "Mateus";
        String nomeDois = new String("Mateus");

        System.out.println(nome.equals(nomeDois));

        int Numero = 1;
        int Numero2 = 2;

        boolean simNao = Numero == Numero2;

        if (Numero == Numero2){
            System.out.println("e igual: " + simNao);
        }
        else{
            System.out.println("nao e igual: " + simNao);
        }

        //operadores Logicos, basico da tabela verdade, && , || , ou expressoes relacionais booleanas
        // && as duas condicoes sao verdadeiras 
        // || uma condicao e verdadeira

        boolean condition = true;
        boolean condtionTwo = false;





        

    }
}
