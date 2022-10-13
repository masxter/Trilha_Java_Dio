public class EstruturaDeDecisao {
    // São estruturas que tem a capacidade de direcionar o fluxo de execucao do
    // nosso codigo
    // temos 3 tipos, são elas, DECISÃO, REPETIÇÃO, INTERRUPÇÃO.

    // DECISÃO: if, else, if-else, if-else-if, switch, operador ternario

    public static void main(String[] args) {

        // exemplos
        int idade = 18;

        int aprovado = 6;

        boolean casadoComFilhos = true;
        boolean casadoSemFilhos = false;
        boolean solteiro = true;

        // if
        // poderia si usar o switch pois e um valor exato 
    

        if (idade < 18) {
            System.out.println("Pode acessar está pagina");
        }


        // if-else

        if (aprovado <= 6) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Não foi dessa vez");
        }

        // if-else-if- else

        if (casadoSemFilhos) {
            System.out.println("que legal você !!");
        } else if (casadoComFilhos || casadoSemFilhos) {
            System.out.println("pocha voce nao possui filhos");
        }

        else {
            System.out.println("Solteiro na pista");
        }

    }

}
