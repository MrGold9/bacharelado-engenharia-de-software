package exercicios.poo_basico.Exercicio27.Model;


public class Aluno 
{
    
    private String nome;
    private int idade;
    //valor da altura deve ser inserido em centímetros
    private double altura;
    private double peso;

    
    //Construtores
    public Aluno() {
    }

    public Aluno(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    
    
    //Getters e Setters
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    public void calcularIMC()
    {
        double alturaEmMetros = altura / 100;
        double imc = (peso / (alturaEmMetros * alturaEmMetros));
        
  
        System.out.printf("O IMC do aluno é aproximadamente: %.2f \n", imc);
    }
    
    
}
