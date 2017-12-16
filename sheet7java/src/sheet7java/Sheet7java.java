/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheet7java;

import java.time.Instant;
import java.util.Date;
import javafx.animation.Animation;

/**
 *
 * @author muhammad
 */
public class Sheet7java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student newStudent =new Student("angry","muhammed stu","Fake one","00000","dddd");
      Person newPerson =new Person("muhammed","dddd","dddd","dddd");
        Employee neweEmployee= new Employee("",10.0,"muhammed emp","Fake one","00000","dddd");
     ////   Staff newStaff =new Staff();
     //   Faculty newFaculty =new Faculty(10.0, 1.0);
        System.out.println("stu "+newStudent.toString() +"\nperson "+newPerson.toString() +"\nEmployee "+neweEmployee.toString()+"\nFaculty "                
                //+newFaculty.toString()+"\nStaff "+newStaff.toString()
                );
    }
    
}
class Person {
String name,address, phoneNumber,emailAddress;
public Person(String nam,String addrs,String phon,String email){
name=nam;
address=addrs;
phoneNumber=phon;
emailAddress=email;
}
    @Override
    public String toString() {
        return "Person class "+this.name; //To change body of generated methods, choose Tools | Templates.
    }

}
class Student  extends Person  {
final String STATUS ;

    public Student(String status,String nam,String addrs,String phon,String email) {
        super(nam,addrs,phon,email);
       STATUS=status;
    }

    @Override
    public String toString() {
          return "Person class "+this.name;//To change body of generated methods, choose Tools | Templates.
    }

}
class Employee extends Person {
String office;
double salary;
public java.util.Date dateCreated; 



    public Employee(String newoffice ,double sal,String nam,String addrs,String phon,String email) {
         super(nam,addrs,phon,email);
        office=newoffice;
        salary=sal;
        
    }

    @Override
    public String toString() {
         return "Person class "+this.name; //To change body of generated methods, choose Tools | Templates.
    }


}
class Faculty extends Employee {
double hours;
double rank;

    public Faculty(double newhour,double newrank,String newoffice ,double sal,String nam,String addrs,String phon,String email) {
       super(newoffice ,sal,nam,addrs,phon,email);
    ////   String office=super.office;
    //   double salary=super.salary;
    // super(office,salary);
        hours=newhour;
        rank=newrank;
        
    }

    @Override
    public String toString() {
  return "Person class "+this.name;
    }



}
class Staff  extends Employee{
String title;
    public Staff(String title,String newoffice ,double sal,String nam,String addrs,String phon,String email) {
        super(newoffice ,sal,nam,addrs,phon,email);
        this.title=title;
    }
    


    @Override
    public String toString() {
  return "Person class "+this.name;
    }

}







