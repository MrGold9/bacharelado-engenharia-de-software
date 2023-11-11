package exercicios.poo_2_heranca_override_overload_super.Exercicio30e31.Model;


public class Pessoa 
{
    
    private int id;
    private String nome;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
    
    public void fazerAniversario()
    {
        this.idade++;
    }
    
    public void mostrarDados()
    {
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
    
}
