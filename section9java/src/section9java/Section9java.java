/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section9java;

import java.util.Scanner;

/**
 *
 * @author muhammad
 */
public class Section9java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic heren
        Scanner IScanner=new Scanner(System.in);
        System.out.println("Enter sides :");
        double s1=IScanner.nextDouble();
        double s2=IScanner.nextDouble();
        double s3=IScanner.nextDouble();
        Trangle tesTrangle=new Trangle(s1,s2,s3);
        System.out.println("the area "+tesTrangle.getArea()+" parmeter : "+tesTrangle.getParemeter()+" color : "+tesTrangle.color+"\n"+tesTrangle.toString());
    }
    
}


class GeometdricObject{
String color="blue";

public GeometdricObject(String newcolor) {
    color=newcolor;
}

public GeometdricObject() {

}
}
class Trangle extends GeometdricObject{
public double side1;
public double side2;
public double side3;
public Trangle(){
side1=side2=side3=1.0;

}
public Trangle(double s1,double s2,double s3){
side1=s1;
side2=s2;
side3=s3;
}
public double getArea(){
return Math.sqrt(side1*side2*side3);

}
public double getParemeter(){
return side1+side2+side3;
}
@Override
public String toString(){
return "Triangle: side1 = " + side1 + " side2 = " + side2 +
" side3 = " + side3;
}


}