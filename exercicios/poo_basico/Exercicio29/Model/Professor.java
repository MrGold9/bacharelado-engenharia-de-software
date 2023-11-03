package exercicios.poo_basico.Exercicio29.Model;

import java.util.Scanner;


public class Professor 
{
    Scanner entrada = new Scanner(System.in);
    
    String nome;
    int idade;
    double salario;

    public Professor() {
    }

    public Professor(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
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
    
    public void calcularHoraExtra()
    {
        double horaAula = 16.65;
        double horasAdicionais;
        
        System.out.println("Qual o valor de horas adicionais prestadas? ");
        horasAdicionais = entrada.nextDouble();
        
        salario += horasAdicionais * horaAula;
        
        System.out.printf("O salário do professor junto das horas extras é: %.2f \n", salario);
    }
    
}
