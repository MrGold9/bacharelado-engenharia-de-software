package exercicios.poo_3_final_static_abstract_interface.Exercicio33.Model;


public class Cachorro implements Animal
{
    
    public int numPatas = 4;
    public String reproducao = "viv�paro";

    @Override
    public void mostrarDados()
    {
        System.out.println("O cachorro possui " + numPatas + " patas");
        System.out.println("O m�todo de reprodu��o do cachorro �: " + reproducao);
    }

}
