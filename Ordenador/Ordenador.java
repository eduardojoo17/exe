package Ordenador;
public class Ordenador {


    public static void bubbleSort(int[] vetor){
        int n = vetor.length;
        for(int i = 0; i < n -1; i++){
            System.out.printf("posicao i : %d\n", i);
            for(int j = 0; j < n -1 -i; j++){
                System.out.printf("item na posicao %d e %d e item na posicao %d e %d\n", j, vetor[j], j +1, vetor[j +1]);
                if(vetor[j] > vetor[j +1]){
                    int temp = vetor[j];
                    vetor[j] = vetor[j +1];
                    vetor[j +1] = temp;
                    System.out.printf("-----trocou----- \n item na posicao %d e %d e item na posicao %d e %d\n", j, vetor[j], j +1, vetor[j +1]);
                }
            }
        }
    }
   
    public static void insertionSort(int[]vetor){
        for (int i =1;i < vetor.length;++i){
            int chave = vetor[i];
            int j = i -1;
            while (j >= 0 && vetor[j]>chave){
                vetor [j + 1] = vetor[j];
                j = j - 1;

            }
                vetor[j+1]= chave;
        }
    }
    
    public static void selectionSort(int[] vetor){
        int n = vetor.length;
        for(int i = 0; i < n -1; i++){
            System.out.printf("Posicao i: %d\n", i);
            int indiceDoMenor = i;
            for(int j = i +1; j < n; j++){
                if(vetor[j] < vetor[indiceDoMenor]){
                    System.out.printf("trocou o indice do menor %d pelo j %d\n", indiceDoMenor);
                    indiceDoMenor = j;
                }
            }
            
                int temp = vetor[indiceDoMenor];
                vetor[indiceDoMenor] = vetor[i];
                vetor[i] = temp;
                System.out.printf("trocou o item da posicao i %d com o  indiceDoMenor %d\n",vetor[i], vetor[indiceDoMenor]);
            
        }
    }


    
}
    
    

 