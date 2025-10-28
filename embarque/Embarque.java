package embarque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Embarque {
    public static void main(String[] args) {
        Queue<Pessoa> filaDeEntrada = new ArrayDeque<>();
        Deque<Pessoa> areaDeEmbarque = new ArrayDeque<>();

        filaDeEntrada.offer(new Pessoa("Luiz",28));
        filaDeEntrada.offer(new Pessoa("David",27));
        filaDeEntrada.offer(new Pessoa("Marco",65));
        filaDeEntrada.offer(new Pessoa("José",70));
        filaDeEntrada.offer(new Pessoa("Pedro",20));
        filaDeEntrada.offer(new Pessoa("Thais",20));
        filaDeEntrada.offer(new Pessoa("Andressa",25));

        while (!filaDeEntrada.isEmpty()) {
            System.out.println("Proxima leva de 4 passageiros");
            for( int i=0; i < 4 && !filaDeEntrada.isEmpty();i++){
            System.out.println("A pessoa " + filaDeEntrada.peek().getNome() + " está embarcando");
            Pessoa p = filaDeEntrada.poll();
            areaDeEmbarque.push(p);
        }

        System.out.println("Passageiro entrando e sentando de traz pra frente!");
        while (!areaDeEmbarque.isEmpty()) {
            Pessoa p = areaDeEmbarque.pop();
            System.out.println("A pessoa "+p.getNome()+" sentou no onibus");
        }

        System.out.println("embarque concluido!");

    }
}
}