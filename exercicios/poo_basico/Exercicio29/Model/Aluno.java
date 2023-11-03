package exercicios.poo_basico.Exercicio29.Model;

import java.util.Scanner;


public class Aluno 
{
    Scanner entrada = new Scanner(System.in);
    
    String nome, nomePai, nomeMae;
    int idade;
    double notaUm, notaDois, notaTres;

    public Aluno() {
    }

    public Aluno(String nome, String nomePai, String nomeMae, int idade) {
        this.nome = nome;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNotaUm() {
        return notaUm;
    }

    public void setNotaUm(double notaUm) {
        this.notaUm = notaUm;
    }

    public double getNotaDois() {
        return notaDois;
    }

    public void setNotaDois(double notaDois) {
        this.notaDois = notaDois;
    }

    public double getNotaTres() {
        return notaTres;
    }

    public void setNotaTres(double notaTres) {
        this.notaTres = notaTres;
    }
    
    public void calcularMediaNotas()
    {
        double media;
        
        System.out.println("Digite a primeira nota do aluno: ");
        notaUm = entrada.nextDouble();
        
        System.out.println("Digite a segunda nota do aluno: ");
        notaDois = entrada.nextDouble();
        
        System.out.println("Digite a terceira nota do aluno: ");
        notaTres = entrada.nextDouble();
        
        media = (notaUm + notaDois + notaTres) / 3;
        
        System.out.printf("A média do aluno é: %.2f \n", media);
    }
    
}
