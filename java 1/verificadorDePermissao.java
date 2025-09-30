public class verificadorDePermissao {
    public static void main(String[] args) {
        float altura = 1.55f;
        boolean estaAcompanhada =true;

        if(altura>=1.60f || estaAcompanhada){
            System.out.println("pode entrar no brinquedo");
        }else{
            System.out.println("entrada negada");
        }

    }
}
