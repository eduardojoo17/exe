/*Crie uma classe MediaDeNotas. Simule a entrada de 5 notas em um laço for. Se a nota for maior que 10, use
continue para ignorá-la. Se a nota for negativa, use break para sair do loop. Calcule e imprima a média das
notas válidas. (Desafio: Use scanner ou/e vetor)*/


public class mediaNotas {
    public static void main(String[] args) {
        int[] nt={10,5,9,-1,7};
        double soma=0,media=0;
        int qtd=0;

             for(int i =0;i<nt.length;i++){   //o length é a propriedade que te dá o tamanho de um array (quantos elementos ele tem)
                if(nt[i]>10) {continue;
                
                }else if(nt[i]<0){break;

                }
                soma=soma+nt[i];  // pode ser usar a forma abreviada soma+=nt[i]
                qtd++;
    }
    media = soma/qtd;

System.out.println("a media das notas: "+media);
    
}
}