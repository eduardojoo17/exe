/*Crie uma classe MaiorNumero que analise um conjunto de pontua��es. 
Pe�a ao usu�rio para inserir 6 n�meros inteiros, que
podem representar pontua��es de um jogo, usando Scanner ou JOptionPane. 
Armazene esses n�meros em um vetor, processe
os dados para encontrar a maior pontua��o e, ao final, exiba o recorde encontrado.*/

import javax.swing.JOptionPane;

public class MaiorNumero {
    public static void main(String[] args) {
        int[]pontos = new int[6];
        int cont=0,maior;

        
        for(int i =0;i< pontos.length;i++){
            String input = JOptionPane.showInputDialog(null, "Digite sua " + (i + 1) + "ª pontuação:");
            pontos[i]  = Integer.parseInt(input);
        }
        maior=pontos[0];
        for(int i=1;i<pontos.length;i++){
            if (pontos[i]>maior) {
                maior=pontos[i];
            }else{}
        }

         JOptionPane.showMessageDialog(null,"\nO maior número é: "+maior);
    }
}
