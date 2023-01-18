package aplicattion;
import java.util.Locale;
import java.util.Scanner;

import entities.Produt;

public class App {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Produt[] vect = new Produt[n];
        for (int i = 0; i<n ; i++){
            sc.nextInt();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Produt(name, price);
        }
        double sum = 0;
        for (int i =0; i<n ; i++){
            sum = sum + vect[i].getPrice();

        }
        System.out.printf("avg price ->"+sum);
        sc.close();

    }
}
