package com.mufidbrown.atm.entity;

public class CreditCard {
    // Instance Variables / contoh variable
    private String number;
    private String name;
    private String bank;
    private double balance;
    private int limit;

    // Constuctor
    public CreditCard(String no, String nm, String bk, double bal, int lim) {
        number = no;
        name = nm;
        bank = bk;
        balance = bal;
        limit = lim;
    }

    // Accessor methods:
    public String getNumber(){return number;}
    public String getName(){return name;}
    public String getBank(){return bank;}
    public double getBalance(){return balance;}
    public int getLimit(){return limit;}

    //Action methods:
    public boolean chargelt(double price){ //make a charge
        if (price + balance > (double) limit)
            return false; // There is not enough money left to charge it
    balance += price;
    return true; // The charge goes through in this case
    }

    public void makePayment(double payment) { // make a payment
        balance -= payment;
    }
    public static void printCard(CreditCard c){ //print a cards information
        System.out.println("Number = " + c.getNumber());
        System.out.println("Name = " + c.getName());
        System.out.println("Bank = " + c.getBank());
        System.out.println("Balance = " + c.getBalance()); // implicit cast
        System.out.println("Limit = " + c.getLimit()); // implicit cast


    }





}
