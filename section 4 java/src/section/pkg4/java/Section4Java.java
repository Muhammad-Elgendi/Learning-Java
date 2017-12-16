/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section.pkg4.java;
import java.util.Scanner;
/**
 *
 * @author muhammad
 */
public class Section4Java {

    /**
     * //section
     * math.sin();
     * math.pow(base,power);
     * math.random(); 0-1 float or double return
     */
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        /* 1
       System.out.println("Enter the variable of equation : a\"float\" b\"float\" c\"int\" respictivly");
       float a =input.nextFloat();
       float b =input.nextFloat();
       int c =input.nextInt();
       double r1=(-1.0*b+Math.pow((b*b-4.0*a*c), 0.5))/(2.0*a);
       double r2=(-1.0*b-Math.pow((b*b-4.0*a*c), 0.5))/(2.0*a);
       System.out.println("R1 is :"+r1+"   R2 is :"+r2);
*/  
        /* 2
         System.out.println("the num : ");  
        int num=input.nextInt();
        if(num%5 ==0 && num%6 ==0)
          System.out.println("Divisable by 5 and 6");   
         if(num%5 ==0||num%5 ==0)
          System.out.println("Divisable by 5 or 6 ");
          if(num%5 == 0 ^ num%6 ==0)
          System.out.println("Divisable by 5 or 6 but not both"); 
*/
        System.out.println("RMB exchange rate : "); 
        float r=input.nextFloat();
        System.out.println("0 to convert to RMB or 1 to Dollars: ");
        int c=input.nextInt();
        System.out.println("Amount : ");  
        float a=input.nextFloat();
        if (c==0)        
        System.out.println("Amount : "+a+" RMB :"+(double)a/r);        
        
        if(c==1)
          System.out.println("Amount : "+a*r );            
        
        
   }    
}
