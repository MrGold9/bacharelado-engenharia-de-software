package exercicios.erros_encapsulamento_polimorfismo;

import javax.swing.JOptionPane;


public class Exercicio37 {


    public static void main(String[] args) 
    {
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
        int n = 0;
        
        try 
        {
            n = n1 / n2; // se for uma divisão por zero vai dar erro.
        } 
        catch (ArithmeticException erro) 
        {
            JOptionPane.showMessageDialog(null, "Não existe divisão por zero!");
        }
        finally
        {
            System.out.println("O valor de n é: " + n);
        }
        
        
    }

}
