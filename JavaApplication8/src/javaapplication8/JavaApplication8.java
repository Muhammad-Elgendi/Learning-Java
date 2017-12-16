/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author muhammad
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum =0;
        int count=0;
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        for(int i=0;i<10;i++){
        int x=input.nextInt();
        sum+=x;
        count+=1;
        
        }
        System.out.println(sum/count);
    }
    
}
