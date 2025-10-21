package ICMS;
import java.util.Scanner;
public class icms {
    public static void main(String[] args) {
        String acao;
        Produto produto = new Produto("arroz",25.00,2);
        Scanner sc = new Scanner(System.in); 
        do {
            System.out.println("Produto: \n"+produto.getDescricao()+"\nvalor: \n"+produto.getValor()+"\nqtd: \n"+produto.getQuantidade());
            System.out.println("deseja encerrar o programa: S/n?");
            acao = sc.nextLine();

        }while(acao =="s");
    }
}
