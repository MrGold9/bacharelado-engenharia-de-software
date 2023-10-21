package exercicios.for_while_vetores;


import javax.swing.JOptionPane;


public class Exercicio23 {
//não terminado

    public static void main(String[] args) 
    {
        
        int numInicial, numFinal;
        int contLoop = 0;
        int somaNums = 0;
        int intervalo = 0;
        int contIntervalo = 0;
        
        numInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número "
                + "do intervalo"));
        numFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número "
                + "do intervalo"));
        
        intervalo = numFinal - numInicial;
        
        int nums[] = new int[intervalo];
        
        while (contLoop <= intervalo) 
        {
            nums[contLoop] = intervalo;
            contIntervalo = intervalo--;
            somaNums += nums[contLoop];
            JOptionPane.showMessageDialog(null,nums[contLoop] + "\n" + somaNums);
            
            contLoop++;
        }
        
    }
    
}
