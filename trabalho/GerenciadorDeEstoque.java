package trabalho;
import java.util.Scanner;
public class GerenciadorDeEstoque {
     public static void main(String[] args){
          Produto[]Produtos = null;
          
          int num;

          Scanner ler = new Scanner(System.in);
do{

      System.out.println("\n--- Gerenciador de Estoque ---");
              System.out.println("1. Cadastrar Produtos");
              System.out.println("2. Buscar Produto por Código");
              System.out.println("3. (Outra Opção)");
              System.out.println("4. (Outra Opção)");
              System.out.println("5. Sair");
              System.out.print("Digite a opção desejada: -->  ");
     num = ler.nextInt();
     
     
     switch (num) {
          case 1:
          Produtos = Menu.MenuDeCadastro();
          break;
          case 2:
          if (Produtos==null) {
               System.out.println("Nenhum produto foi cadastrado");
               
          } else {
               
               long busca;
               Produto encontrado;
               
                    System.out.println("digite o codigo do produto que deseja achar:");
                    busca = ler.nextLong();
                    encontrado = Menu.buscaPorCodigo(Produtos,busca);
                   if ( encontrado != null) { 

                    System.out.println("seu Produto --> "+encontrado.nome+ "| o Codigo -->"+encontrado.codigo);
               }else{
                    System.out.println("Produto não encontrado | Codigo digitado --> "+busca);
               }

              
          }  
          break;
          
          default:System.out.println(" opção invalida");
          break;
     }
     
}while (num != 5);
     

     
        
       
        
     }  
}

 
