/*Crie a classe BoletimEscolar, um sistema para gerenciar as 
notas da turma. Utilizando JOptionPane para uma interface mais
interativa, o programa deve solicitar as 4 notas bimestrais para 3 alunos 
diferentes, armazenando tudo em uma matriz 3x4. Os
prompts de entrada devem ser claros (ex: "Digite a 2a nota do Aluno 1"). 
Ao final do preenchimento, o sistema deve calcular a
média final de cada aluno (a média de cada linha da matriz) e exibir um 
relatório único com o resultado de todos.*/



import javax.swing.JOptionPane;

public class BoletimEscolar {
    public static void main(String[] args) {
        int[][]notas = new int[3][4];
        double[]media=new double[3];
        


            
        for(int i =0;i<notas.length;i++){
            for(int j =0;j<notas[i].length;j++){
            String input = JOptionPane.showInputDialog(null, "digite a "+(j+1)+"° nota "+(i+1)+"° aluno: ");
            notas[i][j] = Integer.parseInt(input);
              
               
            }
        }

         
        for (int i = 0; i < 3; i++) {
            int soma = 0;
            for (int j = 0; j < 4; j++) {
                soma = soma + notas[i][j];
            }
            media[i] = soma / 4.0;
        }
           
        for(int i=0;i<3;i++){
            String input = JOptionPane.showInputDialog("a media das notas do "+(i+1)+" aluno",media[i]);
        }
    }
}
