package exercicios.poo_4_ArrayList_DAO_Pilha_Fila.Exercicio34e35e36.View;
import exercicios.poo_4_ArrayList_DAO_Pilha_Fila.Exercicio34e35e36.Model.Professor;
import java.util.*;


public class ListaDeArrays {


    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<Professor> professores = new ArrayList<Professor>();
        char escolha = 's';
        
        //Pedindo para o usuário inserir os dados
        System.out.println("Deseja inserir um aluno no banco de dados? (s/n)");
        escolha = entrada.next().charAt(0);
        while(escolha == 's')
        {
            Professor professor = new Professor();
            
            entrada.nextLine(); //Consumir quebra de linha
            
            System.out.println("Digite o ID: ");
            int idDigit = entrada.nextInt();
            professor.setId(idDigit);
            
            entrada.nextLine(); //Consumir quebra de linha
            
            System.out.println("Digite o nome do professor: ");
            String nomeDigit = entrada.nextLine();
            professor.setNome(nomeDigit);
            
            System.out.println("Digite a idade: ");
            int idadeDigit = entrada.nextInt();
            professor.setIdade(idadeDigit);
            
            entrada.nextLine(); //Consumir quebra de linha
            
            System.out.println("Digite o salário: ");
            int salarioDigit = entrada.nextInt();
            professor.setSalario(salarioDigit);
            
            entrada.nextLine(); //Consumir quebra de linha
            
            System.out.println("Digite o título: ");
            String tituloDigit = entrada.nextLine();
            professor.setTitulo(tituloDigit);
            
            
            System.out.println("Deseja inserir um aluno no banco de dados novamente? (s/n)");
            escolha = entrada.next().charAt(0);
            
            //Colocando objeto dentro do ArrayList
            professores.add(professor);   
        }
        
        
        //Percorrer e mostrar os elementos
        for (Iterator it = professores.iterator(); it.hasNext();) 
        {
            Professor c = (Professor) it.next();
            System.out.println(c.getId() + " - " + c.getNome());
        }
        
        
        System.out.println("O tamanho do array é: " + professores.size());
        
        System.out.println("Removendo o professor " + professores.remove(0).getNome());
        
        //Removendo todos os elementos
        professores.clear();
        
        //Verificando se o array possui elementos
        if (professores.contains(0) == false) 
        {
            System.out.println("O array está vazio");
        }
        else
        {
            System.out.println("O array possui elementos");
        }
    }

}
