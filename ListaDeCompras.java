/*Crie uma classe chamada ListaDeCompras que funcione como um assistente pessoal. 
O programa deve solicitar ao usuário, via
Scanner, que digite 5 itens de supermercado. 
Armazene cada item em um vetor de String e, ao final, exiba a lista completa de
forma organizada no console.*/

import java.util.Arrays;
import java.util.Scanner;
public class ListaDeCompras {
    public static void main(String[] args) {
        String[] itens = new String[5];
        
Scanner ler = new Scanner(System.in);

System.out.println("\ndigite seus itens para as compras no supermercado: ");
        for(int i =0;i<itens.length;i++){
        System.out.println("Seu "+ i+1+" item: ");
        itens[i] = ler.nextLine();
        }
         System.out.println("Seus itens são: "+Arrays.toString(itens));
    }
    
    }
    

