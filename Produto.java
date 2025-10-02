import java.util.Scanner;

public class Produto {
    String nome;
    int codigo;
    double preco;
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Produto produto1 = new Produto();
    
            System.out.println("digite o nome: ");
            produto1.nome = ler.nextLine();
            System.out.println("digite o codigo: ");
            produto1.codigo = ler.nextInt();
            System.out.println("digite o preço: ");
            produto1.preco = ler.nextDouble();

        

                System.out.println("\n\n   -      -      -  dados do produto cadastrado -    -      -");
                System.out.printf("Nome: %s  -  código: %d  -  preco %.2f",produto1.nome,produto1.codigo,produto1.preco);
ler.close();
    }
}

