package biblioteca;

public class escritor {
    public static void main(String[] args) {
        Autor gusAutor = new Autor("gustavo", "Brasileiro");
        

        Livro HomemTarantula = new Livro("Homem Tarantula","2025",gusAutor);

        


        System.out.println("O livro "+HomemTarantula.titulo+" foi escrito por "+gusAutor.nome);

    }
}
