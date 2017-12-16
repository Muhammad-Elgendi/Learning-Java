package bmi;
import java.util.Scanner;
/**
 * @Author  : Muhammad Abdalhammed Abdalraheem Elgendi
 * @Section : 9
 **/
public class BMI {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Hi user , Enter \'0\' to choose Kg/M \n"
                + "or \'1\' to choose Pound/IN : ");
        int choice=input.nextInt();
        System.out.println("Enter your weight : ");
        float weight=input.nextFloat();
        System.out.println("Enter your height : ");
        float height=input.nextFloat();        
        double bmi=0.0;
        if(choice==0){
            bmi=weight/(height*height);
        }
        if(choice==1){
            bmi=(weight*0.45359237)/((height*0.0254)*(0.0254*height));
        }
        if (bmi<18.5)
            System.out.println("Underweight & BMI : "+bmi);
        else if(bmi>=18.5 && bmi<25.0)
            System.out.println("Normal & BMI : "+bmi);  
        else if(bmi>=25.0 && bmi<30.0)
            System.out.println("Overweight & BMI : "+bmi);              
        else if(bmi>=30.0)
            System.out.println("Obese & BMI : "+bmi);    
        else
            System.out.println("Invaild values , try again");
    }
    
}