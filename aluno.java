public class aluno {
    
        String nome;
        int matricula;
        double notaFinal;

        public static void main(String[] args) {
            aluno aluno1 = new aluno();

            aluno1.nome = "Carlos Pereira";
            aluno1.matricula = 201;
            aluno1.notaFinal = 7.5;

            System.out.println(" Matricula do aluno: "+aluno1.matricula);
    }
    
}
 