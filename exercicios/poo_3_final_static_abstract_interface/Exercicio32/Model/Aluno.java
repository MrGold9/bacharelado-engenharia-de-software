package exercicios.poo_3_final_static_abstract_interface.Exercicio32.Model;


public class Aluno extends Pessoa
{
    
    private String curso;
    private int fase;

    public Aluno() {
    }

    public Aluno(String curso, int fase, int id, String nome, int idade) {
        super(id, nome, idade);
        this.curso = curso;
        this.fase = fase;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }
    
    
    public boolean verificarFormando()
    {
        if (fase == 10) 
        {
            return true;
        } 
        
        else 
        {
            return false;
        }
    }
    
    // Exemplo de Overload
    public boolean verificarFormando(int fase) 
    {
        if (fase == 10) 
        {
            return true;
        }
        
        else 
        {
            return false;
        }
    }
    
    public void maiorDeIdade()
    {
        if (getIdade() >= idadeMaioridade) 
        {
            System.out.println("Esta pessoa é maior de idade");
        }
        else
        {
            System.out.println("Esta pessoa é menor de idade");
        }
    }
    
    // Exemplo de Override
    @Override
    public void mostrarDados() 
    {
        System.out.println("ID: " + getId());
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Curso: " + this.curso);
        System.out.println("Fase: " + this.fase);
    }

}
