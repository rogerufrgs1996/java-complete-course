package applicattion;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        try{

            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int accountNumber = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("withdrawLimit: ");
            double limitWithdraw = sc.nextDouble();

            Account account = new Account(accountNumber, name, balance, limitWithdraw);
            
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

            System.out.println(account);
        }
        catch(DomainException e){
            System.out.println("WITHDRAW ERROR: "+ e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("UNSPECT ERROR: ");
        }
    sc.close();


    }
}