package exercicios.poo_basico.Exercicio27.View;

import exercicios.poo_basico.Exercicio27.Model.Aluno;
import exercicios.poo_basico.Exercicio27.Model.Funcionario;


public class Principal {


    public static void main(String[] args) 
    {
        //Settando o valor dos atributos ap�s a inst�ncia do objeto com
        //o m�todo set()
        Aluno alunoUm = new Aluno();
        alunoUm.setNome("Josivaldo");
        alunoUm.setIdade(45);
        alunoUm.setAltura(170);
        alunoUm.setPeso(70);
        
        alunoUm.calcularIMC();
        
        
        //Setando o valor dos atributos na inst�ncia do objeto
        Funcionario funcUm = new Funcionario("Jo�o", 23, 2500, "999.999.999-99");
        funcUm.calcularDecimoTerceiro();
        
    }
    
}
