/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package section10java;

import java.util.ArrayList;

/**
 *
 * @author muhammad
 */
public class Section10java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Double> a=new ArrayList();
        a.add(10.00);
        a.add(20.00);
        a.add(30.00);
        a.add(40.00);
        a.add(50.00);
        System.out.println(arrlist(a));
        }
    
     public static Double arrlist(ArrayList<Double>  a){
        if(a.size()!=0){
        double max=a.get(0);
        for(int i =0;i<a.size();i++){
        if(a.get(i)>max)
        max=a.get(i);
       
    }
         return max;
        }
        else
            return null;
    
     }
}


