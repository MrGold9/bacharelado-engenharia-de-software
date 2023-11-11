package exercicios.poo_3_final_static_abstract_interface.Exercicio33.View;

import exercicios.poo_3_final_static_abstract_interface.Exercicio33.Model.Animal;
import exercicios.poo_3_final_static_abstract_interface.Exercicio33.Model.Ave;
import exercicios.poo_3_final_static_abstract_interface.Exercicio33.Model.Cachorro;


public class Principal {


    public static void main(String[] args) 
    {
        
        Ave ave = new Ave();
        Cachorro cachorro = new Cachorro();
        
        ave.mostrarDados();
        cachorro.mostrarDados();
        
        System.out.println("Todos os animais possuem sentidos sensoriais? " + Animal.sentidosSensoriais);
        System.out.println("Todos os animais são heterotróficos? " + Animal.heterotrofico);
        
    }

}
