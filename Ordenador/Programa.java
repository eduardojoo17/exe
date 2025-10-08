package Ordenador;

public class Programa {
    public static void main(String[] args) {
        int[]vetor = {30,18,55,77,2,5};

        Ordenador.bubblesort(vetor);
        for(int i=0;i<vetor.length;i++){
        System.out.printf("o %d e %d",i,vetor[i]);
    }
}
}
