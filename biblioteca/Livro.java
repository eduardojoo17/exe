package biblioteca;

public class Livro {
    String titulo;
    String anoPublicacao;
    Autor autor;
    public Livro(String titulo, String anoPublicacao, String autor){
        this.titulo = titulo;
        this.anoPublicacao= anoPublicacao;
        this.autor = autor;
    }
}
