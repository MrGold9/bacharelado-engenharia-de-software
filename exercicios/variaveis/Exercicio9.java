package exercicios.variaveis;

import javax.swing.JOptionPane;


public class Exercicio9 {


    public static void main(String[] args) 
    {
        
        int peso;
        double altura, imc;
        
        peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu "
                + "peso em KG: "));        
        
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua "
                + "altura em metros utilizando '.' para casas decimais: "));
        
        imc = peso / (altura * altura);
        
        JOptionPane.showMessageDialog(null, "Seu IMC é igual a: "
                + imc);
        
        
    }
    
}
