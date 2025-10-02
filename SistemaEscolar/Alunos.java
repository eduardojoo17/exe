package SistemaEscolar;


public class Alunos {
    
        String nome;
        int matricula;
        double notaFinal;

        void verificarAprovacao(){                              //função
            if(notaFinal >=7.0){
                System.out.println(nome + " esta aprovado!");
            }else{
                System.out.println(nome + " esta em recuperacão!");
            }
            
        }
        void mostrarDados(int num){
               System.out.printf("os dados do %d aluno são: \n nome:  %s  \nMatricula: %d \nNota: %.2f\n",num,nome,matricula,notaFinal);
            }
    }
    

 