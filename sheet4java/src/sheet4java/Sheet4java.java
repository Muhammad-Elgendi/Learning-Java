/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet4java;

import java.util.Scanner;

/**
 *
 * @author muhammad
 */
public class Sheet4java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        //answer 1
        int chr=0;
        for(int i=1;i<14;i++){
            
            for(int x=1;x<11;x++)
            {
                if(chr+x==122)
                    break;
               System.out.print((char)(chr+x)+" ");
            }
        chr+=10;
        System.out.println(" ");
        }
*/
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        for (int i=0;i<num;i++){
         //  num1 %=10;
           num/=10;
        
        }
        
    }
    
}
