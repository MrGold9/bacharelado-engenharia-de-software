package exercicios.if_switch;

import javax.swing.JOptionPane;


public class Exercicio11 {

  
    public static void main(String[] args) 
    {
        
        int num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número "
                + "inteiro"));
        
        if (num % 2 == 0) 
        {
            JOptionPane.showMessageDialog(null, "O número inserido é "
                    + "múltiplo de 2");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O número inserido "
                    + "não é múltiplo de 2");
        }
        
    }
    
}
