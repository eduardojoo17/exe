package pilha;

public class Pessoa {
    String nome;
    int idade;
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getidade() {
        return idade;
    }
    public void setidade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome:" + nome + ", idade:" + idade + "]";
    }
}