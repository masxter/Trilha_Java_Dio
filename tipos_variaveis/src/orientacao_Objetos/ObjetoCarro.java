package orientacao_Objetos;

public class ObjetoCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setCor("azul");
        carro.setModelo("Vw");
        carro.setcapacidadetanque(10.0);

        System.out.println(carro.getModelo(null));
        System.out.println(carro.getCor(null));
        System.out.println(carro.getcapacidadeTanque(0));

        System.out.println(carro.totalValorTanque(5.43));
    }
}
