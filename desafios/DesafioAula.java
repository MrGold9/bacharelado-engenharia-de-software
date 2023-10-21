package desafios;

import javax.swing.JOptionPane;

public class DesafioAula {


    public static void main(String[] args) 
    {
        String numero;
        char numUnidade = ' ', numDezena = ' ', numCentena = ' ', numMilhar = ' ';
        
        numero = JOptionPane.showInputDialog("Insira um número entre 1 e 9999");
        
        
        
        if (numero.length() == 4) 
        {
            
            numUnidade = numero.charAt(3);
            numDezena = numero.charAt(2);
            numCentena = numero.charAt(1);
            numMilhar = numero.charAt(0);
            
            System.out.println("O milhar é: " + numMilhar);
            System.out.println("A centena é: " + numCentena);
            System.out.println("A dezena é: " + numDezena);
            System.out.println("A unidade é: " + numUnidade);
            
        }
        else if (numero.length() == 3) 
        {
            
            numUnidade = numero.charAt(2);
            numDezena = numero.charAt(1);
            numCentena = numero.charAt(0);
            
            System.out.println("A centena é: " + numCentena);
            System.out.println("A dezena é: " + numDezena);
            System.out.println("A unidade é: " + numUnidade);
            
        }
        else if (numero.length() == 2) 
        {
            
            numUnidade = numero.charAt(1);
            numDezena = numero.charAt(0);
            
            System.out.println("A dezena é: " + numDezena);
            System.out.println("A unidade é: " + numUnidade);
            
        }
        else
        {
            
            numUnidade = numero.charAt(0);
            
            System.out.println("A unidade é: " + numUnidade);
       
        }
        
        
        
    }
    
}
