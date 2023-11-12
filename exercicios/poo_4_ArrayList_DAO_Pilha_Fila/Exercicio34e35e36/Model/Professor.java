package exercicios.poo_4_ArrayList_DAO_Pilha_Fila.Exercicio34e35e36.Model;


public class Professor extends Pessoa
{
    
    private double salario;
    private String titulo;

    public Professor() {
    }

    public Professor(double salario, String titulo, int id, String nome, int idade) {
        super(id, nome, idade);
        this.salario = salario;
        this.titulo = titulo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    public double calcularImposto()
    {
        double aliquota = 0.2;
        double impostos = salario * aliquota;
        
        return impostos;
    }
    
    //Overload
    public double calcularImposto(double salario)
    {
        double aliquota = 0.2;
        double impostos = salario * aliquota;
        
        return impostos;
    }
    
    //Override
    @Override
    public void mostrarDados() 
    {
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Idade" + getIdade());
        System.out.println("Salário: " + this.salario);
        System.out.println("Título: " + this.titulo);
    }

}
