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

}
class CheckingAccount extends Account {
    float debt;
    public CheckingAccount((String name, float balance, float debt1){
        super(name, balance);
        debt = debt1;
    }
}

public class BankingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account acc1 = new Account("Matthew", 1234);
        BankGUI obj = new BankGUI(acc1.getName(), acc1.getBalance());
        obj.setVisible(true);
        acc1.balance = obj.balance;
    }
    
    
}
