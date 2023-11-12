package exercicios.poo_4_ArrayList_DAO_Pilha_Fila.Exercicio34e35e36.View;
import exercicios.poo_4_ArrayList_DAO_Pilha_Fila.Exercicio34e35e36.Model.Aluno;
import java.util.*;


public class Pilha {


    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        char escolha = 's';
        
        Stack<Aluno> pilha = new Stack<Aluno>();
        pilha.push(new Aluno("Sistemas", 7, 1111, "Tiburcio", 95));
        pilha.push(new Aluno("Massagem", 2, 2222, "Marilene", 21));
        pilha.push(new Aluno("Culinaria", 4, 3333, "Rita", 46));
        pilha.push(new Aluno("Culinaria", 8, 4444, "Claude", 64));
        

        
        //Pedindo para o usuário inserir os dados
        System.out.println("Deseja inserir um aluno no banco de dados? (s/n)");
        escolha = entrada.next().charAt(0);
        while(escolha == 's')
        {
            
            Aluno aluno = new Aluno();
            
            entrada.nextLine(); //Consumir quebra de linha
            
            System.out.println("Digite o curso: ");
            String cursoDigit = entrada.nextLine();
            aluno.setCurso(cursoDigit);
            
            System.out.println("Digite a fase: ");
            int faseDigit = entrada.nextInt();
            aluno.setFase(faseDigit);
            
            entrada.nextLine(); //Consumir quebra de linha
            
            System.out.println("Digite o ID: ");
            int idDigit = entrada.nextInt();
            aluno.setId(idDigit);
            
            entrada.nextLine(); //Consumir quebra de linha
            
            System.out.println("Digite o nome do aluno: ");
            String nomeDigit = entrada.nextLine();
            aluno.setNome(nomeDigit);
            
            System.out.println("Digite a idade: ");
            int idadeDigit = entrada.nextInt();
            aluno.setIdade(idadeDigit);
            
            entrada.nextLine(); //Consumir quebra de linha
            
            
            System.out.println("Deseja inserir um aluno no banco de dados novamente? (s/n)");
            escolha = entrada.next().charAt(0);
            
            pilha.push(aluno);
        } 
        
        
        // Interator utilizado para correr a pilha, veja mais na documentação JAVA
        for (Iterator it = pilha.iterator(); it.hasNext();) 
        {
            Aluno c = (Aluno) it.next();
            System.out.println(c.getId() + " - " + c.getNome() + " - " + c.getIdade() + " - " + 
                    c.getCurso() + " - " + c.getFase());
        }
        
        
        System.out.println("Topo da pilha: " + pilha.peek().getNome());
        
        System.out.println("Removendo o aluno " + pilha.pop().getNome() + " da pilha");
        
    }

}
