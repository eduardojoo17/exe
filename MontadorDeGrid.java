import java.util.Arrays;
import java.util.Scanner;
public class MontadorDeGrid {
    public static void main(String[] args) {
       int[][] grid = new int[3][3];
       
        Scanner ler = new Scanner(System.in);


        for(int i=0;i < grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                System.out.println("digite o numero da linha "+(i+1)+" da coluna "+(j+1));
                grid[i][j] = ler.nextInt();
                 
            }


    }  

System.out.println();

 for(int i=0;i < grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                System.out.print(grid[i][j]);

                System.out.print(" ");
                 

            }
System.out.println();
    }  




}
}
