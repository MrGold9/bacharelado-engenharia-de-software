package exercicios.for_while_vetores;


import javax.swing.JOptionPane;

public class Exercicio24 {


    public static void main(String[] args) 
    {
        int cont = 13;
        
        do 
        {
            
            if (cont % 2 == 0) 
            {
                JOptionPane.showMessageDialog(null,cont);
            }
            
            cont++;
        } while (cont <= 23);
        
    }
    
}
