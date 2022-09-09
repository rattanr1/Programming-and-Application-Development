/*
Exercise09_07.java (The Account class):

Design a class named Account that contains:
■ A private int data field named id for the account (default 0).
■ A private double data field named balance for the account (default 0).
■ A private double data field named annualInterestRate that stores the current 
interest rate (default 0). Assume that all accounts have the same interest rate.
■ A private Date data field named dateCreated that stores the date when the 
    account was created.

■ A no-arg constructor that creates a default account.
■ A constructor that creates an account with the specified id and initial balance.
■ The accessor and mutator methods for id, balance, and annualInterestRate.
■ The accessor method for dateCreated.
■ A method named getMonthlyInterestRate() that returns the monthly 
    interest rate.
■ A method named getMonthlyInterest() that returns the monthly interest.
■ A method named withdraw that withdraws a specified amount from the 
    account.
■ A method named deposit that deposits a specified amount to the account.

Write a test program that creates an Account object with an account ID of 1122, 
a balance of $20,000, and an annual interest rate of 4.5%. 

Use the withdraw method to withdraw $2,500, 
and use the deposit method to deposit $3,000, 

Print the balance, the monthly interest, and the date when this account was created.

By: Riyan Rattan
 */


package exercise09_07;

public class Exercise09_07 {
    public static void main(String[] args) {
        
        
//create an Account object given ID and Starting Balance
    Account account = new Account(1122, 20000);
    
//Display the starting info
    System.out.println("Account ID: " + account.getId());
    System.out.println("Account Balance: " + account.getBalance());
    System.out.println("Annual Interest Rate of 4.5%");
    System.out.println("Withdrawing $2,500");
    System.out.println("Depositing $3,000");
    
    
//call methods
account.setAnnualInterestRate(4.5);
account.withdraw(2500.0);
account.deposit(3000.0);
      
        
//Display results after transaction
    System.out.println("\n" + "Displaying updated info:");
    
    System.out.println("Account ID: " + account.getId());
    System.out.println("Account Balance: $" + account.getBalance());
    System.out.println("Monthly interest rate: " + account.getMonthlyInterestRate());
    System.out.println("Monthly Interest: " + account.getMonthlyInterest());
    System.out.println("Date Account Created: " + account.getDateCreated());


    }
}

// Define the Account Class with constructors
class Account {
    
//declare private data fields and default them to 0
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    
//stores the date when the account was created
    private java.util.Date dateCreated;
    
//no-argument constructor
    public Account() {
        dateCreated = new java.util.Date();
    }

//constructor that creates an account with the specified id and initial balance
    public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }

//the accessor method for id
    public int getId() {
        return this.id;
    }

//the accessor method for balance
    public double getBalance() {
        return this.balance;
    }

//the accessor method for annualInterestRate   
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

//the accessor method for dateCreated   
    public String getDateCreated() {
        return this.dateCreated.toString();
    }

 //the mutator method for id   
   public void setId(int id) {
        this.id = id;
    }

//the mutator method for balance    
    public void setBalance(double balance) {
        this.balance = balance;
    }

//the mutator method for annualInterestRate    
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

//method returns the monthly interest rate    
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12;
    }

//method that returns the monthly interest    
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

//method to withdraw a specified amount from the account    
    public void withdraw(double amount) {
        this.balance -= amount;
    }

//method that deposits a specified amount to the account    
    public void deposit(double amount) {
        this.balance += amount;
    }
}
