package provaA1.questaoDois;

import java.util.Scanner;


public class LivroDeNotas 
{
    Scanner entrada = new Scanner(System.in);
    
    private int numeroAlunos;
    public double somaNotasGlobal;

    public LivroDeNotas() 
    {}
    
    public int getNumeroAlunos() 
    {
        return numeroAlunos;
    }

    public void setNumeroAlunos(int numeroAlunos) 
    {
        this.numeroAlunos = numeroAlunos;
    }
    

    public void calcularMediaDeCadaAluno()
    {   
        System.out.println("Qual a quantidade de alunos? ");
        numeroAlunos = entrada.nextInt();
        setNumeroAlunos(numeroAlunos);
        
        double somaNotas = 0;
        double mediaAluno[] = new double[getNumeroAlunos()];
        
        //Calcular a media de cada aluno
        for (int i = 0; i < getNumeroAlunos(); i++) 
        {
            double a1 = 0, a2 = 0, a3 = 0;
            
            System.out.println("Digite a nota da A1 do aluno " + i + ":");
            a1 = entrada.nextDouble();
            System.out.println("Digite a nota da A2 do aluno " + i + ":");
            a2 = entrada.nextDouble();
            System.out.println("Digite a nota da A3 do aluno " + i + ":");
            a3 = entrada.nextDouble();
            
            //Desconheço os critérios da São Judas para com as notas
            mediaAluno[i] = (a1 + a2 + a3) / 3;
        }
        
        
        //Percorrer o vetor mostrando a média
        System.out.println("A média de cada aluno é: ");
        for (int i = 0; i < getNumeroAlunos(); i++) 
        {
            System.out.println(mediaAluno[i] + "\n");
            
            somaNotas += mediaAluno[i];
        }
        somaNotasGlobal = somaNotas;
    }

    public void calcularMediaDaTurma()
    {
        double mediaTurma = somaNotasGlobal / getNumeroAlunos();
        
        System.out.println("A média da turma é: " + mediaTurma);
    }

}
