/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankingapp;

/**
 *
 * @author msull1
 */

class Account {
    String name;
    float balance;
    public Account(String name, float balance) {
        this.name = name;
        this.balance = balance;
        
    }
    public String getName(){
        return name;
    }
    public float getBalance(){
        return balance;
    }
    public void round() {
        balance = Math.round(balance * 100.0f) / 100.0f;
    }
    public float Interest(float value, float percent) {
        return (value * percent);
    }
    public boolean withdrawl(float withdrawl){
        if (balance >= withdrawl){
            balance -= withdrawl;
            round();
            return false;
        }
        else{
            return true;
        }
    }

}
class CheckingAccount extends Account {
    float debt;
    public CheckingAccount(String name, float balance, float debt){
        super(name, balance);
        this.debt = debt;
    }
        
    public void CheckDebt(float BoxText){
        if (debt > 0) {
            debt -= BoxText;
           if (debt < 0) {
                balance -= debt;
                debt = 0;
            }
        }
        else if (debt <= 0) {
            balance += BoxText;
            round();
        }
    }
    public void AddLoan(float BoxText){
        debt += BoxText;
        balance += BoxText;
        round();
    }
}

class SavingsAccount extends Account {
    int limit;
    public SavingsAccount(String name, float balance, int limit){
        super(name, balance);
        this.limit = limit;
    }
}


public class BankingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account acc1 = new Account("Matthew", 1234);
        BankGUI obj = new BankGUI(acc1.getName(), acc1.getBalance(), 0f);
        obj.setVisible(true);
    }
    
    
}
