package exercicios.variaveis;

import javax.swing.JOptionPane;


public class Exercicio8 
{

    public static void main(String[] args) 
    {
        
        
        int num1, num2, soma;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número: "));        
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número: "));
        
        soma = num1 + num2;
        
        JOptionPane.showMessageDialog(null, soma);
        
        
        
    }
    
}
