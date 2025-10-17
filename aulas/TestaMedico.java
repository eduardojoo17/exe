package aulas;

import java.util.Scanner;

public class TestaMedico {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Medico medico1 = new Medico(12345, "Ana Maria", 0, 250);
        Medico medico2 = new Medico(45678, "Antonio", 0, 300);
        Medico medico3 = new Medico(8985, "José", 0, 350);

        System.out.println("---Sistema Clinica---");
        System.out.printf("---Adicione o novo valor da consulta do medico %s ---", medico2.getNome());
        double consulta;
        if (sc.hasNextDouble()) {
            consulta = sc.nextDouble();
            medico2.setValorDaConsulta(consulta);

        } else {
            System.out.println("entrada invalida");
        }

        medico1.pagamentoDinheiro(medico1.getValorDaConsulta());
        medico2.pagamentoDinheiro(medico2.getValorDaConsulta());
        medico3.pagamentoDinheiro(medico3.getValorDaConsulta());

        System.out.println("nome: " + medico1.getNome() + "salario" + medico1.getSalario());
        System.out.println("nome: " + medico2.getNome() + "salario" + medico1.getSalario());
        System.out.println("nome: " + medico3.getNome() + "salario" + medico1.getSalario());
        System.out.println("Total de médicos cadastrados: " + Medico.getTotalMedicos());

    }
}
