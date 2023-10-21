package exercicios.if_switch;

import javax.swing.JOptionPane;


public class Exercicio17 {


    public static void main(String[] args) 
    {
        
        int profissao;
        
        profissao = Integer.parseInt(JOptionPane.showInputDialog("Qual a profissão do Tibúrcio? "
                + "\n1 - Engenheiro"
                + "\n2 - Programador"
                + "\n3 - Médico"
                + "\n4 - Advogado"
                + "\n5 - Designer"));
        
        switch (profissao) 
        {
            case 1:
                JOptionPane.showMessageDialog(null,"O Tibúrcio é "
                        + "engenheiro");
                break;
                
            case 2:
                JOptionPane.showMessageDialog(null,"O Tibúrcio é "
                        + "programador");
                break;
                
            case 3:
                JOptionPane.showMessageDialog(null,"O Tibúrcio é "
                        + "médico");
                break;
                
            case 4:
                JOptionPane.showMessageDialog(null,"O Tibúrcio é "
                        + "advogado");
                break;
                
            case 5:
                JOptionPane.showMessageDialog(null,"O Tibúrcio é "
                        + "designer");
                break;
                
            default:
                JOptionPane.showMessageDialog(null,"Tibúrcio é "
                        + "desempregado");
        }
        
        
        
    }
    
}
