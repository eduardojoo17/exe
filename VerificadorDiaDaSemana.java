public class VerificadorDiaDaSemana {
    public static void main(String[] args) {
       int diaDaSemana = 2; 

       switch (diaDaSemana) {
        case 1:
            System.out.println(diaDaSemana+ " Domingo - Fim de semana ");
            break;
            case 2:
            System.out.println(diaDaSemana+" Segunda - dia util ");
            break;
            case 3:
            System.out.println(diaDaSemana +" Terca - dia util ");
            break;
            case 4:
            System.out.println(diaDaSemana+" quarta - dia util ");
            break;
            case 5:
            System.out.println(diaDaSemana+" quinta - dia util ");
            break;
            case 6:
            System.out.println(diaDaSemana+ " Sexta - Dia util ");
            break;
            case 7:
            System.out.println(diaDaSemana+ " Sabado - Fim de semana ");
            break;
           
        default:
            System.out.println("não existe");
            break;
       }

    }
}
