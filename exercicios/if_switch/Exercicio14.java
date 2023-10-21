package exercicios.if_switch;

import javax.swing.JOptionPane;


public class Exercicio14 {


    public static void main(String[] args) 
    {
        
        int anoAtual, anoNascimento, idade;
        
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual"));
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Insira o seu ano "
                + "de nascimento"));
        
        if (anoNascimento >= anoAtual && anoNascimento > 0) 
        {
            JOptionPane.showMessageDialog(null,"O ano de nascimento "
                    + "inserido é inválido!");
        }
        else
        {
            idade = anoAtual - anoNascimento;
            JOptionPane.showMessageDialog(null, "Você possui "
            + idade + " anos de idade");
        }
        
    }
    
}
