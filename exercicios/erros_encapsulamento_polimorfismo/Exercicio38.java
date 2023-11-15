package exercicios.erros_encapsulamento_polimorfismo;


public class Exercicio38 {


    public static void main(String[] args) 
    {
        
        int numeros[] = new int[10];
        numeros[0] = 0;
        numeros[1] = 1;
        numeros[2] = 2;
        numeros[3] = 3;
        numeros[4] = 4;
        numeros[5] = 5;
        numeros[6] = 6;
        numeros[7] = 7;
        numeros[8] = 8;
        numeros[9] = 9;
        
        try 
        {
            System.out.println("tentando mostrar índice 10:" + numeros[10]); //vai dar erro, não existe índice 10.   
        } 
        catch (IndexOutOfBoundsException erro) 
        {
            System.out.println("O índice 10 não existe!");
        }
        finally
        {
            for (int i = 0; i < numeros.length; i++) 
            {
                System.out.println("O valor do índice " + "[" + i + "]" + " é: " + numeros[i]);
            }
        }
        
    }

}
