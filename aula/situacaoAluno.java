



public class situacaoAluno {
    public static void main(String[] args) {
        double nota1 = 7, nota2 =6;
        double media = (nota1=nota2)/2;

        if (media ==10){
            System.out.println("sua media foi: "+media+". Aprovado! Parabens");
        
        }else if(media>=7){
            System.out.println("sua media foi: "+media+". Aprovado");
        }else{
            System.out.println("sua media foi: "+media+". Reprovado");
        }
    }
}
