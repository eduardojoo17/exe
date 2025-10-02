package biblioteca;

public class escritor {
    public static void main(String[] args) {
        Autor gusAutor = new Autor();
        gusAutor.nome = "Gustavo";
        gusAutor.nacionalidade= "Brasileiro";

        Livro HomemTarantula = new Livro();

        HomemTarantula.titulo = "O espetacular Homem Tarantula";
        HomemTarantula.anoPublicacao= "2025";
        
        HomemTarantula.autor = gusAutor;


        System.out.println("O livro "+HomemTarantula.titulo+" foi escrito por "+gusAutor.nome);

    }
}
