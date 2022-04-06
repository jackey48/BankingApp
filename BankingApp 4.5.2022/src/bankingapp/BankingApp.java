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
    float debt;
    public Account(String name, float balance, float debt) {
        this.name = name;
        this.balance = balance;
        this.debt = debt;
    }
    public String getName(){
        return name;
    }
    public float getBalance(){
        return balance;
    }
}

public class BankingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account acc1 = new Account("Matthew", 1234, 0);
        
    new BankGUI(acc1.getName(), acc1.getBalance()).setVisible(true);
    acc1.balance = BankGUI.getBalance();
    }
    
}
