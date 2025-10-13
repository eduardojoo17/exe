package trabalho;
import java.util.Scanner;

import buscaObjeto.Item;
public class Menu {
   
    public static Produto[] MenuDeCadastro() {
        Produto[] Produtos = new Produto[1];
        Scanner leia = new Scanner(System.in);

        for(int i= 0; i<Produtos.length; i++){
            System.out.println("Digite o produto");
            String nome = leia.nextLine();

            System.out.println("Digite o codigo");
            long codigo = leia.nextLong();
            leia.nextLine();

            System.out.println("Digite o preco");
            double preco = leia.nextDouble();
            leia.nextLine();

            System.out.println("Digite a categoria");
            String categoria = leia.nextLine();

            System.out.println("Digite a quantidade do seu estoque");
            int QuantidadeEmEstoque = leia.nextInt();
            leia.nextLine();


            
          
            Produtos[i] = new Produto(codigo, nome, categoria, preco, QuantidadeEmEstoque);
            
        }
        return Produtos;
             
    }
 
     
    public static Produto buscaPorCodigo(Produto[] vetor, long Busca) {
    for (int i = 0; i < vetor.length; i++) {
        if (vetor[i].codigo == Busca) {
            return vetor[i]; // achou o produto
        }
    }
    return null; // não encontrou
}
      
    }

   
    
    
