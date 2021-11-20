/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vetor;


public class Main {

    
    public static void main(String[] args) {
         int menor, maior;
    
        if(args.length != 5){
            System.out.println("Número incorreto de entradas");
            System.exit(0);
        }

        //elementos = {5,4,3,1,2};
        menor = Integer.parseInt(args[0]);
        maior = Integer.parseInt(args[0]);
        for(int i = 1; i < 5; i++){
           if(Integer.parseInt(args[i]) < menor) menor = Integer.parseInt(args[i]);
            if(Integer.parseInt(args[i]) > maior) maior = Integer.parseInt(args[i]);
        }
        System.out.printf("O menor valor é %d enquanto o maior valor é %d.%n",menor, maior);
       
      //%d = inteiro
      //%f = ponto flutuante (float/double)
      //%s = string
}

    }
    

