package model.entities;

import model.exceptions.DomainException;

public class Account {
    private int accountNumber;
    private String name;
    private Double balance;
    private Double limitWithdraw;
    public Account() {
    }
    public Account(int accountNumber, String name, Double balance, Double limitWithdraw) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.limitWithdraw = limitWithdraw;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getBalance() {
        return balance;
    }
    public Double getLimitWithdraw() {
        return limitWithdraw;
    }
    public void setLimitWithdraw(Double limitWithdraw) {
        this.limitWithdraw = limitWithdraw;
    }
    public void withdraw(double amount){
        if(limitWithdraw < amount){
            throw new DomainException("The amount exceeds whitdraw limit");
        }
        if(balance < amount){
            throw new DomainException("Not enough balance");
        }
        balance = balance - amount;
    }
    public String toString(){
        return "New balance: "
               + String.format("%.2f", balance);
    }


     
}
