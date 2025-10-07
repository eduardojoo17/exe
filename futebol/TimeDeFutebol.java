package futebol;
import java.util.Scanner;
public class TimeDeFutebol {
    String nome;
    String nomeDoTime;
    int posicoesOcupadas=0;
    Jogador[] jogadores = new Jogador[11] ; 

   public TimeDeFutebol( String nome){
    this.nomeDoTime = nome;
    
   }

  
public void adicionarJogador(Jogador novoJogador){
    if(posicoesOcupadas<jogadores.length){
        jogadores[posicoesOcupadas] = novoJogador;
        posicoesOcupadas++;
        System.out.println("jogador "+ novoJogador.nome+" adicionado ao time");

    }else{
        System.out.println("Não ha mais vagas para os jogadores");
    }
}

public void exibirEscalacao(){
    System.out.println("-------------Escalação do time ---------");
    for(int i =0;i<posicoesOcupadas;i++){
        System.out.printf("%d - Nome: %s | Posição: %s \n", i+1, jogadores[i].nome,jogadores[i].posicao);
    }

}

   }
   

        
    

