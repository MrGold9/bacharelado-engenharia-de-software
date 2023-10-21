package exercicios.for_while_vetores;


public class Exercicio22 {
//não terminado

    public static void main(String[] args) 
    {
        
        int nums[] = new int[1000];
        int soma = 0;
        double resultado;
        int cont = 0;
        int numeroAdd = 100;
        
        
        nums[cont] = numeroAdd;
        System.out.println(nums[cont]);
        
        System.out.println(nums[cont + 1]);
        numeroAdd++;
        nums[cont] = numeroAdd;
        
        System.out.println(nums[cont + 2]);
        numeroAdd++;
        nums[cont] = numeroAdd;
        
        /*while (cont < nums.length) 
        {
            
            nums[cont + 1] = numeroAdd;
            soma += nums[cont];
            cont++;
            numeroAdd++;
            
            System.out.println(nums[cont]);
        }*/
        
        
        //System.out.println(soma);
        
    }
    
}
