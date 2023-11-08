package exercicios.poo_2_heranca_override_overload_super.Exercicio30e31.Model;


public class Funcionario extends Pessoa
{
    
    private int numDependentes;
    private String sexo;
    private String cargo;

    public Funcionario() {
    }

    public Funcionario(int numDependentes, String sexo, String cargo, int id, String nome, int idade) {
        super(id, nome, idade);
        this.numDependentes = numDependentes;
        this.sexo = sexo;
        this.cargo = cargo;
    }

    public int getNumDependentes() {
        return numDependentes;
    }

    public void setNumDependentes(int numDependentes) {
        this.numDependentes = numDependentes;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    //Overload
    public boolean reducaoImpostoRenda()
    {
        if (numDependentes >= 1) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean reducaoImpostoRenda(int numDependentes)
    {
        if (numDependentes >= 1) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //Override
    @Override
    public void mostrarDados() 
    {
        super.mostrarDados();
        System.out.println("Número de dependentes: " + this.numDependentes);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Cargo: " + this.cargo);
    }
    
}
