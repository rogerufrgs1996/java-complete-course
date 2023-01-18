package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final Product[] vect = new Product[n];
        for(int i = 0; i<n ; i++){
            sc.nextInt();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }
        double sum = 0;
        for(int i = 0; i<n ; i++){
            sum = sum + vect[i].getPrice();
        }
        System.out.println("avg prices - >"+sum/n);
        sc.close();
        
        
    }
}
