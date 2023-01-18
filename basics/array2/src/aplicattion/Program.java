package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product[] vect = new Product[n];
        for (int i = 0; i < n; i++) {
            System.out.print("digite nome produto");
            String name = sc.next();
            System.out.print("digite preco produto");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + vect[i].getPrice();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(vect[i].getName() + "->" + vect[i].getPrice());
        }
        System.out.println(sum / n);
        sc.close();

    }
}
