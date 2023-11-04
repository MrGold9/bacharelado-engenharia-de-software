package exercicios.poo_2_heranca_override_overload_super.Exercicio30e31.Model;


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
    
    // Exemplo de Override
    @Override
    public void mostrarDados() 
    {
        super.mostrarDados();
        System.out.println("Curso: " + this.curso);
        System.out.println("Fase: " + this.fase);
    }
    
}
