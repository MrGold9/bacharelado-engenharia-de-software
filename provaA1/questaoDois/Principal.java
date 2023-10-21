package provaA1.questaoDois;

import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        LivroDeNotas notasAlunos = new LivroDeNotas();
        
        
        notasAlunos.calcularMediaDeCadaAluno();
        
        notasAlunos.calcularMediaDaTurma();
        
        
    }
    
}
