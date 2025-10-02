package correios;

public class Programa {
    public static void main(String[] args) {
        
        Endereco endDoJoao = new Endereco();
        endDoJoao.rua = "Rua das Flores";
        endDoJoao.numero = 123;
        endDoJoao.cep = "25680-000";
        endDoJoao.cidade = "Petrópolis";

        Pessoa joao = new Pessoa();
        joao.nome = "João Carlos";
        joao.cpf = "111.222.333-44";


        // conecta os dois objetos
        joao.endereco = endDoJoao;

System.out.println("O "+ joao.nome+ " mora na cidade de "+ joao.endereco.cidade);

    }
}
