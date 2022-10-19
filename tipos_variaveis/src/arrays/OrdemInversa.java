package arrays;

public class OrdemInversa {

    /*
     * crie um vetor de 6 numeros inteiros e mostre a ordem inversa.
     */
    public static void main(String[] args) {
        
        int[]vetor = {5,9,10,13,60, -15};
        int count = 0;
        
      while(count < (vetor.length)){
        System.out.println("Vetor normal: " + vetor[count]);
        count++;
      }

      for(int i = (vetor.length-1); i >= 0; i--){
        System.out.println("Vetor na ordem inversa: " + vetor[i]);
      }

    }
}
