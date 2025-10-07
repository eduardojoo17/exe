package escola;

public class Escola {
    String nomeDoCurso;
    String sigla;
    Aluno[] alunosMatriculados;
    int vagasOcupadas;

    public Escola (String nome, int totalVagas){
        this.nomeDoCurso =nome;
        this.alunosMatriculados = new Aluno[totalVagas];
    }
    
    public void matricular(Aluno novoAluno){
        if(vagasOcupadas< alunosMatriculados.length){
            alunosMatriculados[vagasOcupadas] = novoAluno;
            vagasOcupadas++;
            System.out.println("matricula de "+ novoAluno.nome + " realizada!");
        }else{
            System.out.println("não há vagas disponiveis");
        }
    }
}
