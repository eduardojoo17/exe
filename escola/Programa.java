package escola;

import java.util.Scanner;

public class Programa {
   public static void main(String[] args) {
    Escola senai = new Escola("curso TI",10);
    String nome;
    int mat;
    Scanner ler = new Scanner(System.in);

    System.out.println("digite o nome do aluno: ");
    nome = ler.nextLine();
    System.out.println("Digite a matricula do aluno: ");
    mat = ler.nextInt();

    Aluno novoAluno = new Aluno(nome ,mat);
    senai.matricular(novoAluno);
    ler.close();


   } 
}
