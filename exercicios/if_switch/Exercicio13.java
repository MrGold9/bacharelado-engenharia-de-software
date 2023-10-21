package exercicios.if_switch;

import javax.swing.JOptionPane;


public class Exercicio13 {


    public static void main(String[] args) 
    {
        
        int salario, prestacao;
        
        salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor "
                + "bruto do salário"));
        
        prestacao = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor "
                + "da prestação"));
        
        if (prestacao > salario * 0.3) 
        {
            JOptionPane.showMessageDialog(null, "O empréstimo não pode "
                    + "ser concedido!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "O empréstimo pode "
                    + "ser concedido!");
        }
    }
    
}
