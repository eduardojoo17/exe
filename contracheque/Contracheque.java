package contracheque;

import javax.swing.JOptionPane;

public class Contracheque {
    public static void main(String[] args) {
        String nome;
        double slBruto, salariodesconto = 0, Inss = 0, VT = 0;

        Funcionario funcionario = new Funcionario("Adriano", 3000);
        nome = funcionario.getNome();
        slBruto = funcionario.getSalario();

        Inss = Funcionario.calcularInss(slBruto);
        VT = Funcionario.calcularValeTransporte(slBruto);

        salariodesconto = slBruto - (Inss + VT);

        JOptionPane.showMessageDialog(null, "Funcionario:" + nome + "\nsalario: " + slBruto + "\nInss: " + Inss
                + "\nVale Transporte: " + VT + "\nSalario liquido: " + salariodesconto);

    }
}
