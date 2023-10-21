/* Descreva como descobrir a moeda falsa em um grupo de cinco moedas fazendo uso
de uma balança analítica (sabe-se que a moeda falsa é mais leve que as outras)
com o menor número de pesagens possível. Lembre-se de que sua descrição deve
resolver o problema para qualquer situação*/

package desafios;

import java.util.Random;

public class MoedaFalsa {

    public static void main(String[] args) 
    {
        Random gerador = new Random();
        int moedaFalsa = gerador.nextInt(5) + 1;
        int moedaRand = gerador.nextInt(5) + 1;
        
        int moedaSelec;
        
        // Os números representam o peso fictício da moeda
        int moedaUm = 10, moedaDois = 10, moedaTres = 10, moedaQuatro = 10, 
                moedaCinco = 10;
        
        // A moeda randomicamente selecionada no método Random reduz seu peso,
        //logo, será a moeda falsa
        if (moedaFalsa == 1) 
        {
            moedaUm = 9 ;
        }
        else if (moedaFalsa == 2) 
        {
            moedaDois = 9;
        }
        else if (moedaFalsa == 3) 
        {
            moedaTres = 9;
        }
        else if (moedaFalsa == 4) 
        {
            moedaQuatro = 9;
        }
        else if (moedaFalsa == 5) 
        {
            moedaCinco = 9;
        }
        
        //Moeda randomica
        if (moedaRand == 1) 
        {
            moedaSelec = 9;
        }
        else if (moedaRand == 2) 
        {
            moedaSelec = 9;
        }
        else if (moedaRand == 3) 
        {
            moedaSelec = 9;
        }
        else if (moedaRand == 4) 
        {
            moedaSelec = 9;
        }
        else if (moedaRand == 5) 
        {
            moedaSelec = 9;
        }
        
        if (moedaRand < moedaUm && moedaRand < moedaDois && moedaRand < moedaTres 
                && moedaRand < moedaQuatro && moedaRand < moedaCinco) 
        {
            System.out.println("A moeda " + moedaRand + " é a moeda falsa");
        }
        
        System.out.println(moedaFalsa);
        
        System.out.println(moedaUm + "\n" + moedaDois + "\n" + moedaTres + "\n"
                + moedaQuatro + "\n" + moedaCinco);
    }
    
}
