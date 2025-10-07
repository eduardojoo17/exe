package futebol;

import java.util.Scanner;

public class Contratacao{
 
public static void main(String[] args) {
    TimeDeFutebol contratado = new TimeDeFutebol("flamengo");
     String nome,posicao;
     int tamanho = 11;
     Scanner ler = new Scanner(System.in);




     for(int i = 0;i< tamanho;i++){

    System.out.println("digite o nome do jogador: ");
    nome = ler.nextLine();
    System.out.println("Digite a posição do jogador: ");
    posicao = ler.nextLine();
    Jogador novoJogador = new Jogador(nome,posicao);
    contratado.adicionarJogador(novoJogador);
   
}
contratado.exibirEscalacao();
ler.close();





}
   }
