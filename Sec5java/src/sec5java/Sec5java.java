/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sec5java;
import java.util.Scanner;
/**
 *
 * @author muhammad
 */
public class Sec5java {

    /**
     *  // 
     *   //0----0.9 Math.random *26
     *   //0-----< 26 +65
     *  //65-----<91
     */
    public static void main(String[] args) {
          Scanner input =new Scanner(System.in);
        /*  int small=input.nextInt();              
          int capital=small+32;
          char x=(char)capital;*/
         System.out.print("Enter ur grades gradually\n");
        int x=input.nextInt();
       /* boolean z;
        z=(x>=18);*/
/*        
        switch(z){
            case true:
                System.out.println("Elgable to vote");
                break;
            default:
                System.out.println("cann't to vote");*/
int y,z;
char grade='f';
  
y=input.nextInt();
z=input.nextInt();
double avg =(x+y+z/3)*(x+y+z)/100;
        if(avg >=90)
            grade='a';
          if(avg >=70.0&avg<90.0)
            grade='b';
          if(avg >=50.0&avg<70.0)
            grade='c';
          if(avg<50.0)
            grade='f';
          System.out.print(grade+"\n");
          
            System.out.print("Enter unit price" );
            int price =input.nextInt();
             System.out.print("Enter unit quantity" );
              int quantity =input.nextInt();
              int dis=0;
              if(quantity>=100&quantity<120){
                  dis=(10/100)*(quantity*price);
              }
             if(quantity>120){
                  dis=(15/100)*(quantity*price);
              } 
            int tot =quantity*price;
            int acc=tot-dis;
            System.out.println("tot "+tot+" after dis "+acc);
    }
}