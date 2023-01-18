package projeto;

import java.util.Locale;
import java.util.Scanner;

import employee.Employer;

public class App {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employer e = new Employer();
        System.out.println("Enter employee name:");
        e.name=sc.nextLine();
        System.out.println("Enter employee gross salary:");
        e.salary=sc.nextDouble();
        System.out.println("Enter tax:");
        e.tax = sc.nextDouble();
        System.out.println("Enter percentage:");
        double percent = sc.nextDouble();
        System.out.println("Gross salary: "+e.netSalary());
        System.out.println("Increase salary: "+e.increaseSalary(percent));

        sc.close();

        
    }
}
