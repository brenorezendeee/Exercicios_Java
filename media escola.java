/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variaveis;

import java.util.Scanner;

/**
 *
 * @author Breno Rezende
 */
public class Main {
public static void main(String[] args) {
    
    
    
    
    String nome = "Breno"; 
    int  idade = 20;
    double media;
    boolean estaAprovado ;

        Scanner in = new Scanner(System.in);
        media = in.nextDouble();


            System.out.println("Nome: "+nome);
            System.out.println("idade: "+idade);
            System.out.println("Média: "+media);


        if(media < 0 || media >10){
            System.out.println("Média incorreta");
            estaAprovado = false;
        }

        else if(media < 3){
            System.out.println("Reprovado, sem exame");
            estaAprovado = false;
            }
        else if(media < 6){
            System.out.println("Rec");
            estaAprovado = false;
            }
        else if(media <= 10){
            System.out.println("passado");
            estaAprovado = true;
            }






    }   



    
}
