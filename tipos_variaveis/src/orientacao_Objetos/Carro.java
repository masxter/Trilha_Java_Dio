package orientacao_Objetos;

 // exercicio para apenas criar uma classe carro.
class Carro {
   
   
    // atributo e o elemento de um classe responsavel por definir a estrutura da nossa classe(caracteristicas)
    // exemplo de atributo abaixo

    String cor;
    String modelo;
    double capacidadeTanque;

    // metodo e usado para identificar quais servicos acoes que a classe oferece
  
  // construtor da classe sem sobrecargas
    Carro(){
    }

    // construtor com parametros que sao os atributos da nossa classe
    Carro(String modelo, String cor, double capacidadeTanque){
       
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    // metodos get e set

    void setCor(String cor){
        this.cor = cor;

    }

    String getCor(String cor){
        return this.cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

     String getModelo(String modelo){
        return this.modelo;
    }

    void setcapacidadetanque(double capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

     double getcapacidadeTanque(double capacidadeTanque){
        return this.capacidadeTanque;        
    }

    // metodo para dizer quanto e necessario para encher o tanque
    double totalValorTanque(double valor){
        return capacidadeTanque * valor;
    }

    // e o processo de ativacao de um metodo de um objeto.  

}
