/*
 Aqui vamos simular a persist�ncia de dados.
 */
package exercicios.interfaces_graficas.Exercicio40.DAO;

import exercicios.interfaces_graficas.Exercicio40.Model.Aluno;
import java.util.*;

public class AlunoDAO {

    public static ArrayList<Aluno> MinhaLista = new ArrayList<Aluno>();

    public static int maiorID() {
        
        int maiorID = 0;
        for (int i = 0; i < MinhaLista.size(); i++) {
            if (MinhaLista.get(i).getId() > maiorID) {
                maiorID = MinhaLista.get(i).getId();
            }
        }
        return maiorID;
        
        
    }

}
