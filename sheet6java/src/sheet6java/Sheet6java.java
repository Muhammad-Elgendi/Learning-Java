package sheet6java;

import java.time.Instant;
import java.util.Date;

public class Sheet6java {

    public static void main(String[] args) {
        Account tesAccount =new Account(1122,20000);
        tesAccount.changinterestRate(4.5);
        tesAccount.withdraw(2500.0);
        tesAccount.deposit(3000);
        System.out.println("balance is : "+tesAccount.getbalance()+" interestRate is : "+tesAccount.getMonthlyInterestRate()+" date : "+tesAccount.getDate());
    }    
}

class Account{
private int id;
private double balance;
private double anualintrestrate;
private final Date dataCreated;
public Account(){
id=0;
balance=0;
anualintrestrate=0;
dataCreated=Date.from(Instant.MIN);
}
public Account(int newid,double newbalance){
id=newid;
balance=newbalance;
anualintrestrate=0;
dataCreated=Date.from(Instant.MIN);
}
public void changid(int newid){
id=newid;
}
public void changbalance(double newbalance){
balance=newbalance;
}
public void changinterestRate(double newinterestrate){
anualintrestrate=newinterestrate;
}
public int getid(){
return id;
}
public double getbalance(){
return balance;
}
public double getinterestRate(){
return anualintrestrate/100;
}
public Date getDate(){
return dataCreated;
}
public double getMonthlyInterestRate(){
return anualintrestrate/12;
}
public double getMonthlyInterest(){
return balance * this.getMonthlyInterestRate();
}
public double withdraw(double amount){
    balance-=amount;
return balance;
}
public double deposit(double amount){
    balance+=amount;
return balance;
}



}

