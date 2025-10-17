package aulas;

public class Medico {
    private int crm;
    private String nome;
    private double salario;
    private double ValorDaConsulta;
    private static int totalMedicos;

    public Medico(int crm, String nome, double salario, double valorDaConsulta) {
        this.crm = crm;
        this.nome = nome;
        this.salario = salario;
        ValorDaConsulta = valorDaConsulta;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Salario não pode ser negativo");
        }

    }

    public double getValorDaConsulta() {
        return ValorDaConsulta;
    }

    public void setValorDaConsulta(double valorDaConsulta) {
        if (salario > 0) {
            ValorDaConsulta = valorDaConsulta;
        } else {
            System.out.println("o Valor da consulta não pode ser negativo");
        }

    }

    public static int getTotalMedicos() {
        return totalMedicos;
    }

    public static void setTotalMedicos(int totalMedicos) {
        Medico.totalMedicos = totalMedicos;
    }

    public void pagamentoDinheiro() {
        this.salario += this.valorConsulta;
    }

    public void pagamentoPlano(double valorConsulta) {
        this.salario += this.valorConsulta * 0.8;

    }
}
