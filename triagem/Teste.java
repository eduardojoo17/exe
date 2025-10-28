package triagem;

import aula10.FilaCircular.FilaCircular;

public class Teste {
    public static void main(String[] args) {
        Pessoa p1 =new Pessoa(25);
        Pessoa p2 =new Pessoa(65);
        Pessoa p3 =new Pessoa(70);
        Pessoa p4 =new Pessoa(30);
        Pessoa p5 =new Pessoa(40);

        System.out.println("---- Fila de pessoas ----");
        FilaPrincipal fila = new FilaPrincipal(5);
        fila.dequeue();
        fila.enqueue(p1);
        fila.enqueue(p2);
        fila.enqueue(p3);
        fila.enqueue(p4);
        
        System.out.println("Olhando quem está na frente: "+ fila.front().toString());
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        fila.dequeue();
        fila.enqueue(p1);
        fila.enqueue(p2);

    }
}
