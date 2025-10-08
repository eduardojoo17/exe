package buscador;

public class programa {
    public static void main(String[] args) {
        int [] vetor ={1,2,3,4,5,6,7};
        int busca=2;

        int posicao = buscador.buscaBinaria(vetor,busca);
        if(posicao == -1){
            System.out.println("o numero não esta na lista.");
        }else{
            System.out.println();
            System.out.printf("o item buscado está na posição: %d e é o item: %d\n\n",posicao,vetor[posicao]);
        }
    }
}
