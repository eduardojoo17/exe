public class calculadoraSalario {
    public static void main(String[] args) {
        double  salario=1600.74;
        double  salarioComDesconto;

        if(salario <= 1751.81){
            salarioComDesconto = salario -(salario *8/100);
            System.out.println(" seu salario é "+salario+" e depois do desconto do inss fica: "+salarioComDesconto);
        
        }else if(salario <= 2919.72){
            salarioComDesconto = salario -(salario *9/100);
            System.out.println(" seu salario é "+salario+" e depois do desconto do inss fica: "+salarioComDesconto);

    }else if(salario <= 5839.45){
        salarioComDesconto = salario -(salario *10/100);
        System.out.println(" seu salario é "+salario+" e depois do desconto do inss fica: "+salarioComDesconto);
}else {
    salarioComDesconto = salario -(salario *11/100);
    System.out.println(" seu salario é "+salario+" e depois do desconto do inss fica: "+salarioComDesconto);
    }
    }
}
