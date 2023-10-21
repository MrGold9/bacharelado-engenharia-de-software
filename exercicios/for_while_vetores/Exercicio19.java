package exercicios.for_while_vetores;

import javax.swing.JOptionPane;


public class Exercicio19 {


    public static void main(String[] args) 
    {
        
        String frase;
        int repeticoes;
        
        frase = JOptionPane.showInputDialog("Digite a frase que deseja ser repetida");
        repeticoes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de repetições"));
        
        for (int i = 0; i < repeticoes; i++) 
        {
            JOptionPane.showMessageDialog(null, frase);
        }
        
        
    }
    
}
