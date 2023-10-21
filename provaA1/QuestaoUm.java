package provaA1;

import java.util.Scanner;


public class QuestaoUm {


    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        int escolherNum = 0, contPar = 0, contImpar = 0, contMultiploCinco = 0;
        
        while (escolherNum >= 0) 
        {
            System.out.println("Insira um número inteiro positivo (ou um número negativo para sair):");
            escolherNum = entrada.nextInt();
            

            if (escolherNum % 2 == 0 && escolherNum > 0) 
            {
                contPar++;
            }
            if(escolherNum % 5 == 0 && escolherNum > 0)
            {
                contMultiploCinco++;
            }
            if(escolherNum % 2 != 0 && escolherNum > 0)
            {
                contImpar++;
            }
        }
        
        System.out.println("Resultados: "
                + "\nNúmeros pares: " + contPar +
                "\nNúmeros ímpares: " + contImpar +
                "\nMúltiplos de 5: " + contMultiploCinco);
        
    }
    
}
