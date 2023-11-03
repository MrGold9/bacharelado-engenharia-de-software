package exercicios.poo_basico.Exercicio27.Model;

import java.util.Scanner;


public class Funcionario 
{
    Scanner entrada = new Scanner(System.in);
    
    private String nome;
    private int idade;
    private double salario;
    private String cpf;

    public Funcionario() {
    }

    public Funcionario(String nome, int idade, double salario, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    public void calcularDecimoTerceiro()
    {
        int mesesTrabalhados;
        double decimoTerceiro;
        
        System.out.println("Quantos meses este funcionário trabalhou este ano? ");
        mesesTrabalhados = entrada.nextInt();
        
        decimoTerceiro = (salario / 12) * mesesTrabalhados;
        
        System.out.printf("O décimo terceiro deste funcionário é de %.2f reais \n", decimoTerceiro);
    }
    
}
