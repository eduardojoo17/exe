/*
 Desenvolva uma classe CalculadoraDeMediaVetor para calcular a média de um aluno. 
Utilizando Scanner, o programa deve
solicitar as 4 notas bimestrais, armazenando-as em um vetor de double. 
Após a inserção de todas as notas, calcule a média final
e exiba o resultado formatado com duas casas decimais.
*/

import java.util.Scanner;
public class CalculadoraMediaVetor {
    public static void main(String[] args) {
        double[]notas = new double[4];
        double soma=0;

        System.out.println("Digite as notas bimestrais: ");
        Scanner ler = new Scanner(System.in);

        for(int i =0;i< notas.length;i++){
            System.out.println("digite a "+(i+1)+" nota:");
            notas[i]= ler.nextDouble();
            soma = soma + notas[i];
        }

            System.out.printf("a média final é: %.2f",soma/4);
    }
}
