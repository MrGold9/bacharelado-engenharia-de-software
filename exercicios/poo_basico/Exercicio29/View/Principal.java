package exercicios.poo_basico.Exercicio29.View;

import exercicios.poo_basico.Exercicio29.Model.Aluno;
import exercicios.poo_basico.Exercicio29.Model.Professor;


public class Principal {


    public static void main(String[] args) 
    {
        
        Aluno alunoUm = new Aluno("Jos�", "Jo�o", "Marilda", 16);
        
        Professor profUm = new Professor("Rodrigo", 54, 3400);
        
        alunoUm.calcularMediaNotas();
        profUm.calcularHoraExtra();
        
    }
    
}
