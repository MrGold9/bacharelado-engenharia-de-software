package exercicios.poo_3_final_static_abstract_interface.Exercicio33.Model;


public class Ave implements Animal
{
    
    public int numPatas = 2;
    public String reproducao = "ov�paro";

    @Override
    public void mostrarDados() 
    {
        System.out.println("A ave possui " + numPatas + " patas");
        System.out.println("O m�todo de reprodu��o da ave �: " + reproducao);
    }

}
