import java.util.Scanner;
public class listaDeCompras {
    public static void main(String[] args) {
        String[]merc = new String[5];
    Scanner ler = new Scanner(System.in);
        

        for(int i=0;i<5;i++){
        System.out.println("digite suas compras do supermercado: ");
        merc[i] = ler.nextLine();
    
    }
    ler.close();
    System.out.println(merc);
    }

}
