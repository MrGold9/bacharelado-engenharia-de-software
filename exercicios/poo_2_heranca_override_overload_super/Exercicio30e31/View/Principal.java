package exercicios.poo_2_heranca_override_overload_super.Exercicio30e31.View;

import exercicios.poo_2_heranca_override_overload_super.Exercicio30e31.Model.Aluno;
import exercicios.poo_2_heranca_override_overload_super.Exercicio30e31.Model.Funcionario;
import exercicios.poo_2_heranca_override_overload_super.Exercicio30e31.Model.Professor;


public class Principal {


    public static void main(String[] args) 
    {
        
        Aluno aluno1 = new Aluno("Engenharia de Produção", 7, 1, "Naldo", 22);
        
        Professor prof1 = new Professor(5000, "Mestre", 2, "Jefferson", 46);
        
        Funcionario func1 = new Funcionario();
        func1.setNumDependentes(0);
        func1.setSexo("Feminino");
        func1.setCargo("Coordenadora");
        func1.setId(3);
        func1.setNome("Edinalva");
        func1.setIdade(35);
        
        
        
        System.out.println("Aluno 1");
        aluno1.mostrarDados();
        aluno1.verificarFormando();
        aluno1.verificarFormando(10);
        System.out.println("");
        
        System.out.println("Professor 1");
        prof1.mostrarDados();
        prof1.calcularImposto();
        prof1.calcularImposto(6000);
        System.out.println("");
        
        System.out.println("Funcionário 1");
        func1.mostrarDados();
        func1.reducaoImpostoRenda();
        func1.reducaoImpostoRenda(3);
        System.out.println("");
        
    }
    
}
