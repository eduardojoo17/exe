public class VerificadorDiaDaSemana {
    public static void main(String[] args) {
       int diaDaSemana = 2; 

       switch (diaDaSemana) {
        case 1,7:
            System.out.println(diaDaSemana+ " - Fim de semana - ");
            break;
            case 2,3,4,5,6:
            System.out.println(diaDaSemana+"  - dia util - ");
            break;
            
           
        default:
            System.out.println("não existe");
            break;
       }

    }
}

