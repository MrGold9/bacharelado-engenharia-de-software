package exercicios.if_switch;

import javax.swing.JOptionPane;


public class Exercicio12 {


    public static void main(String[] args) 
    {
        
        int num1, num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro "
                + "número inteiro"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo "
                + "número inteiro"));
        
        if (num1 > num2) 
        {
            JOptionPane.showMessageDialog(null, "O primeiro número "
                    + "digitado é maior que o segundo");
        }
        else if (num2 > num1)
        {
            JOptionPane.showMessageDialog(null, "O segundo número "
                    + "digitado é maior que o primeiro");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Os números são "
                    + "iguais");
        }
        
    }
    
}
