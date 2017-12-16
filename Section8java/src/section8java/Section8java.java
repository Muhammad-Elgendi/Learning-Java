/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section8java;

import java.util.Random;
import javax.swing.Spring;

/**
 *
 * @author muhammad
 */
public class Section8java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle reg=new Rectangle();
        reg.height=20.0;
        reg.width=2.0;
        Rectangle reg1=new Rectangle();
        reg1.height=20.0;
        reg1.width=21.0;
        System.out.println(reg.getArea());
        System.out.println(reg.getParameter());
        System.out.println(reg1.getArea());
        System.out.println(reg1.getParameter());
        Stock stockTest = new Stock("$","Dollar");
        stockTest.closingPrice=15;
        stockTest.currentPrice=16;
        System.out.println("the Symbol "+stockTest.symbol+"the name is "+stockTest.name+"change is price "+stockTest.getChangePrice());
        Random rand=new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(rand.nextInt(100));   
        }
        
                
        
    }
    
}
class Rectangle{
double width=1;
double height=1;
public double getArea(){
    return (width*height);
}
public double getParameter(){
    return (width+height)*2;
}

}

class Stock{
String symbol;
String name;
double closingPrice;
double currentPrice;
public Stock(String symbol,String name){
this.symbol=symbol;
this.name=name;
}
public double getChangePrice(){

return (closingPrice-closingPrice)*100;
}


}
