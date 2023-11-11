package exercicios.poo_3_final_static_abstract_interface.Exercicio33.Model;


public class Cachorro implements Animal
{
    
    public int numPatas = 4;
    public String reproducao = "vivíparo";

    @Override
    public void mostrarDados()
    {
        System.out.println("O cachorro possui " + numPatas + " patas");
        System.out.println("O método de reprodução do cachorro é: " + reproducao);
    }

}
