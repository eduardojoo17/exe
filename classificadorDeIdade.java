public class classificadorDeIdade {
    public static void main(String[] args) {
        int idade =17;
        String clas;
        if (idade <12){clas = "criança";
            }
            else if (idade <18){ clas ="adolescente" ;
            }
            else if (idade <65){ clas ="adulto" ;
        }
        else { clas ="idoso" ;
    }
    System.out.println("a pessoa e: "+clas);
    }
}
