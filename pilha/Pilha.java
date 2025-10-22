package pilha;

public class Pilha {
    private Pessoa [] elementos;
    private int topo;
    private int capacidade;

    public Pilha(int capacidade){
        this.capacidade=capacidade;
        this.elementos = new Pessoa[capacidade];
        this.topo = -1;
    }
    public void push(Pessoa elemento){
        if(topo==capacidade-1){
            System.out.println("A pilha esta cheia! Não foi possivel adicionar o "+elemento.getNome());
        return;
    }
         topo ++;
        elementos[topo]=elemento;
        System.out.println("A pessoa: "+elemento.getNome()+" foi adicionada no topo da pilha!");
    }
public Pessoa peek(){
if(isEmpty()){
    System.out.println("A pilha esta vazia!");
    return null;
}
return elementos[topo];
}

public Pessoa pop(){
    if(isEmpty()){
        System.out.println("A pilha esta vazia!");
        return null;
    }
    Pessoa p =elementos[topo];
    elementos[topo]=null;
    topo --;
    System.out.println("A pessoa "+p.getNome()+"Foi removida do topo da sua pilha");
    return p;
    }
    
    public boolean isEmpty(){
        return topo ==-1;
    }
    
    public int tamanho(){
        return topo +1;
    }
}
