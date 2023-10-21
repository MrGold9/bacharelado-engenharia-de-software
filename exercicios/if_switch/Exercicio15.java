package exercicios.if_switch;

import javax.swing.JOptionPane;

public class Exercicio15 {


    public static void main(String[] args) 
    {
        
        String nome;
        int idade;
        
        nome = JOptionPane.showInputDialog("Insira o seu nome");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a sua idade"));
        
        if (idade >= 15 && idade <= 25) 
        {
            JOptionPane.showMessageDialog(null, "ACEITA");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "NÃO ACEITA");
        }
        
    }
    
}
