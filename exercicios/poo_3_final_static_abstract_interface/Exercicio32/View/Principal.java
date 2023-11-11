package exercicios.poo_3_final_static_abstract_interface.Exercicio32.View;

import exercicios.poo_3_final_static_abstract_interface.Exercicio32.Model.Aluno;


public class Principal {


    public static void main(String[] args) 
    {
        
        Aluno aluno = new Aluno("Agronomia", 5, 1, "Marcelo", 23);
        
        aluno.mostrarDados();
        aluno.maiorDeIdade();
        
    }
    
}
