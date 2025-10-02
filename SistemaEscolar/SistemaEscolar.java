package SistemaEscolar;
import java.util.Scanner;
public class SistemaEscolar {
    

    public static void main(String[] args) {
        Alunos[] turma = new Alunos[3];

        Scanner ler = new Scanner(System.in);




        for(int i =0;i<3;i++){
           turma[i] =new Alunos();
            System.out.printf("digite o %dº nome:\n",i+1); 
            turma[i].nome = ler.next();
            System.out.printf("digite a %dº matricula:\n",i+1);
            turma[i].matricula = ler.nextInt();
            System.out.printf("digite a %dº nota:\n",i+1);
            turma[i].notaFinal = ler.nextDouble();
            System.out.println("-------------------");
        }


// pode usar ler.nextLine() para fechar dentro do for pra ele não gerar o nome vazio.   -- no caso eu usei somente o next.

        for(int i =0;i<3;i++){
           System.out.println("-------------------");
           turma[i].mostrarDados(i+1);
            turma[i].verificarAprovacao();
        }

         
    }
}
