package exercicios.if_switch;

import javax.swing.JOptionPane;


public class Exercicio18 {

    
    public static void main(String[] args) 
    {
        
        String nomeCliente;
        double precoProd;
        char categProd;
        
        
        
        nomeCliente = JOptionPane.showInputDialog("Digite o nome "
                + "do cliente");
        precoProd = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco "
                + "do produto"));
        categProd = JOptionPane.showInputDialog("Digite a categoria "
                + "do produto"
                + "\nA - 10%"
                + "\nB - 15%"
                + "\nC - 20%"
                + "\nD - 25%"
                + "\nE - 50%").toUpperCase().charAt(0);

        
        switch (categProd) {
            case 'A':
                precoProd = precoProd - (precoProd * 0.1);
                JOptionPane.showMessageDialog(null, "O preço do produto é: "
                        + precoProd);
                break;
                
            case 'B':
                precoProd = precoProd - (precoProd * 0.15);
                JOptionPane.showMessageDialog(null, "O preço do produto é: "
                        + precoProd);
                break;
                
            case 'C':
                precoProd = precoProd - (precoProd * 0.2);
                JOptionPane.showMessageDialog(null, "O preço do produto é: "
                        + precoProd);
                break;
                
            case 'D':
                precoProd = precoProd - (precoProd * 0.25);
                JOptionPane.showMessageDialog(null, "O preço do produto é: "
                        + precoProd);
                break;
                
            case 'E':
                precoProd = precoProd - (precoProd * 0.5);
                JOptionPane.showMessageDialog(null, "O preço do produto é: "
                        + precoProd);
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "Escolha inválida!");
        }
        
    }
    
    
}
