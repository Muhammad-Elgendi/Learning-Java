
package section.pkg7.java;

import java.util.Scanner;

public class Section7Java {

    public static void main(String[] args) {
       displaypatt(7);
       // mat(3);
  /*     Scanner input=new Scanner(System.in);
    System.out.println("Enter ur n and s :");
    double s=input.nextDouble();
    double n=input.nextDouble();
        System.out.println(area(s,n));*/
    }
    
    
    public static double area( double s,double n) {
        double area=
             (double) (n*s*s)/(4.0*Math.tan(((double)(Math.PI)/n)));      
        
        return area;
    }
   public static void displaypatt(int limit){
      for(int r=1;r<limit;r++){
       for (int i2 = limit; i2 >r; i2--) {
           System.out.print(" ");
       }
       for (int i = r; i>0; i--) {
           System.out.print(i+""); 
       }
          System.out.println("");
   }   
   }
  /* public static void mat(int n){
   int z=(int)(Math.random()*10);
   if(z%2==0)
   z=1;
   else
       z=0;
       for (int x = 0; x < n; x++) {
             for(int i=1;i<n;i--){
            System.out.print(z);
   }
       }
 */
   }
   
   

