package applicattion;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalEntity;
import entities.NaturalPerson;
import entities.Person;

public class Program{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i =1; i<=n; i++){
            System.out.println("Tax payer #"+i+" data:");
            System.out.print("Individual or company (i/c)");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            Double annualIncome = sc.nextDouble();
            if (ch == 'i'){
                System.out.print("Health expenditures : ");
                Double healthExpenses = sc.nextDouble();
                persons.add(new NaturalPerson(name, annualIncome, healthExpenses));
            }
            else{
                System.out.print("Number of employees : ");
                int employees = sc.nextInt();
                persons.add(new LegalEntity(name, annualIncome, employees));
            }
        }
        double sum =0;
        for (Person p : persons){
            sum += p.tax();
            System.out.println(p);
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ "+ String.format("%.2f", sum));

        

        sc.close();
    }
}