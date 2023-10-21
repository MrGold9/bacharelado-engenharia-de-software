package exercicios.if_switch;

import javax.swing.JOptionPane;


public class Exercicio16 {

    
    public static void main(String[] args) 
    {
        
        int num1, num2, resultado, operacoes;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o "
                + "primeiro número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o "
                + "segundo número"));
        
        operacoes = Integer.parseInt(JOptionPane.showInputDialog("Qual operação "
                + "deseja realizar? \n1 - Adição \n2 - Subtração \n3 - Multiplicação "
                + "\n4 - Divisão"));
        switch (operacoes) 
        {
            case 1:
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null,num1 + " + " + num2 + " = "
                + resultado);
                break;
                
            case 2:
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null,num1 + " - " + num2 + " = "
                + resultado);
                break;
                
            case 3:
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null,num1 + " * " + num2 + " = "
                + resultado);
                break;
                
            case 4:
                resultado = num1 / num2;
                JOptionPane.showMessageDialog(null,num1 + " / " + num2 + " = "
                + resultado);
                break;
                
            default:
                JOptionPane.showMessageDialog(null,"Opção inválida!");
        }
        
    }
    
}
