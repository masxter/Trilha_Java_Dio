package metodos;

public class Main {
    public static void main(String[] args) {
        
        // chamar o metodo apartir da classe, como exemplo temos Math.sqrt()

        System.out.println("Caluladora: ");
        Calculadora.tabuadaAdicao(10, 10);
        Calculadora.tabuadaSubtracao(23, 29);
        Calculadora.tabuadaMultiplicacao(5, 28);
        Calculadora.tabuadaDivisao(36, 6);

        System.out.println("Que horas são: ");
        Mensagem.obterHora(9);
        Mensagem.obterHora(22);
        Mensagem.obterHora(18);
        Mensagem.obterHora(19);
    }
}
