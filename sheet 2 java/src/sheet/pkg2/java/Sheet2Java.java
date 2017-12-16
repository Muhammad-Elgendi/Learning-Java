package sheet.pkg2.java;
import java.util.Scanner;
/**
 * @author muhammad
 **/
public class Sheet2Java {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        // answer 1
        System.out.println("Enter two numbers respectivly :");
        int f= input.nextInt();
        int s= input.nextInt();
        if (f>s)
             System.out.println(f+" Is larger");
        if (s>f)
             System.out.println(s+" Is larger");
        if (s==f)
             System.out.println("Equail numbers");
        // answer 2
        System.out.println("Enter diameter :");
        int d= input.nextInt();
        float pi= 3.14159f;
        System.out.println("Area is : "+pi*d*d);
        // answer 3
        System.out.println("Enter the number :");
        int num= input.nextInt();
        if(num%2==0)
             System.out.println("Even number");
        else
            System.out.println("Odd number");
        // answer 4
        System.out.println("Enter A number");
        int cx=input.nextInt();
        if(cx<1000 &&cx>1)
        System.out.println(" number"+cx+"between 1-1000:true");
        if(cx==2000)
        System.out.println(" number"+cx+"between 1-1000:false");   
         // answer 5
        System.out.println("Enter A length and radius respectivly :");
        int len=input.nextInt();
        float radius=input.nextFloat(); 
        System.out.println(" Area is "+(radius*radius*pi)+" Valume is "+(radius*radius*pi*len)); 
        // answer 6
        System.out.println(" Enter number 1~1000 ?");        
        int number=input.nextInt();
        if(number<1000){
        int x= number%10;
        int z=(number /10) %10;
        int xx=(number /100) %10;
        System.out.println(" Equals : " +(x+z+xx));
        }
        else 
        System.out.println("INVAILD !");
        // answer 7
        System.out.println(" Enter investment amount, annual interest rate, and number of years :");        
        int inVest=input.nextInt();
        float rate=input.nextFloat();
        int years=input.nextInt();
         System.out.println("futureInvestmentValue :"+(inVest*Math.pow((1+rate),(years*12))));
    }
    
}
