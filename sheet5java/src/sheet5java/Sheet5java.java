/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet5java;

import java.util.Scanner;

/**
 *
 * @author muhammad
 */
public class Sheet5java {

    public static void main(String[] args) {
     task5();
    }
    public static  boolean isVailed(double side1,double side2,double side3){
        return side1==(side2+side3)||side2==(side3+side1)||side3==(side2+side1);
    }
    public static double area(double side1,double side2,double side3){
    double s=(side1+side2+side3)/2;
    double area=Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);
    return area;
    }
    public static void task19(){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter sides respectivly ? \n");
        double side1=input.nextDouble();
        double side2=input.nextDouble();
        double side3=input.nextDouble();
        double calculatedArea;
        if(isVailed(side1, side2, side3)){
            calculatedArea=area(side1, side2, side3);
            System.out.println("Area is : "+calculatedArea);
        }
        else
            System.out.println("Error with sides values ! \n");
 
    }
    public static void displaySortedNumber(double num1,double num2,double num3){
    
        double max;
         double med;
          double min;
          
        if(num1>num2){
            if(num1>num3){
                max=num1;  
                if(num2>num3){
                 min=num3;
                    med=num2;}
                else{
                max=num1;
                med=num3;
                min=num2;
                }
            }
        }
        if(num2>num3){
            if(num2>num1){
                max=num2;  
                if(num1>num3){
                 min=num3;
                    med=num1;}
                else{
                max=num2;
                med=num3;
                min=num1;
                }
            }        
        } 
        
       if(num3>num1){
            if(num3>num2){
                max=num3;  
                if(num1>num2){
                    min=num2;
                    med=num1;}
                else{
                    max=num3;
                    med=num2;
                    min=num1;}                
            }
       }
        System.out.println("numbers in incresing :"+num3+" "+num2+" "+num1+" \n");
        
    }
    public static void task5(){
        System.out.println("Enter ur numbers ? ");
        Scanner input=new Scanner(System.in);
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        double num3=input.nextDouble();
        displaySortedNumber(num1, num2, num3);
    }
    
    
      public static boolean isPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        // if original and reverse of number is equal means
        // number is palindrome in Java
        
        return number == reverse;
    }

    
}
