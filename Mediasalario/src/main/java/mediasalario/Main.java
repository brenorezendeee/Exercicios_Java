
package mediasalario;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {   
           Scanner leitor = new Scanner (System.in);
    int s1,s2,s3,soma;  
    
    
         System.out.println("Salario primeiro funcionario:");
         s1 = leitor.nextInt();
         
         System.out.println("Salario Segundo funcionario:");
         s2 = leitor.nextInt();
         
         System.out.println("Salario Terceiro funcionario:");
         s3 = leitor.nextInt();
         
         soma = (s1+s2+s3)/3;
        
         System.out.println("Média é:" +soma);
         
         
           
           
           
           
           
     }
}
