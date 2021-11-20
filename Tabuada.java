/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabuada;

/**
 *
 * @author Breno Rezende
 */
public class Tabuada {

    
    public static void main(String[] args) {
       int i,j;
       
       for(i = 0;i <= 10;i = i+1){
           for(j=0;j<=10;j++){
           System.out.println(i+" x " +j+" = "+(i*j); 
           }
       }
       
       System.out.println("Cabreis");
    }
    
}
