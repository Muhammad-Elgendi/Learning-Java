package section6;

import java.awt.font.TextAttribute;
import java.util.Scanner;
public class Section6 {

 
    public static void main(String[] args) {
// Task 1
        for(int i=1;i<11;i++){
            System.out.println(i+"    "+i*1.6);
         }
// task 2
        System.out.println("Killogram    Pound  |  Pounds     Killograms");
        int z=20;
        int n=1;
        while(z<=515&&n<=199){
            System.out.println(n+"    "+n*2.2+"    |"+z+"    "+z*0.45);
            z+=5;
            n+=2;        
        }
//Task 3
/*Scanner input =new Scanner(System.in);
int yu=0;
int max=0;
String mname="";
        while (yu<5) {            
            System.out.println("Enter name the student gardes");  
            String name=input.next();
            int grade=input.nextInt();
            yu++;
            if(grade>max)
                max=grade;
                mname=name;
            
        }
        System.out.println(mname);*/

//task 4
/*
int number=100;
while(number<200){
int inner=0;
while(inner<10){

    if (number%6==0^number%5==0) {
        System.out.print(number);
        
        
    }
    
    inner++;
    number++;
    
}
    System.out.println(" ");
     number++;
}*/

for(int r=1;r<=7;r++){

    for(int s=7;s>=r;s--)
        System.out.print(" ");
    for(int l=r;l>=2;l--)
        System.out.print(l);
    for(int ri=1;ri<=r;ri++)
          System.out.print(ri);
    System.out.println(" ");
}
for(int r=6;r>=1;r--){

    for(int s=7;s>=r;s--)
        System.out.print(" ");
    for(int l=r;l>=2;l--)
        System.out.print(l);
    for(int ri=1;ri<=r;ri++)
          System.out.print(ri);
    System.out.println(" ");
}

    }
    
}
