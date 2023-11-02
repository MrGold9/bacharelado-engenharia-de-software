package exercicios.pesquisa_linear_matrizes;


import java.util.Scanner;

public class Exercicio26 {


    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        double matriz[][] = new double[3][3];
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        String amostraMatriz = "";
        String elemMaioresMedia = "";
        int somaPrimeiraColuna = 0, somaSegundaColuna = 0, somaTerceiraColuna = 0;
        int somaPrimeiraLinha = 0, somaSegundaLinha = 0, somaTerceiraLinha = 0;
        int somaTotalMatriz = 0, mediaMatriz = 0;
        double maiorElemento = 0, menorElemento = 0;
        int posicaoLinhaMaiorElem = 0, posicaoColunaMaiorElem = 0;
        int posicaoLinhaMenorElem = 0, posicaoColunaMenorElem = 0;
        
            
        
        //Inserir valores da matriz
        for (int i = 0; i < 3; i++) 
        {  
            for (int j = 0; j < 3; j++) 
            {
                System.out.println("Insira o valor da linha " + i + " na coluna " + j);
                matriz[i][j] = entrada.nextDouble();   
            }   
        }
        menorElemento = matriz[0][0];
        
        
        //Mostrando toda a matriz
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                amostraMatriz += matriz[i][j] + "   ";
            }
            amostraMatriz += "\n";
        }
        System.out.println(amostraMatriz);
        
        
        //Percorrendo e somando valores da primeira coluna
        for (int i = 0; i < 3; i++) 
        {
            somaPrimeiraColuna += matriz[i][0];
        }
        System.out.println("A soma de todos os elementos da primeira coluna �: " + somaPrimeiraColuna);
        
        
        //Percorrendo e somando valores de cada coluna
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                //Somar elementos da segunda coluna
                if (j == 1) 
                {
                    somaSegundaColuna += matriz[i][j];
                }
                
                //Somar elementos da terceira coluna
                if (j == 2) 
                {
                    somaTerceiraColuna += matriz[i][j];
                }
            }
        }
        System.out.println("Da segunda coluna �: " + somaSegundaColuna + 
                "\nDa terceira coluna �: " + somaTerceiraColuna);
        
        
        //Percorrendo e somando valores de cada linha
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                //Somar elementos da primeira linha
                if (i == 0) 
                {
                    somaPrimeiraLinha += matriz[i][j];
                }
                
                //Somar elementos da segunda linha
                if (i == 1) 
                {
                    somaSegundaLinha += matriz[i][j];
                }
                
                //Somar elementos da terceira linha
                if (i == 2) 
                {
                    somaTerceiraLinha += matriz[i][j];
                }
            }
        }
        System.out.println("A soma de todos os elementos da primeira linha �: " + somaPrimeiraLinha
                + "\nDa segunda linha �: " + somaSegundaLinha + 
                "\nDa terceira linha �: " + somaTerceiraLinha);
        
        
        somaTotalMatriz = somaPrimeiraColuna + somaSegundaColuna + somaTerceiraColuna;
        System.out.println("A soma de todos os valores da matriz �: " + somaTotalMatriz);
        
        mediaMatriz = somaTotalMatriz / (linhas * colunas);
        System.out.println("A m�dia dos elementos da matriz �: " + mediaMatriz);
        
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                //Juntando os elementos maiores que a m�dia
                if (matriz[i][j] > mediaMatriz) 
                {
                    elemMaioresMedia += matriz[i][j] + " ";
                }
                
                //Identificando o maior n�mero da matriz e armazenando a posi��o
                if (matriz[i][j] > maiorElemento) 
                {
                    maiorElemento = matriz[i][j];
                    posicaoColunaMaiorElem = j;
                    posicaoLinhaMaiorElem = i;
                }
                
                //Identificando o menor n�mero da matriz e armazenando a posi��o
                if (matriz[i][j] < menorElemento) 
                {
                    menorElemento = matriz[i][j];
                    posicaoColunaMenorElem = j;
                    posicaoLinhaMenorElem = i;
                }
            }
        }
        System.out.println("Os elementos maiores que a m�dia s�o: " + elemMaioresMedia);
        
        System.out.println("O maior elemento da matriz � o n�mero " + maiorElemento + 
                " que se encontra na coluna " + (posicaoColunaMaiorElem + 1) + " na linha " + (posicaoLinhaMaiorElem + 1));
        
        System.out.println("O menor elemento da matriz � o n�mero " + menorElemento + 
                " que se encontra na coluna " + (posicaoColunaMenorElem + 1) + " na linha " + (posicaoLinhaMenorElem + 1));
        
    }
    
}
